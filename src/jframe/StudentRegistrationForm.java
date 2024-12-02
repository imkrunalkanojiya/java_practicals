package jframe;

import java.awt.BorderLayout;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class StudentRegistrationForm {

	JFrame mainFrame;
	FontMetrics fm;
	JButton submitBtn;
	JLabel frameTitle;
	JLabel studentNameLabel;
	JTextField studentName;
	JLabel studentPasswordLabel;
	JPasswordField studentPassword;

	// Demo Login
	String username = "demo";
	String password = "password";
	
	
	public StudentRegistrationForm() {
		
		// Defining Elements
		mainFrame = new JFrame();
		frameTitle = new JLabel();
		submitBtn = new JButton();	
		studentNameLabel = new JLabel();
		studentName = new JTextField(10);
		studentPasswordLabel = new JLabel();
		studentPassword = new JPasswordField(10);
		// Creating Layout/Frame
		mainFrame.setSize(414,600);
		mainFrame.setLayout(null);
		mainFrame.setVisible(true);
		mainFrame.setTitle("Student Registration Form");
		
		// Frame Title
		String title = "Student Registration Form"; 
	
		frameTitle.setText(title);
		frameTitle.setBounds(20,20,mainFrame.getWidth(),mainFrame.getHeight() - 580);
		
		// Student Name
		studentNameLabel.setText("Name");
		studentNameLabel.setBounds(20, mainFrame.getHeight() - 540, 60, 40);
		studentName.setBounds(100,mainFrame.getHeight() - 540, 200, 40);
		
		// Student Password
		studentPasswordLabel.setText("Password");
		studentPasswordLabel.setBounds(20, mainFrame.getHeight() - 500, 60, 40);
		studentPassword.setBounds(100,mainFrame.getHeight() - 500, 200, 40);
		
		// Submit Button
		submitBtn.setBounds(100, mainFrame.getHeight() - 460, 140, 40);
		submitBtn.setText("Login!");
		
		// Registration Form
		mainFrame.add(frameTitle);
		mainFrame.add(studentNameLabel);
		mainFrame.add(studentName,BorderLayout.SOUTH);
		mainFrame.add(studentPasswordLabel);
		mainFrame.add(studentPassword,BorderLayout.SOUTH);
		mainFrame.add(submitBtn);
		
		
		//Login Method
		
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSubmit();
			}
		});
	}
	
	public void handleSubmit() {
		String enteredUsername = new String(studentName.getText());
		String enteredPassword = new String(studentPassword.getPassword());
		
		
		
		if(studentName.equals(username)) {
			if(studentPassword.equals(password)) {
				JOptionPane.showMessageDialog(mainFrame,"Login Succesfull!","Success",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(mainFrame,"Invalid Credentials","Error",JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(mainFrame,"Invalid Credentials","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void main(String[] args) {
		
		new StudentRegistrationForm();
		
	}

}
