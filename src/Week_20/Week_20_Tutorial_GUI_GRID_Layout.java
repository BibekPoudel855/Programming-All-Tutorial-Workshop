package Week_20;
import javax.swing.*;
import java.awt.*;
public class Week_20_Tutorial_GUI_GRID_Layout {
    JFrame container;
    JTextField firstNumberField;
    JTextField lastNumberField;
    JButton Add;
    JButton Subtract;
    JButton Multiply;
    JButton Divide;
    JButton clearButton;
    public void makeFrame() {
        container = new JFrame("bibek inc");
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(new GridBagLayout());
        container.setSize(800, 600);
        container.setVisible(true);
        container.setLayout(new GridBagLayout());
        addInputFields();
        addButtons();
    }
    public void addInputFields() {
        JLabel firstNumberLabel = new JLabel("First Number");
        firstNumberField = new JTextField(10);
        JLabel lastNameLabel = new JLabel("Last Number");
        lastNumberField = new JTextField(10);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        container.add(firstNumberLabel,gbc);
        gbc.gridx = 1;
        container.add(firstNumberField,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        container.add(lastNameLabel,gbc);
        gbc.gridx = 1;
        container.add(lastNumberField,gbc);
    }

    public void addButtons() {
        Add = new JButton("Add");
        Subtract = new JButton("Subtract");
        Multiply = new JButton("Multiply");
        Divide = new JButton("Divide");
        clearButton = new JButton("Clear");

        Add.addActionListener(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int lastNumber = Integer.parseInt(lastNumberField.getText());
            int sum = firstNumber + lastNumber;
            JOptionPane.showMessageDialog(null,"sum  is" + " " + sum);
        });
        Subtract.addActionListener(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int lastNumber = Integer.parseInt(lastNumberField.getText());
            int sub = firstNumber - lastNumber;
            JOptionPane.showMessageDialog(null,"Substraction is" + " " + sub);
        });
        Multiply.addActionListener(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int lastNumber = Integer.parseInt(lastNumberField.getText());
            int mul = firstNumber * lastNumber;
            JOptionPane.showMessageDialog(null,"multiply is" + " " + mul);
        });
        Divide.addActionListener(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int lastNumber = Integer.parseInt(lastNumberField.getText());
            int div = firstNumber / lastNumber;
           JOptionPane.showMessageDialog(null,"Divide is" + " " + div);
        });

        clearButton.addActionListener(e -> {
            firstNumberField.setText("");
            lastNumberField.setText("");
        });
        container.add(Add);
        container.add(Subtract);
        container.add(Multiply);
        container.add(Divide);
        container.add(clearButton);

    }
    public static void main(String[] args) {
        new Week_20_Tutorial_GUI_GRID_Layout().makeFrame();
    }
}
