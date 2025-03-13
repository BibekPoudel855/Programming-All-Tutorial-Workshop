package Week_18;
import javax.swing.*;
import java.awt.*;
public class Week_18_Tutorial_GUI {
        public static void main(String[] args) {

            JFrame container = new JFrame("Week 18 Tutorial");
            container.setLayout(new FlowLayout());

            JLabel label1 = new JLabel("Enter first number:");
            JTextField textField1 = new JTextField(10);
            container.add(label1);
            container.add(textField1);

            JLabel label2 = new JLabel("Enter second number:");
            JTextField textField2 = new JTextField(10);
            container.add(label2);
            container.add(textField2);
            container.setVisible(true);
            container.setSize(600, 300);
        }
}
