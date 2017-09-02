
public class timer {
	
	public timer() {
		
	}
	
	public static void timer1() {
	
		try {									// delay for .5 seconds
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}