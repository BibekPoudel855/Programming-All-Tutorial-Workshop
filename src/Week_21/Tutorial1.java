package Week_21;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Tutorial1 {
    JFrame frame;
    JLabel nameLabel, accTypeLabel, provinceLabel;
    JTextField nameField, mobileNumberField, emailField, BalanceField, citizenshipField;
    JRadioButton currentAccTypeRadioButton, savingAccTypeRadioButton;
    JComboBox<String> provinceComboBox;
    JButton saveButton, displayButton, clearButton;
    JPanel panel;
    ArrayList<String[]> detailList = new ArrayList<>();

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

        // Mobile Number
        JLabel mobileNumberLabel = new JLabel("Mobile Number: ");
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(mobileNumberLabel, gbc);
        mobileNumberField = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 0;
        panel.add(mobileNumberField, gbc);

        // Email
        JLabel emailLabel = new JLabel("Email: ");
        gbc.gridx = 4;
        gbc.gridy = 0;
        panel.add(emailLabel, gbc);
        emailField = new JTextField(15);
        gbc.gridx = 5;
        gbc.gridy = 0;
        panel.add(emailField, gbc);

        // Citizenship
        JLabel citizenshipLabel = new JLabel("Citizenship: ");
        gbc.gridx = 6;
        gbc.gridy = 0;
        panel.add(citizenshipLabel, gbc);
        citizenshipField = new JTextField(15);
        gbc.gridx = 7;
        gbc.gridy = 0;
        panel.add(citizenshipField, gbc);

        // account Type aabel and radio ruttons
        accTypeLabel = new JLabel("Acc Type: ");
        savingAccTypeRadioButton = new JRadioButton("Saving");
        currentAccTypeRadioButton = new JRadioButton("Current");
        ButtonGroup accTypeGroup = new ButtonGroup();
        accTypeGroup.add(savingAccTypeRadioButton);
        accTypeGroup.add(currentAccTypeRadioButton);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(accTypeLabel, gbc);
        gbc.gridx = 1;
        panel.add(savingAccTypeRadioButton, gbc);
        gbc.gridx = 2;
        panel.add(currentAccTypeRadioButton, gbc);

        // Balance
        JLabel balanceLabel = new JLabel("Balance: ");
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(balanceLabel, gbc);
        BalanceField = new JTextField(15);
        gbc.gridx = 4;
        gbc.gridy = 2;
        panel.add(BalanceField, gbc);

        // province combo
        provinceLabel = new JLabel("Province: ");
        String[] provinceName = {"Koshi", "Madesh", "Bagmati", "Gandaki", "Lumbini", "Karnali", "Sudurpaschim"};
        provinceComboBox = new JComboBox<>(provinceName);
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

        // Save Button eveng
        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            String mobileNumber = mobileNumberField.getText();
            String email = emailField.getText();
            String citizenship = citizenshipField.getText();
            String province = (String) provinceComboBox.getSelectedItem();
            String accType = savingAccTypeRadioButton.isSelected() ? "Saving" : "Current";
            String balance = BalanceField.getText();

            if (name.isEmpty() || mobileNumber.isEmpty() || email.isEmpty() || citizenship.isEmpty() || balance.isEmpty()) {
                showErrorMessagwe();
                return;
            }

            if (mobileNumber.length() != 10 || !email.contains("@")) {
                showErrorMessagwe();
                return;
            }


            String[] details = {name, mobileNumber, email, citizenship, province, accType, balance};
            detailList.add(details);
            JOptionPane.showMessageDialog(null, "Details Saved Successfully!");
        });


        displayButton.addActionListener(e -> {

            JFrame tableFrame = new JFrame("Details Table");
            tableFrame.setSize(800, 400);

            String[] columnNames = {"Name", "Mobile", "Email", "Citizenship", "Province", "Account Type", "Balance"};

            String[][] data = detailList.toArray(new String[0][]);

            // Create table
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            tableFrame.add(scrollPane);

            // Show the table frame
            tableFrame.setVisible(true);
        });

        // Clear Button Action Listener
        clearButton.addActionListener(e -> {
            nameField.setText("");
            mobileNumberField.setText("");
            emailField.setText("");
            citizenshipField.setText("");
            BalanceField.setText("");
            provinceComboBox.setSelectedIndex(0);
            savingAccTypeRadioButton.setSelected(false);
            currentAccTypeRadioButton.setSelected(false);
        });
    }

    public void showErrorMessagwe() {
        JOptionPane.showMessageDialog(frame, "Please enter valid data!");
    }

    public static void main(String[] args) {
        new Tutorial1();
    }
}
