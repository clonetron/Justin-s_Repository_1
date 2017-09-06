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
		
		password = new JTextField();
		password.setEditable(false);
		password.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 42));
		password.setBounds(15, 165, 764, 62);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Numeric");						//numeric selected
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numeric = true;
				  alphabet = false;
				 alphanum = false;
				 System.out.println("Numeric on");
			}
		});
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(15, 100, 103, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Alphabetized");				//alpha selected
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
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
				
				
			
		
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(125, 100, 131, 29);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Alphanumeric ( recommended)"); 	// alphanumeric selected
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				alphanum = true;
				numeric = false;
				  alphabet = false;
				
				 System.out.println("alphanum on");
				
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		rdbtnNewRadioButton_2.setBounds(263, 100, 275, 29);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		Copied.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 12));
		Copied.setBounds(666, 236, 113, 24);
		Copied.setVisible(false);
		Copied.setEnabled(false);
		frame.getContentPane().add(Copied);
	}
	{

		
			
			
		
		
	}
	public void presser() {										// presser method
		
	if (password.getText() != null) {
		password.setText(null);
	}
	
	
	if (numeric) {
<<<<<<< HEAD
=======
		randomizer.randomNumber();
	}
	
	if (alphabet) {
		randomizer.randomAlphabet();
>>>>>>> refs/remotes/origin/master
		
		for(int i = 0; i < 13; i++) {
//			String alphabet = "abcdefghijklmnopqrstuvwxyz";
//			char blah = alphabet.charAt(rand.nextInt(26));
			int blah = (rand.nextInt(9));
			password.setText(password.getText() + blah); 
			System.out.print(blah);
		}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
			
		}
																	
	
	
<<<<<<< HEAD
	if (alphabet) {
		for(int i = 0; i < 4; i++) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char blah = alphabet.charAt(rand.nextInt(alphabet.length()));
		password.setText(password.getText() + blah);
		
		
	}}
=======
>>>>>>> refs/remotes/origin/master
	if (alphanum) {
<<<<<<< HEAD
		for(int i = 0; i < 13; i++) {
			String alphabet = "abdefghijklmnopqrstuvwxyz1234567890";
			char blah = alphabet.charAt(rand.nextInt(alphabet.length()));
			password.setText(password.getText() + blah);
			
		}
=======
		randomizer.randomAlphaNum();
>>>>>>> refs/remotes/origin/master
	}
		
		
//	
//	if (alphanum)
//		password.setText("123abc");

		
		
	}
}


