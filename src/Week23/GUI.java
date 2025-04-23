package Week23;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GUI implements ActionListener {
    JTextField tfName,tfAddress, tfPhone;
    JButton btAdd, btClear, btDisplay;

    GUI()
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblName = new JLabel("Name:");
        JLabel lblAddress = new JLabel("Address:");
        JLabel lblPhone = new JLabel("Phone:");
        tfName = new JTextField(30);
        tfAddress = new JTextField(30);
        tfPhone = new JTextField(30);
        btAdd = new JButton("Add");
        btClear = new JButton("Clear");
        btDisplay = new JButton("Display");
        frame.add(lblName);
        frame.add(tfName);
        frame.add(lblAddress);
        frame.add(tfAddress);
        frame.add(lblPhone);
        frame.add(tfPhone);
        frame.add(btAdd);
        frame.add(btClear);
        frame.add(btDisplay);

        btAdd.addActionListener(this);
        btDisplay.addActionListener(this);
        btClear.addActionListener(this);




        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btAdd)
        {
            if(tfName.getText().isEmpty() || tfAddress.getText().isEmpty()
                    || tfPhone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter All Fields");
                return;
            }
            String name = tfName.getText().trim();
            String address = tfAddress.getText().trim();
            String phone = tfPhone.getText().trim();
            FileWriter fw = null;
            try {
                fw = new FileWriter("c1w23.txt",true);
                fw.write(name+";"+address+";"+phone+"\n");
                fw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(e.getSource() == btClear)
        {
            tfName.setText("");
            tfAddress.setText("");
            tfPhone.setText("");
            File f = new File("c1w23.txt");
            f.delete();
        }
        if(e.getSource() == btDisplay)
        {
            File f = new File("c1w23.txt");
            StringBuilder txt = new StringBuilder();
            Scanner sc = null;
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                txt.append(line);
            }
            JOptionPane.showMessageDialog(null, txt.toString());
        }
    }
}
