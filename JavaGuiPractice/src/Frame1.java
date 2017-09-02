import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JPasswordField;

public class Frame1 {

	private JFrame frame;
	private JTextField TextNum1;
	private JTextField TextNum2;
	private JTextField AnswerShow;
	public Double num1, num2, ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 30));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextNum1 = new JTextField();
		TextNum1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		TextNum1.setBounds(15, 36, 180, 53);
		frame.getContentPane().add(TextNum1);
		TextNum1.setColumns(10);
		
		TextNum2 = new JTextField();
		TextNum2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		TextNum2.setBounds(210, 36, 203, 53);
		frame.getContentPane().add(TextNum2);
		TextNum2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");					// Adding Code
		btnAdd.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					num1=Double.parseDouble(TextNum1.getText());
					num2=Double.parseDouble(TextNum2.getText());
					ans=num1+num2;
					AnswerShow.setText(Double.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid Number");
				}
			}
		});
		btnAdd.setBounds(15, 105, 84, 43);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");			// Subtracting Code
		btnSubtract.setFont(new Font("Yu Gothic Light", Font.PLAIN, 16));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					num1=Double.parseDouble(TextNum1.getText());
					num2=Double.parseDouble(TextNum2.getText());
					ans=num1-num2;
					AnswerShow.setText(Double.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid Number");
				}
			}
				
			
		});
		btnSubtract.setBounds(211, 105, 95, 43);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");			// Multiplying Code
		btnMultiply.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					num1=Double.parseDouble(TextNum1.getText());
					num2=Double.parseDouble(TextNum2.getText());
					ans=num1*num2;
					AnswerShow.setText(Double.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid Number");
				}
			}
			
		});
		btnMultiply.setBounds(108, 105, 95, 43);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");				// dividing code
		btnDivide.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					num1=Double.parseDouble(TextNum1.getText());
					num2=Double.parseDouble(TextNum2.getText());
					ans=num1/num2;
					AnswerShow.setText(Double.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid Number");
				}
			}
			
		});
		btnDivide.setBounds(310, 105, 103, 43);
		frame.getContentPane().add(btnDivide);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		lblAnswer.setBounds(170, 152, 78, 20);
		frame.getContentPane().add(lblAnswer);
		
		AnswerShow = new JTextField();
		AnswerShow.setFont(new Font("Tahoma", Font.PLAIN, 28));
		AnswerShow.setBounds(15, 178, 398, 55);
		frame.getContentPane().add(AnswerShow);
		AnswerShow.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number 1");
		lblNumber.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		lblNumber.setBounds(46, 9, 149, 20);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblNumber_1 = new JLabel("Number 2");
		lblNumber_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		lblNumber_1.setBounds(265, 9, 96, 20);
		frame.getContentPane().add(lblNumber_1);
	}
}
