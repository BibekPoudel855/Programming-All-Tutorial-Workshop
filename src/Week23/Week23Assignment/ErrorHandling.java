package Week23.Week23Assignment;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ErrorHandling {
    JFrame frame;
    JTextField studentName;
    JTextField studentAge;
    JComboBox group;
    JTextArea message;
    JPanel inputButtonPanel;
    JPanel inputPanel;
    JPanel buttonPanel;
    JButton Display;
    JButton Clear;

    ArrayList<String> studentNameList = new ArrayList<>();

    public void makeFrame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Week 21 Assignment");
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400, 500);
        frame.setVisible(true);

        inputButtonPanel = new JPanel();
        inputButtonPanel.setLayout(new GridLayout(2,1,0,0));
        frame.add(inputButtonPanel);

        addInputLayout();
        addCombobox();
        addButton();
        addTextAreaDisplay();
    }

    public void addTextAreaDisplay(){
        message = new JTextArea();
        message.setEditable(false);
        frame.add(message);
    }

    public void addInputLayout(){
        inputPanel = new JPanel();
        JLabel studentNameLabel = new JLabel("Student Name");
        inputPanel.add(studentNameLabel);
        inputPanel.setLayout(new FlowLayout());
        studentName = new JTextField(15);
        inputPanel.add(studentName);

        JLabel studentAgeLabel = new JLabel("Student Age");
        inputPanel.add(studentAgeLabel);
        studentAge = new JTextField(15);
        inputPanel.add(studentAge);

        inputButtonPanel.add(inputPanel);
    }

    public void addCombobox(){
        String [] groupName = {"A","B","C"};
        JLabel groupLabel = new JLabel("Group");
        group = new JComboBox(groupName);
        inputPanel.add(groupLabel);
        inputPanel.add(group);
    }

    public void addButton(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setVisible(true);
        inputButtonPanel.add(buttonPanel);

        Clear = new JButton("Clear");
        Display = new JButton("Display");
        buttonPanel.add(Clear);
        buttonPanel.add(Display);

        Clear.addActionListener(e -> {
            studentName.setText("");
            studentAge.setText("");
            group.setSelectedIndex(0);
            studentNameList.clear();
            message.setText("");
            JOptionPane.showMessageDialog(frame, "Cleared");
        });

        Display.addActionListener(e -> {
            String name = studentName.getText();
            String age = studentAge.getText();
            String groupName = (String) group.getSelectedItem();

            if (name.equals("") || age.equals("")) {
                JOptionPane.showMessageDialog(frame, "Empty Input Field");
            } else {
                try {
                    int ageValue = Integer.parseInt(age); // Check if age is numeric
                    studentNameList.add("Name: " + name + ", Age: " + ageValue + ", Group: " + groupName);
                    JOptionPane.showMessageDialog(frame, "Data Added Successfully!");
                    DisplayArrayList();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter numbers only.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Something went wrong");
                }
            }
        });
    }

    public void DisplayArrayList(){
        message.setText(""); // clear old text before displaying updated list
        for (int i = 0; i < studentNameList.size(); i++) {
            message.append(studentNameList.get(i) + "\n");
        }
    }

    public static void main(String[] args) {
        new ErrorHandling().makeFrame();
    }
}
