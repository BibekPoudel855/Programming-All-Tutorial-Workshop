package Week_19;
import javax.swing.*;
import java.awt.*;
public class Week_19_Tutorial_GUI {
//    instance variables
    JLabel valueOfCounterLabel;
    public static int counter=0;
    Week_19_Tutorial_GUI() {
    }
    public void makeFrame(String title) {
        JFrame container = new JFrame();
        container.setVisible(true);
        container.setTitle(title);// or we can pass parameter in JFrame() constructor
        container.setSize(500, 500);
        BorderLayout BorderLayout = new BorderLayout();
        container.setLayout(BorderLayout);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addLabel(container);
        addButton(container);
    }
    public void addLabel(JFrame container) {
        valueOfCounterLabel = new JLabel("Counter: "+ counter, JLabel.CENTER);
        container.add(valueOfCounterLabel);
    }
    public void addButton(JFrame container) {
        JButton addButton = new JButton("Add Student");
        container.add(addButton, BorderLayout.EAST);
        addButton.addActionListener(e -> {
            counter++;
            valueOfCounterLabel.setText("Counter:"+ counter);
        });
    }
    public static void main(String[] args) {
        Week_19_Tutorial_GUI GUIButtonCounter = new Week_19_Tutorial_GUI();
        GUIButtonCounter.makeFrame("Counter On Click");
    }
}
