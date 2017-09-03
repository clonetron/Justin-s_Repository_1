import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WhowillWinGui {

	private JFrame frame;
	private JTextField Winner;
	private JTextField Team1;
	private JTextField Team2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhowillWinGui window = new WhowillWinGui();
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
	public WhowillWinGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Which FRC team will win?");
		lblNewLabel.setToolTipText("This works for any competition (regionals, championships, etc.)");
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(15, 16, 748, 104);
		frame.getContentPane().add(lblNewLabel);
			
		JButton PredictButton = new JButton("Predict");							// predict button
		PredictButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rand();
			}
		
		
		});
		PredictButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 43));
		PredictButton.setBounds(288, 298, 203, 94);
		frame.getContentPane().add(PredictButton);
		
		Winner = new JTextField();
		Winner.setHorizontalAlignment(SwingConstants.CENTER);
		Winner.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 53));
		Winner.setBounds(15, 408, 748, 120);
		frame.getContentPane().add(Winner);
		Winner.setColumns(10);
		
		Team1 = new JTextField();
		Team1.setToolTipText("Enter their team number");
		Team1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 46));
		Team1.setBounds(162, 173, 210, 76);
		frame.getContentPane().add(Team1);
		Team1.setColumns(10);
		
		Team2 = new JTextField();
		Team2.setToolTipText("Enter their team number");
		Team2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 46));
		Team2.setColumns(10);
		Team2.setBounds(400, 173, 210, 76);
		frame.getContentPane().add(Team2);
		
		JLabel lblTeam = new JLabel("Team 1");
		lblTeam.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam.setBounds(158, 122, 214, 34);
		frame.getContentPane().add(lblTeam);
		
		JLabel lblTeam_1 = new JLabel("Team 2");
		lblTeam_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblTeam_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeam_1.setBounds(400, 122, 210, 34);
		frame.getContentPane().add(lblTeam_1);
	}
	public void rand() {
		
		int a = Integer.parseInt(Team1.getText());
		int b = Integer.parseInt(Team2.getText());
	
		
	
		if (a == b) {
			Winner.setText("Error, duplicate teams."); 
		}
		else if ( a == 696 || b == 696) {
				Winner.setText("Circuit Breakers win!");
		
		}
		
			else 
			switch((int)(Math.random()*2 + 1)) {
			
			case  1:
			Winner.setText("Team " + a + " has won!");
			break;
		
			case 2:
			Winner.setText("Team " + b + " has won!");
			break;
			
			default: 
			Winner.setText("ERROR");
			break;
			
		
	}
}
}