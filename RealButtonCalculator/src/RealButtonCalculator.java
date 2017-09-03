import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RealButtonCalculator {

public double ans, num;
public int calculation;
	

	
	public JFrame frame;
	public JTextField Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealButtonCalculator window = new RealButtonCalculator();
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
	public RealButtonCalculator() {
		initialize();
	}

	// Initializing the contents
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 727);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		

	// buttons & inputs
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "4");
			}
		});
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "0");
			}
		});
		button0.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button0.setBounds(125, 567, 88, 88);
		frame.getContentPane().add(button0);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "7");
			}
		});
		
	
		
		button7.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button7.setBounds(15, 255, 88, 88);
		frame.getContentPane().add(button7);
		
		button4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button4.setBounds(15, 359, 88, 88);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "1");
				
			}
		});
		button1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button1.setBounds(15, 463, 88, 88);
		frame.getContentPane().add(button1);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "8");
			}
		});
		button8.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button8.setBounds(125, 255, 88, 88);
		frame.getContentPane().add(button8);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "5");
			}
		});
		button5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button5.setBounds(125, 359, 88, 88);
		frame.getContentPane().add(button5);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "2");
			}
		});
		button2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button2.setBounds(125, 463, 88, 88);
		frame.getContentPane().add(button2);
		
		JButton button9 = new JButton("9");
		button9.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Answer.setText(Answer.getText() + "9");
			}
		});
		button9.setBounds(228, 255, 88, 88);
		frame.getContentPane().add(button9);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "6");
			}
		});
		button6.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button6.setBounds(228, 359, 88, 88);
		frame.getContentPane().add(button6);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + "3");
			}
		});
		
		
		
			// the operation buttons 
		
		JLabel Label1 = new JLabel("");				// label thing on top of answer box
		Label1.setHorizontalAlignment(SwingConstants.RIGHT);
		Label1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 23));
		Label1.setBounds(15, 16, 398, 27);
		frame.getContentPane().add(Label1);
		
		
		button3.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		button3.setBounds(228, 463, 88, 88);
		frame.getContentPane().add(button3);
		
		JButton buttonAdd = new JButton("+");						// Add
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Answer.getText());
				calculation = 1;
				Answer.setText("");
				Label1.setText(num + "+");
		
				}
		});
		buttonAdd.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		buttonAdd.setBounds(331, 255, 88, 191);
		frame.getContentPane().add(buttonAdd);
		
		JButton equalsButton = new JButton("=");					// equals
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				math();
				Label1.setText(null);
				
			}
		});
		equalsButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		equalsButton.setBounds(331, 462, 88, 193);
		frame.getContentPane().add(equalsButton);
		
		JButton decimalButton = new JButton(".");					// decimal
		decimalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(Answer.getText() + ".");
			}
		});
		decimalButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		decimalButton.setBounds(228, 567, 88, 88);
		frame.getContentPane().add(decimalButton);
		
		JButton buttonClear = new JButton("AC");						//clear
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer.setText(null);
				Label1.setText(null);
			}
		});
		buttonClear.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		buttonClear.setBounds(15, 151, 88, 46);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonMultiply = new JButton("*");					// multiply
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Answer.getText());
				calculation = 3;
				Answer.setText("");
				Label1.setText(num + "*");
			}
		});
		buttonMultiply.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		buttonMultiply.setBounds(125, 151, 88, 88);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonDivide = new JButton("/");					// divide
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Answer.getText());
				calculation = 4;
				Answer.setText("");
				Label1.setText(num + "/");
			}
		});
		buttonDivide.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		buttonDivide.setBounds(228, 151, 88, 88);
		frame.getContentPane().add(buttonDivide);
		
		JButton buttonSubtract = new JButton("-");				// subtract
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(Answer.getText());
				calculation = 2;
				Answer.setText("");
				Label1.setText(num + "-");
			}
		});
		buttonSubtract.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		buttonSubtract.setBounds(331, 151, 88, 88);
		frame.getContentPane().add(buttonSubtract);
		
		Answer = new JTextField();
		Answer.setHorizontalAlignment(SwingConstants.RIGHT);
		Answer.setEditable(false);
		Answer.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 40));
		Answer.setBounds(15, 47, 404, 88);
		frame.getContentPane().add(Answer);
		Answer.setColumns(10);
		
		JButton back = new JButton("DEL");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = Answer.getText().length();				// backwards button
				int number = Answer.getText().length() - 1;
				
				if(length > 0) {
					
					StringBuilder back= new StringBuilder(Answer.getText());
					back.deleteCharAt(number);
					Answer.setText(back.toString());
				
				 
					
				}
			}
		});
		back.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		back.setBounds(15, 199, 88, 46);
		frame.getContentPane().add(back);
		
		JButton plusOrMinus = new JButton("+/-");				// Gets negative by multiplying by 1
		plusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				num = Double.parseDouble((Answer.getText())); 
				Answer.setText(Double.toString(num*-1));
				
				
			}
		});
		plusOrMinus.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 33));
		plusOrMinus.setBounds(15, 567, 88, 88);
		frame.getContentPane().add(plusOrMinus);
		
		
		
	}

			// math jargons
	
	
	public void math() {
		switch(calculation) {
		
		
		
		case 3: // multiply
			ans=num * Double.parseDouble(Answer.getText());
			Answer.setText(Double.toString((ans)));
			break;
			
		case 4: // divide
			ans=num / Double.parseDouble(Answer.getText());
			Answer.setText(Double.toString(ans));
			break;
			
		case 1:  // add
			ans=num + Double.parseDouble(Answer.getText());
			Answer.setText(Double.toString(ans));
			break;
			
		case 2: // subtract
			ans=num - Double.parseDouble(Answer.getText());
			Answer.setText(Double.toString(ans));
			break;
			
			
	
		
			
			
		}
		
	}
}
