
public class randomizer {
	
	public randomizer() {
	}
		
		public static void randome() {
			
		
			
			for(int i = 0; i < 10; i++) {
				Gui.password.setText(Integer.toString((int)(Math.random()*60 + 1)));
				
			}
			
			
		}
	}

