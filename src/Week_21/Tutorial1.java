package Week_21;

import javax.swing.*;
import java.awt.*;

//banking system
public class Tutorial1 {
    JFrame frame;
    JLabel nameLabel, accTypeLabel, provinceLabel;
    JTextField nameField;
    JRadioButton currentAccTypeRadioButton, savingAccTypeRadioButton;
    JComboBox provinceComboBox;
    JButton saveButton, displayButton, clearButton;
    JPanel panel;

    Tutorial1() {
        // Frame
        frame = new JFrame();
        frame.setTitle("Tutorial 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        // Panel
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Name Label and Field
        nameLabel = new JLabel("Name: ");
        nameField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        // Account Type Label and Radio Buttons
        accTypeLabel = new JLabel("Acc Type: ");
        savingAccTypeRadioButton = new JRadioButton("Saving");
        currentAccTypeRadioButton = new JRadioButton("Current");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(accTypeLabel, gbc);
        gbc.gridx = 1;
        panel.add(savingAccTypeRadioButton, gbc);
        gbc.gridx = 2;
        panel.add(currentAccTypeRadioButton, gbc);

        // Province Label and ComboBox
        provinceLabel = new JLabel("Province: ");
        String[] provinceName = {"Koshi", "Madesh", "Bagmati", "Gandaki", "Lumbini", "Karnali", "Sudurpaschim"};
        provinceComboBox = new JComboBox(provinceName);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(provinceLabel, gbc);
        gbc.gridx = 1;
        panel.add(provinceComboBox, gbc);

        // Buttons
        saveButton = new JButton("Save");
        displayButton = new JButton("Display");
        clearButton = new JButton("Clear");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(saveButton, gbc);
        gbc.gridx = 1;
        panel.add(displayButton, gbc);
        gbc.gridx = 2;
        panel.add(clearButton, gbc);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Tutorial1();
    }
}
