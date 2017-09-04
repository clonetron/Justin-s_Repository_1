import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static int a;
	public static int b;
	public static void main(String[] args) {
		
		System.out.println("Hello! Welcome to Password Generator!");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Choose the length of your password.");
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		
		if (a <= 4) {
		System.out.println("Warning : Short passwords are not recommended.");
		}
		else System.out.println("Your word will be " + a +" characters long");
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Generating password, please wait");
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	    Random r = new Random();

	    String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
	    for (int i = 0; i < a; i++) {
	        System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
	    
	    } 
		
		

		
			
		}
}
	
		







