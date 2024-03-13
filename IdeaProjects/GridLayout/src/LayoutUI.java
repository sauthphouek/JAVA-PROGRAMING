//// create creating form for the user to input the data
//// and then save the data to the file
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.FileWriter;
//import java.io.IOException;
//
//
//class Main extends JFrame implements ActionListener {
//    //   Label, TextField, Button, TextArea;
//    public static void main(String[] args) {
//        Main frame = new Main();
//        frame.setSize(400, 400);
//        frame.setTitle("Creating Form");
//        frame.setVisible(true);
//        frame.setLayout(new FlowLayout());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//        // input name, and password
//        JLabel nameLabel = new JLabel("Name: ");
//        JTextField nameField = new JTextField(20);
//        frame.add(nameLabel);
//        frame.add(nameField);
//
//
//        JLabel emailLabel = new JLabel("Email: ");
//        JTextField emailField = new JTextField(20);
//        frame.add(emailLabel);
//        frame.add(emailField);
//
//        JLabel phoneLabel = new JLabel("Phone: ");
//        JTextField phoneField = new JTextField(20);
//        frame.add(phoneLabel);
//        frame.add(phoneField);
//
//        JLabel addressLabel = new JLabel("Address: ");
//        JTextField addressField = new JTextField(20);
//        frame.add(addressLabel);
//        frame.add(addressField);
//
//        // button submit
//        JButton submitButton = new JButton("Submit");
//        // set height and width of the button
//        submitButton.setPreferredSize(new Dimension(100, 50));
//        frame.add(submitButton);
//        submitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = nameField.getText();
//                String email = emailField.getText();
//                String phone = phoneField.getText();
//                String address = addressField.getText();
//                try {
//                    FileWriter writer = new FileWriter("data.txt");
//                    writer.write(name + "\n");
//                    writer.write(email + "\n");
//                    writer.write(phone + "\n");
//                    writer.write(address + "\n");
//                    writer.close();
//                } catch (IOException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        });
//
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
////        String name = nameField.getText();
////        String email = emailField.getText();
////        String phone = phoneField.getText();
////        String address = addressField.getText
//    }
//}
//
//
//


//import java.awt.*;
//import java.awt.event.*;
//public class Practice1 extends Frame {
//    Label lbName,lbDesc,lbAge,lbShowHello,lbShowName,lbShowAge;
//    TextField tfName, tfDesc, tfAge;
//    Button btnGreeting;
//    Panel pan = new Panel();
//    public Practice1(){
//        setSize(330,300);
//        setTitle("Hello computer");
//        setLocationRelativeTo(null);
//
//        add(lbDesc = new Label("Please input your name and age"));
//        lbDesc.setFont(new Font("Arial",Font.BOLD,16));   //add font
//        lbDesc.setForeground(new Color(0,0,255));  //set color;
//
//        add(lbName = new Label("Your Name : "));
//        add(tfName = new TextField(15));
//
//        add(lbAge = new Label("Your Age : "));
//        add (tfAge = new TextField(15));
//
//        Dimension d1 = new Dimension(70,25);
//        lbName.setPreferredSize(d1);
//        lbAge.setPreferredSize(d1);
//
//        add(btnGreeting = new Button("Greeting"));
//        btnGreeting.setPreferredSize(new Dimension(270,30));
//
//
//        add(pan);
//
//        pan.setLayout(new GridLayout(3,1));
//        pan.setBackground(Color.green);
//        pan.setPreferredSize(new Dimension(300,130));
//        pan.add(lbShowHello = new Label(""));
//        pan.add(lbShowName = new Label("Your greeting will show"));
//        pan.add(lbShowAge = new Label(""));
//
//
//
//        setLayout(new FlowLayout());
//
//        btnGreeting.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e){
//                if (e.getSource() == btnGreeting){
//                    lbShowHello.setText("Hello , ");
//                    lbShowName.setText(lbName.getText() + ":" + tfName.getText());
//                    lbShowAge.setText(lbAge.getText() + ":" + tfAge.getText());
//
//                }
//            }
//        });
//
//        setVisible(true);
//        addWindowListener( new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e){
//                System.exit(0);
//            }
//        });
//    }
//    public static void main(String[] args) {
//        new Practice1();
//    }
//
//
//
//}