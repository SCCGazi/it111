import javax.swing.*;
import java.awt.*;
public class ShowWindow2
{
    public static void main(String[] args)
    {
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 450;
        // Create labels
        JLabel myLabel = new JLabel("My First Big Label!!!");
        JLabel myLabel2 = new JLabel("My Second Big Label!");
        // Create text fields
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        // Set bounds
        myLabel.setBounds(10,10,300,30);
        myLabel2.setBounds(10,80,300,30);
        textField1.setBounds(10,40,250,30);
        textField2.setBounds(10,120,250,30);
        // Font style
        myLabel.setFont(new Font("Calibre", Font.PLAIN,20));
        myLabel2.setFont(new Font("Calibre",Font.BOLD,16));
        // Create a window
        JFrame window = new JFrame();
        window.setLayout(null);
        window.setTitle("My Simple Window");
        window.getContentPane().setBackground( Color.RED);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocation(500,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        // Add components to the window
        window.add(myLabel);
        window.add(textField1);
        window.add(myLabel2);
        window.add(textField2);
    }
}
