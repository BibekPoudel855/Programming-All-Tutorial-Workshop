package Week_20;
//importing classes
import java.awt.*;
import javax.swing.*;

public class Week_20_GUI_Assignment {
//    instance variable
    JFrame container;
    JLabel firstNameLabel;
    JTextField firstNameInput;
    JTextField lastNameInput;
    JLabel lastNameLabel;
    JLabel displayLabel;

    //    method which makes frame
    public void makeFrame(){
        container = new JFrame();
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setTitle("Week 20 Assignment");
        container.setSize(500, 500);
        container.setLayout(new FlowLayout());
        container.setVisible(true);
        addInputField();
        addButton_Label();

    }
    // method which handle input fields
    public void addInputField(){
        firstNameLabel = new JLabel("First Name");
        firstNameInput = new JTextField(10);
        lastNameInput = new JTextField(10);
        lastNameLabel = new JLabel("Last Name");

        container.add(firstNameLabel);
        container.add(firstNameInput);
        container.add(lastNameLabel);
        container.add(lastNameInput);
    }
    public void addButton_Label(){
        JButton addButton = new JButton("Add");
        container.add(addButton);
        displayLabel = new JLabel();
        container.add(displayLabel);
        addButton.addActionListener(e -> {
            displayLabel.setText("Your Name is " + firstNameInput.getText() + " " + lastNameInput.getText());
        });
    }
    public static void main(String[] args) {
         new Week_20_GUI_Assignment().makeFrame();
    }
}
