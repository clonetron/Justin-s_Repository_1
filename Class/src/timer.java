
public class timer {
	
	public timer() {
		
	}
	
	public static void timer1() {
	
		try {									// delay for .3 seconds
		Thread.sleep(300);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	
	public static void timer2() {
		
		try {									// delay for 1 second
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}