package Week_20.Workshop;

import javax.swing.*;
import java.awt.*;

public class GuessGame {
    JFrame container;

    public void makeFrame(){
        container = new JFrame();
        container.setLayout(new GridLayout());
        container.setTitle("Guess Game");
        container.setSize(500, 500);
        container.setVisible(true);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addButton();
    }
    public void addButton(){
        int randomNumber = (int) (Math.random() * 9);
        System.out.println(randomNumber);
        for(int i =1; i<=10; i++){
            JButton button = new JButton(""+i);
            container.add(button);
            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(container, "Guess Correct");
                if (button.getText().equals(String.valueOf(randomNumber))) {
                    JOptionPane.showMessageDialog(container, "You have guessed it");
                }
            });
        }
    }
    public static void main(String[] args) {
        GuessGame g = new GuessGame();
        g.makeFrame();
    }
}
