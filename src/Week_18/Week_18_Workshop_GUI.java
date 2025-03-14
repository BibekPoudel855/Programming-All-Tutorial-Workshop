package Week_18;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Week_18_Workshop_GUI {
    ArrayList<String> StudentNames = new ArrayList<>();

    public Week_18_Workshop_GUI() {
        //container
        JFrame container = new JFrame("Week 18 Workshop");
        container.setVisible(true);
        container.setSize(500, 500);
        container.setLayout(new FlowLayout());

//      First input field and label
        JLabel inputField1Label = new JLabel("Enter Your Name");
        JTextField inputField1 = new JTextField(15);
        container.add(inputField1Label);
        container.add(inputField1);

        //button
        JButton addToArrayButton = new JButton("Add To Array");
        container.add(addToArrayButton);

        JButton displayArrayButton = new JButton("Display Array");
        container.add(displayArrayButton);

//        text area displaying
        TextArea textArea = new TextArea();
        container.add(textArea);
        displayArrayButton.addActionListener(e ->{
            for (String name : StudentNames) {
                textArea.append(name + "\n");
            }
        });

        addToArrayButton.addActionListener(e -> {
                System.out.println("Added To Array");
                StudentNames.add(inputField1.getText());
        });


    }

    public static void main(String[] args) {
        Week_18_Workshop_GUI obj1 = new Week_18_Workshop_GUI();
    }
}
