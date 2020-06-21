package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	double result;
	String answer;
	String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(24, 22, 222, 42);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(21, 91, 54, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String Enternumber = textField.getText()+btnNewButton_1.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(78, 91, 54, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_2.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(135, 91, 54, 51);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(192, 91, 54, 51);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_4.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(21, 147, 54, 51);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_5.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(78, 147, 54, 51);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_6.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(135, 147, 54, 51);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("/");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(192, 147, 54, 51);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_8.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBounds(21, 202, 54, 51);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_9.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.setBounds(78, 202, 54, 51);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_10.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.setBounds(135, 202, 54, 51);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText(null);
				operation = "+";
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBounds(192, 202, 54, 51);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = textField.getText()+btnNewButton_12.getText();
				textField.setText(Enternumber);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBounds(21, 257, 54, 51);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
					textField.setText(textField.getText()+btnNewButton_13.getText());
				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_13.setBounds(78, 257, 54, 51);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("<");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back;
				if (textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back = str.toString();
				 textField.setText(back);
				}
				
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.setBounds(135, 257, 54, 51);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setBounds(192, 257, 54, 51);
		frame.getContentPane().add(btnNewButton_15);
		
		JTextPane txtpnJavaCalculator = new JTextPane();
		txtpnJavaCalculator.setText("Java Calculator");
		txtpnJavaCalculator.setBounds(78, 0, 111, 20);
		frame.getContentPane().add(txtpnJavaCalculator);
		
	}
}
