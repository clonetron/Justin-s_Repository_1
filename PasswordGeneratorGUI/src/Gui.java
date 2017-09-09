import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class Gui {

	public boolean on;
	public boolean numeric;
	public boolean alphabet;
	public boolean alphanum;
	public static Random rand = new Random();
	public static JLabel Copied = new JLabel("Copied to Clipboard!");
	
	public int calculation;
	private JFrame frame;
	static JTextField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static JFormattedTextField charNumberChoice = new JFormattedTextField();
	public static JButton Next = new JButton("Next");
	public static int passLength;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Password Generator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 44));
		lblNewLabel.setBounds(15, 16, 764, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton GeneratePassword = new JButton("Generate Password");					// button 
		GeneratePassword.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
		GeneratePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
//				randomizer.randome();
				Copied.setVisible(true);
				Copied.setEnabled(true);
				presser();
				
//				
//			if (numeric) {
//				
//				password.setText("123");
//			
//			if (alphabet)
//				
//				password.setText("abc");
//			
//			if (alphanum)
//				password.setText("");
//			
//		
//				
////				Random r = new Random();
////				Scanner in = new Scanner(System.in);
////				
////						 
////						String alphabet = "abcdefghijklmnopqrstuvwxyz";
////						double a = (alphabet.charAt(r.nextInt(alphabet.length())));
////			    for (int i = 0; i < 20; i++) {
////			        password.setText(Double.toString(a));
//			       
//				
//				}
				}
				
			
		});
		GeneratePassword.setBounds(549, 80, 211, 69);
		frame.getContentPane().add(GeneratePassword);
		GeneratePassword.setEnabled(false);
		GeneratePassword.setVisible(false);
		
		password = new JTextField();
		password.setEditable(false);
		password.setEnabled(false);
		password.setVisible(false);
		password.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 42));
		password.setBounds(15, 165, 764, 62);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JRadioButton Numeric = new JRadioButton("Numeric");						//numeric selected
		Numeric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numeric = true;
				  alphabet = false;
				 alphanum = false;
				 System.out.println("Numeric on");
			}
		});
		
		buttonGroup.add(Numeric);
		Numeric.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		Numeric.setBounds(15, 100, 103, 29);
		frame.getContentPane().add(Numeric);
		Numeric.setEnabled(false);
		Numeric.setVisible(false);
			
		JRadioButton Alphabetized = new JRadioButton("Alphabetized");				//alpha selected
		Alphabetized.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeric = false;
				  alphabet = true;
				 alphanum = false;
				 System.out.println("alphabetized on");
			}
		});
//		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				numeric = false;
//				  alphabet = true;
//				 alphanum = false;
//				 System.out.println(" on");
				
				
			
		
		buttonGroup.add(Alphabetized);
		Alphabetized.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		Alphabetized.setBounds(125, 100, 131, 29);
		frame.getContentPane().add(Alphabetized);
		Alphabetized.setEnabled(false);
		Alphabetized.setVisible(false);
		
		JRadioButton Alphanumeric = new JRadioButton("Alphanumeric ( recommended)"); 	// alphanumeric selected
		Alphanumeric.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				alphanum = true;
				numeric = false;
				  alphabet = false;
				
				 System.out.println("alphanum on");
				
				
			}
		});
		buttonGroup.add(Alphanumeric);
		Alphanumeric.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		Alphanumeric.setBounds(263, 100, 275, 29);
		frame.getContentPane().add(Alphanumeric);
		Alphanumeric.setEnabled(false);
		Alphanumeric.setVisible(false);
		
		Copied.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		Copied.setBounds(666, 236, 113, 24);
		Copied.setVisible(false);
		Copied.setEnabled(false);
		frame.getContentPane().add(Copied);
		
		
		charNumberChoice.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		charNumberChoice.setBounds(290, 141, 166, 48);
		frame.getContentPane().add(charNumberChoice);
		
		JLabel charLabel = new JLabel("Please enter the number of characters you'd like your password to be...");
		charLabel.setBounds(152, 76, 527, 53);
		frame.getContentPane().add(charLabel);
		
		
		JButton Restart = new JButton("Restart");
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				charLabel.setVisible(true);
				charLabel.setEnabled(true);
				charNumberChoice.setVisible(true);
				Next.setEnabled(true);
				Next.setVisible(true);
				Alphabetized.setEnabled(false);
				Alphabetized.setVisible(false);
				Alphanumeric.setEnabled(false);
				Alphanumeric.setVisible(false);
				Numeric.setVisible(false);
				Numeric.setEnabled(false);
				password.setEnabled(false);
				password.setVisible(false);
				GeneratePassword.setEnabled(false);
				GeneratePassword.setVisible(false);
				Restart.setEnabled(false);
				Restart.setVisible(false);
				
				charNumberChoice.setText(null);
			}
		});
		Restart.setEnabled(false);
		Restart.setVisible(false);
		Restart.setBounds(15, 239, 117, 29);
		frame.getContentPane().add(Restart);
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				charLabel.setVisible(false);
				charLabel.setEnabled(false);
				charNumberChoice.setVisible(false);
				Next.setEnabled(false);
				Next.setVisible(false);
				Alphabetized.setEnabled(true);
				Alphabetized.setVisible(true);
				Alphanumeric.setEnabled(true);
				Alphanumeric.setVisible(true);
				Numeric.setVisible(true);
				Numeric.setEnabled(true);
				password.setEnabled(true);
				password.setVisible(true);
				GeneratePassword.setEnabled(true);
				GeneratePassword.setVisible(true);
				Restart.setEnabled(true);
				Restart.setVisible(true);
				
				
				passLength = Integer.valueOf(charNumberChoice.getText());
				password.setText(null);
				
				
			}
		});
		Next.setBounds(320, 229, 117, 40);
		frame.getContentPane().add(Next);
		
	}
	{

		
			
			
		
		
	}
	public void presser() {										// presser method
		
	if (password.getText() != null) {
		password.setText(null);
	}
	
	
	if (numeric) {
		randomizer.randomNumber();
	}
																		
	if (alphabet) {
		randomizer.randomAlphabet();
	}
	if (alphanum) {
		randomizer.randomAlphaNum();
	}
		
		
//	
//	if (alphanum)
//		password.setText("123abc");

		
		
	}
}


