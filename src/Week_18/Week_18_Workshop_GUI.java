//package import
package Week_18;

//importing library
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Week_18_Workshop_GUI {
//    instance array list
    ArrayList<String> StudentNames = new ArrayList<>();

    public Week_18_Workshop_GUI() {
        //container or main div
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
        //button 2
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
        // add to button event listner
        addToArrayButton.addActionListener(e -> {
                System.out.println("Added To Array");
                StudentNames.add(inputField1.getText());
        });


    }
    // main method
    public static void main(String[] args) {
        // object creation
        Week_18_Workshop_GUI obj1 = new Week_18_Workshop_GUI();
    }
}
