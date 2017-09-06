import java.util.Random;

public class randomizer {
	
	public static Random rand = new Random();
	public static int generated;
	public static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static StringBuilder sb = new StringBuilder();
	public static String alphanumeric = "abcdefghigjklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789012345678901234567890";
	
	
	public randomizer() {
	}
		
		public static void randomAlphabet() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				char c = alpha.charAt(rand.nextInt(alpha.length()));
				Gui.password.setText(Gui.password.getText() + c);
			}
			
			
		}
		
		public static void randomNumber() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				 Gui.password.setText(Gui.password.getText() + rand.nextInt(9));
			}
			
		}
		
		public static void randomAlphaNum() {
			
			if(Gui.password.getText() != null)Gui.password.setText(null);
			
			for(int i = 0; i < 10; i++) {
				
				char c = alphanumeric.charAt(rand.nextInt(alphanumeric.length()));
				Gui.password.setText(Gui.password.getText() + c);
				
			}
			
		}
	}

