import java.util.Random;

public class randomizer {
	
	public static Random rand = new Random();
	public static int generated;
	
	
	public randomizer() {
	}
		
		public static void randome() {
			
			for(int i = 0; i < 10; i++) {
				generated = rand.nextInt(9);
				System.out.print(generated);
			}
			
		}
	}

