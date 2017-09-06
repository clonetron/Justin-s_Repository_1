import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class randomizer {
	
	public static Random rand = new Random();
	public static int generated;
	public static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static StringBuilder sb = new StringBuilder();
	public static String alphanumeric = "abcdefghigjklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789012345678901234567890";
	public static Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	
	
	public randomizer() {
	}
		
		public static void randomAlphabet() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				char c = alpha.charAt(rand.nextInt(alpha.length()));
				Gui.password.setText(Gui.password.getText() + c);
			}
			
			StringSelection stringSelection = new StringSelection(Gui.password.getText());
			cb.setContents(stringSelection, null);
			
			
		}
		
		public static void randomNumber() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				 Gui.password.setText(Gui.password.getText() + rand.nextInt(9));
			}
			
			StringSelection stringSelection = new StringSelection(Gui.password.getText());
			cb.setContents(stringSelection, null);
			
		}
		
		public static void randomAlphaNum() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				
				char c = alphanumeric.charAt(rand.nextInt(alphanumeric.length()));
				Gui.password.setText(Gui.password.getText() + c);
				
			}
			
			StringSelection stringSelection = new StringSelection(Gui.password.getText());
			cb.setContents(stringSelection, null);
			
		}
	}

