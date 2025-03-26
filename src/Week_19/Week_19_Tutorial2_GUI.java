package Week_19;

import javax.swing.*;
import java.awt.*;

public class Week_19_Tutorial2_GUI {
    public void makeFrame(){
        JFrame container = new JFrame("Week 19 Tutorial and Workshop");
        container.setVisible(true);
        container.setSize(500, 500);
        container.setLayout(new FlowLayout());
        container.setDefaultCloseOperation(container.EXIT_ON_CLOSE);
        makeLabelInputFields(container);
    }
    public void makeLabelInputFields(JFrame container){
        JLabel label1 = new JLabel("Enter Student Name:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Enter Student ID:");
        JTextField textField2 = new JTextField(10);
        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);
        addButton(container,textField1,textField2);
    }
    public void addButton(Container container, JTextField textField1,JTextField textField2){
        JButton addButton = new JButton("Add Student");
        container.add(addButton);
        addButton.addActionListener(e -> {
            int textField1Value1 = Integer.parseInt(textField1.getText());
            int textField2Value = Integer.parseInt(textField2.getText());
            int sum = textField1Value1 + textField2Value;
            JLabel sumLabel = new JLabel("sum is"+  sum);
            container.add(sumLabel);
        });
    }
    public static void main(String[] args) {
        Week_19_Tutorial2_GUI GUI = new Week_19_Tutorial2_GUI();
        GUI.makeFrame();
    }
}
