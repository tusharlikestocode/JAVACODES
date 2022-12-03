import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener {
 JLabel message;
 JLabel nameLabel, dobLabel, genderLabel;
 JTextField dobFormat;
 JTextField nameField;
 JRadioButton Male, Female;
 ButtonGroup genderGroup;
 JLabel EmailLabel, mobileNoLabel;
 JTextField EmailField, mobileNoField;
 JLabel passwordLabel, addressLabel;
 JPasswordField passwordField;
 JTextArea addressArea;
 JLabel programLabel;
 JComboBox<String> programList;
 JLabel branchLabel, semLabel;
 JComboBox<String> branchList;
 JComboBox<Integer> semList;
 JButton registerButton,reset;
 Container container;
 public Login() {
 message = new JLabel("Register a new Student");
 message.setFont(new Font("Courier", Font.BOLD, 20));
 nameLabel = new JLabel("Name");
 nameField = new JTextField();
 dobLabel = new JLabel("DOB");
 dobFormat = new JTextField();
 genderLabel = new JLabel("Gender");
 Male = new JRadioButton("Male", true);
 Female = new JRadioButton("Female");
 genderGroup = new ButtonGroup();
 genderGroup.add(Male);
 genderGroup.add(Female);
 EmailLabel = new JLabel("Mail Id");
 EmailField = new JTextField();
 mobileNoLabel = new JLabel("Mobile No");
 mobileNoField = new JTextField();
 passwordLabel = new JLabel("Password");
 passwordField = new JPasswordField();
 addressLabel = new JLabel("Address");
 addressArea = new JTextArea();
 programLabel = new JLabel("Courses");
 programList = new JComboBox<String>();
 programList.addItem("ME/M Tect");
 programList.addItem("BE/B Tect");
 programList.addItem("Diploma");
 branchLabel = new JLabel("Branch");
 branchList = new JComboBox<String>();
 branchList.addItem("Computer Science and Engineering");
 branchList.addItem("Electronics and Telecommunications");
 branchList.addItem("Information Technology");
 branchList.addItem("Electrical Engineering");
 branchList.addItem("Electrical and Electronics Engineering");
 branchList.addItem("Civil Engineering");
 semLabel = new JLabel("sem");
 semList = new JComboBox<>();
 semList.addItem(1);
 semList.addItem(2);
 semList.addItem(3);
 semList.addItem(4);
 semList.addItem(5);
 semList.addItem(6);
 semList.addItem(7);
 semList.addItem(8);
 registerButton = new JButton("Register");
 reset = new JButton("Reset");
 container = getContentPane();
 container.setLayout(null);
 setBounds();
 addComponents();
 addActionEvent();
 }
 public void setBounds() {
 message.setBounds(50, 10, 600, 30);
 nameLabel.setBounds(50, 60, 100, 30);
 nameField.setBounds(130, 60, 200, 30);
 dobLabel.setBounds(50, 110, 100, 30);
 dobFormat.setBounds(130,110,100,30);
 genderLabel.setBounds(50, 160, 100, 30);
 Male.setBounds(130, 160, 100, 30);
 Female.setBounds(240, 160, 100, 30);
 EmailLabel.setBounds(50, 210, 100, 30);
 EmailField.setBounds(130, 210, 200, 30);
 mobileNoLabel.setBounds(50, 260, 100, 30);
 mobileNoField.setBounds(130, 260, 200, 30);
 passwordLabel.setBounds(50, 310, 100, 30);
 passwordField.setBounds(130, 310, 200, 30);
 addressLabel.setBounds(50, 360, 100, 30);
 addressArea.setBounds(130, 360, 450, 30);
 programLabel.setBounds(50, 410, 100, 30);
 programList.setBounds(130, 410, 200, 30);
 branchLabel.setBounds(50, 460, 100, 30);
 branchList.setBounds(130, 460, 200, 30);
 semLabel.setBounds(50, 510, 100, 30);
 semList.setBounds(130, 510, 200, 30);
 registerButton.setBounds(130, 550, 200, 30);
 reset.setBounds(130,600,200,30);
 }
 public void addComponents() {
 container.add(message);
 container.add(nameLabel);
 container.add(nameField);
 container.add(dobLabel);
 container.add(dobFormat);
 container.add(genderLabel);
 container.add(Male);
 container.add(Female);
 container.add(EmailLabel);
 container.add(EmailField);
 container.add(mobileNoLabel);
 container.add(mobileNoField);
 container.add(passwordLabel);
 container.add(passwordField);
 container.add(addressLabel);
 container.add(addressArea);
 container.add(programLabel);
 container.add(programList);
 container.add(branchLabel);
 container.add(branchList);
 container.add(semLabel);
 container.add(semList);
 container.add(registerButton);
 container.add(reset);
 }
 public void addActionEvent() {
 registerButton.addActionListener(this);
 reset.addActionListener(this);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 //Coding Part of LOGIN button
 if (e.getSource()==registerButton)
 {
 String name=nameField.getText();
 JOptionPane.showMessageDialog(this,name+" You are successfully registered");
 }
 else if(e.getSource()==reset)
 {
 nameField.setText("");
 dobFormat.setText("");
 genderGroup.clearSelection();
 EmailField.setText("");
 mobileNoField.setText("");
 passwordField.setText("");
 addressArea.setText("");
 programList.setSelectedIndex(0);
 semList.setSelectedIndex(0);
 branchList.setSelectedIndex(0);
 }
 }
 public static void main(String[] args) {
 Login frame = new Login();
 frame.setTitle("Student Register Form");
 frame.setVisible(true);
 frame.setBounds(500,100, 600, 700);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setResizable(true);
 }
}0

