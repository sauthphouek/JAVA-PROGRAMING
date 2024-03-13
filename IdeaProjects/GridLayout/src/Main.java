import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Main extends JFrame implements ActionListener {

    Label nameLabel, emailLabel, phoneLabel, addressLabel;

    // button
    JButton submitButton;
    // textfield
    JTextField nameField, emailField, phoneField, addressField;

    // panel
    JPanel panel = new JPanel();

    public  Main() {
        // set the title of the frame
        setTitle("Creating Form");
        // set the size of the frame
        setSize(400, 400);
        // set the layout of the frame
        setLayout(new FlowLayout());
        // set the close operation of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set the visibility of the frame
        setVisible(true);
        // add the panel to the frame
        add(panel);
        // set the layout of the panel
        panel.setLayout(new GridLayout(5, 2));
        // create the label
        nameLabel = new Label("Name: ");
        // add the label to the panel
        panel.add(nameLabel);
        // create the textfield
        nameField = new JTextField(20);
        // add the textfield to the panel
        panel.add(nameField);
        // create the label
        emailLabel = new Label("Email: ");
        // add the label to the panel
        panel.add(emailLabel);
        // create the textfield
        emailField = new JTextField(20);
        // add the textfield to the panel
        panel.add(emailField);
        // create the label
        phoneLabel = new Label("Phone: ");
        // add the label to the panel
        panel.add(phoneLabel);
        // create the textfield
        phoneField = new JTextField(20);
        // add the textfield to the panel
        panel.add(phoneField);
        // create the label
        addressLabel = new Label("Address: ");
        // add the label to the panel
        panel.add(addressLabel);
        // create the textfield
        addressField = new JTextField(20);
        // add the textfield to the panel
        panel.add(addressField);
        // create the button
        submitButton = new JButton("Submit");
        // add the button to the panel
        panel.add(submitButton);
        // add the action listener to the button
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
