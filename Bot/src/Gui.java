import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frame;
	public static JTextArea textArea;

	
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

	
	public Gui() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(10, 11, 414, 178);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Intiate Windows Hack");
		btnNewButton.addActionListener(new ActionListener() {					// main method HERE
			public void actionPerformed(ActionEvent arg0) {
				
				for(int i = 0; i < Button.poop.length(); i++) {
					char c = Button.poop.charAt(i);
					textArea.setText(Character.toString(c));
				}

			}
		});
		btnNewButton.setBounds(10, 200, 414, 50);
		frame.getContentPane().add(btnNewButton);
	}
}
