package jframe;

/*
 * Demo Desktop GUI Application using swing JFrame.
 * */


import javax.swing.JFrame;
import javax.swing.JButton;

public class DemoFrame {
	
	JFrame frame;
	JButton button;

	public DemoFrame() {
		frame = new JFrame();
		button = new JButton("Submit");
		
		button.setAlignmentX(20);
		button.setAlignmentY(20);
		button.setBounds(20,20,60,20);

		frame.add(button);
		frame.setSize(980,414);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new DemoFrame();
		
	}

}
