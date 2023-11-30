package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    public MainMenu() {

        //Set Window Size
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Main Menu");
            frame.setSize(1280, 720);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension buttonSize = new Dimension(300, 350);
            frame.setLocationRelativeTo(null);

            //Create Panel with a Border Layout
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            //Create Buttons and set Sizes
            JButton startButton = new JButton("Start a Game");
            startButton.setPreferredSize(buttonSize);
            JButton exitButton = new JButton("Exit");
            exitButton.setPreferredSize(buttonSize);

            //Listener for Start Button
            startButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new ImageLabelMatchingGame().setVisible(true);
                }
            });
            //Listener for Quit Button
            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            // Add buttons to the panel
            panel.add(startButton, BorderLayout.NORTH);
            panel.add(exitButton, BorderLayout.AFTER_LAST_LINE);

            // Add panel to the frame
            frame.add(panel);

            // Set the frame to be visible
            frame.setVisible(true);
        });
    }
}
