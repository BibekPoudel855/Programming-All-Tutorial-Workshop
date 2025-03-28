package Week_20.Workshop;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class week_20_workshop_GUI {
    JFrame frame;
    JTextField studentName;
    JButton add;
    JButton clear;
    JButton remove;
    JButton display;
    ArrayList <String> studentNames = new ArrayList <>();
    public void makeFrame() {
        frame = new JFrame("Week 20 Workshop");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridBagLayout());

        addInputLabelField();
        addingButtons();
        addEventOnButtons();
    }
    public void addEventOnButtons() {
        add.addActionListener(e -> {
            studentNames.add(studentName.getText());
            System.out.println(studentNames);
            JOptionPane.showMessageDialog(frame, "Added");
        });
        clear.addActionListener(e -> {
            // when clear button pressed it will clear the text field and display cleared message in pop up and clear arraylist 
            studentName.setText("");
            studentNames.clear();
            JOptionPane.showMessageDialog(frame, "Cleared");  
        });
        remove.addActionListener(e -> {
                // when remove button pressed then text field is cleared with value in arraylist
                try{
                    studentNames.remove(studentName.getText());
                    studentName.setText("");
                    JOptionPane.showMessageDialog(frame, "Removed");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "No student name to remove. "+ ex.getMessage());
                }
        });
        display.addActionListener(e -> {
            if(studentNames.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "empty array");
            } else {
                String displayingNames = "";
                for(String name : studentNames) {
                    displayingNames += name + "\n";
                }
                JOptionPane.showMessageDialog(frame, displayingNames);
            }
        });
        
    }
    public void addingButtons() {
        add = new JButton("Add");
        clear = new JButton("Clear");
        remove = new JButton("Remove");
        display = new JButton("Display");
        frame.add(add);
        frame.add(clear);
        frame.add(remove);
        frame.add(display);
    }
    public void addInputLabelField() {
        JLabel studentNameLabel = new JLabel("Student Name");
        studentName = new JTextField(10);
        frame.add(studentNameLabel);
        frame.add(studentName);

    }
    public static void main(String[] args) {
        new week_20_workshop_GUI().makeFrame();
    }
}