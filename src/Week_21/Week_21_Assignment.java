//importing package
package Week_21;

//importing class and library
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
//public class
public class Week_21_Assignment {
//    instance variable that can be acessed from any where
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
//    array list to store student detail
    ArrayList<String> studentNameList = new ArrayList<>();
//    method which makes frame
    public void makeFrame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Week 21 Assignment");
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400, 500);
        frame.setVisible(true);
//        panel for input fields
        inputButtonPanel = new JPanel();
        inputButtonPanel.setLayout(new GridLayout(2,1,0,0));
        frame.add(inputButtonPanel);
//        adding components via calling method
        addInputLayout();
        addCombobox();
        addButton();
        addTextAreaDisplay();
    }
//    added text area
    public void addTextAreaDisplay(){
        message = new JTextArea();
        message.setEditable(false);
        frame.add(message);
    }
//    add input fields
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
//    adding combobox
    public void addCombobox(){
        String [] groupName = {"A","B","C"};
        JLabel groupLabel = new JLabel("Group");
        group = new JComboBox(groupName);
        inputPanel.add(groupLabel);
        inputPanel.add(group);
    }
//    adding button
    public void addButton(){
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setVisible(true);
        inputButtonPanel.add(buttonPanel);
        Clear = new JButton("Clear");
        Display = new JButton("Display");
        buttonPanel.add(Clear);
        buttonPanel.add(Display);
        // action listener for button
        Clear.addActionListener(e -> {
            studentName.setText("");
            studentAge.setText("");
            group.setSelectedIndex(0);
            studentNameList.clear();
            message.setText("");
            JOptionPane.showMessageDialog(frame, "Cleared");
        });
        // action listener for display button
        // when display button is clicked, it will display the student name and age in the text area
        Display.addActionListener(e -> {
            String name = studentName.getText();
            String age = studentAge.getText();
            String groupName = (String) group.getSelectedItem();
//            message.setText("");
            if (name.equals("") || age.equals("")) {
                JOptionPane.showMessageDialog(frame, "Empty Input Field");
            } else {
                studentNameList.add("Name: " + name + ", Age: " + age + ", Group: " + groupName);
//                message.setText("");
                System.out.println(studentNameList);
                DisplayArrayList();
            }
        });

    }
//    method to display array list in text area
    // it will display the student name and age in the text area
    public void DisplayArrayList(){
        for (int i = 0; i < studentNameList.size(); i++) {
            message.append(studentNameList.get(i) + "\n");
        }
    }

    // main method or entry point code to run the program
    public static void main(String[] args) {
        new Week_21_Assignment().makeFrame();
    }
}
