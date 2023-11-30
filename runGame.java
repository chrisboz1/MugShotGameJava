package game;

import javax.swing.*;

public class runGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainMenu();
        });
    }
}
