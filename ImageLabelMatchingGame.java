package game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class ImageLabelMatchingGame extends JFrame {

    private List<ImageLabelPair> imageLabelPairs;
    private int currentIndex;
    private JButton playAgainButton;
    private JButton exitButton;
    private JLabel imageLabel;
    private JComboBox<String> labelComboBox;
    private JButton nextButton;
    private JLabel scoreLabel;
    private int score = 0;

    public ImageLabelMatchingGame() {
        super("Image Label Matching Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocationRelativeTo(null);

        imageLabelPairs = loadImagesAndLabels();
        Collections.shuffle(imageLabelPairs);
        currentIndex = 0;

        imageLabel = new JLabel();
        labelComboBox = new JComboBox<>(getShuffledLabels());
        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkAnswer();
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
                    e1.printStackTrace();
                }
                showNextPair();
            }
        });


        setLayout(new GridBagLayout());


        playAgainButton = new JButton("Play Again");
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        GridBagConstraints exitButtonGbc = new GridBagConstraints();
        exitButtonGbc.gridx = 1;
        exitButtonGbc.gridy = 4;
        exitButtonGbc.fill = GridBagConstraints.HORIZONTAL;
        exitButton.setVisible(false);
        add(exitButton, exitButtonGbc);

        GridBagConstraints playAgainButtonGbc = new GridBagConstraints();
        playAgainButtonGbc.gridx = 0;
        playAgainButtonGbc.gridy = 4;
        playAgainButtonGbc.fill = GridBagConstraints.HORIZONTAL;
        playAgainButton.setVisible(false);
        add(playAgainButton, playAgainButtonGbc);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        add(imageLabel, gbc);

        GridBagConstraints comboGbc = new GridBagConstraints();
        comboGbc.gridx = 0;
        comboGbc.gridy = 1;
        comboGbc.weightx = 1.0;
        comboGbc.fill = GridBagConstraints.HORIZONTAL;

        add(labelComboBox, comboGbc);

        GridBagConstraints buttonGbc = new GridBagConstraints();
        buttonGbc.gridx = 1;
        buttonGbc.gridy = 1;
        buttonGbc.fill = GridBagConstraints.HORIZONTAL;

        add(nextButton, buttonGbc);

        scoreLabel = new JLabel("Score 0", SwingConstants.RIGHT);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        GridBagConstraints scoreLabelGbc = new GridBagConstraints();
        scoreLabelGbc.gridx = 1;
        scoreLabelGbc.gridy = 0;
        scoreLabelGbc.anchor = GridBagConstraints.NORTHEAST; // Align to the top-right
        scoreLabelGbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        add(scoreLabel, scoreLabelGbc);


        showNextPair();
    }

    private void resetGame() {
        score = 0;
        updateScoreLabel();
        Collections.shuffle(imageLabelPairs);
        currentIndex = 0;
        showNextPair();
        playAgainButton.setVisible(false);
        exitButton.setVisible(false);

    }

    private void showNextPair() {
        if (currentIndex < imageLabelPairs.size()) {

            //changed to be able to resize image
            ImageLabelPair pair = imageLabelPairs.get(currentIndex);
            ImageIcon originalIcon = new ImageIcon(pair.getImagePath());

            Image scaledImage = originalIcon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);

            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            imageLabel.setIcon(scaledIcon);
            currentIndex++;
            labelComboBox.setModel(new DefaultComboBoxModel<>(getShuffledLabels()));


        } else {
            //JOptionPane.showMessageDialog(this, "Game Over! You've completed all pairs.");

            //display score
            JOptionPane.showMessageDialog(this, "Game Over! \nYour final score is: " + score);
            //add play again button.
            playAgainButton.setVisible(true);
            exitButton.setVisible(true);
            //System.exit(0);
        }
    }

    private void checkAnswer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String selectedLabel = (String) labelComboBox.getSelectedItem();
        ImageLabelPair currentPair = imageLabelPairs.get(currentIndex - 1);
        String correctLabel = removeExtension(new File(currentPair.getLabel()).getName());

        String correct_audio = "/Users/dylan/IdeaProjects/MugShotGameJava/sounds/chime.wav";
        AudioInputStream audioInputStream1 = AudioSystem.getAudioInputStream(new File(correct_audio));
        Clip correct_clip = AudioSystem.getClip();
        correct_clip.open(audioInputStream1);

        String incorrect_audio = "/Users/dylan/IdeaProjects/MugShotGameJava/sounds/fade_x.wav";
        AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(new File(incorrect_audio));
        Clip incorrect_clip = AudioSystem.getClip();
        incorrect_clip.open(audioInputStream2);

        if (selectedLabel.equals(correctLabel)) {
            correct_clip.setFramePosition(0);
            correct_clip.start();
            JOptionPane.showMessageDialog(this, "Correct!");
            score++;
            updateScoreLabel();

        } else {
            incorrect_clip.setFramePosition(0);
            incorrect_clip.start();
            JOptionPane.showMessageDialog(this, "Incorrect! The correct answer is: " + correctLabel);
        }
    }

    private void updateScoreLabel() {
        scoreLabel.setText("Score: " + score);
    }

    private List<ImageLabelPair> loadImagesAndLabels() {
        List<ImageLabelPair> pairs = new ArrayList<>();
        File imageFolder = new File("/Users/dylan/IdeaProjects/MugShotGameJava/images");
        File labelFolder = new File("/Users/dylan/IdeaProjects/MugShotGameJava/labels");

        File[] imageFiles = imageFolder.listFiles();
        File[] labelFiles = labelFolder.listFiles();

        if (imageFiles != null && labelFiles != null) {
            for (File imageFile : imageFiles) {
                String imageName = imageFile.getName();
                String labelName = imageName.replaceFirst("[.][^.]+$", ".txt");
                File labelFile = new File(labelFolder, labelName);

                if (labelFile.exists()) {
                    String labelContent = readLabelContent(labelFile);
                    pairs.add(new ImageLabelPair(imageFile.getPath(), labelContent));
                }
            }
        }

        return pairs;
    }

    private String readLabelContent(File labelFile) {
        StringBuilder content = new StringBuilder();
        try {
            Scanner scanner = new Scanner(labelFile);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content.toString();
    }


    private String[] getShuffledLabels() {
        List<String> labels = new ArrayList<>();

        // Check if currentIndex is greater than 0 to avoid IndexOutOfBoundsException
        ImageLabelPair correctPair = (currentIndex > 0) ? imageLabelPairs.get(currentIndex - 1) : imageLabelPairs.get(currentIndex);

        String correctLabel = removeExtension(new File(correctPair.getLabel()).getName());

        // Add the correct label to the options
        labels.add(correctLabel);

        // Add 3 random incorrect labels

        while(labels.size() < 4)
        {
            ImageLabelPair randomPair = getRandomPairExcluding(correctPair);

            String check = removeExtension(new File(randomPair.getLabel()).getName());
            if(!labels.contains(check))
            {
                labels.add(check);
            }


        }

        // Shuffle the list of labels
        Collections.shuffle(labels);

        return labels.toArray(new String[0]);
    }








    private ImageLabelPair getRandomPairExcluding(ImageLabelPair excludePair) {
        List<ImageLabelPair> options = new ArrayList<>(imageLabelPairs);
        options.remove(excludePair);
        Collections.shuffle(options);
        return options.get(0);
    }

    private String removeExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex != -1) {
            return fileName.substring(0, lastDotIndex);
        } else {
            return fileName;
        }
    }
}

