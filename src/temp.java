import javax.swing.*;
import java.awt.*;

public class temp{
    JFrame frame;
    JTextField Name;
    JButton Add;
    public void makeFrame(){
        frame = new JFrame();

        frame.setVisible(true);
        frame.setLayout(new GridBagLayout());
        frame.setSize(500,500);

        addInputField();
        addButton();
    }
    public void addButton(){
        Add = new JButton("Add");
        frame.add(Add);
        Add.addActionListener(e -> {
            System.out.println("A");
        });
    }
    public void addInputField(){
        Name = new JTextField(10);
        frame.add(Name);
    }
    public static void main(String[] args) {
        new temp().makeFrame();

    }
}