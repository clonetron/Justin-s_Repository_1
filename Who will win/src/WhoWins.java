import java.util.Scanner;

public class WhoWins {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		int rand = ((int)(Math.random()*2 + 1));
		
		
		System.out.println("Please type the first team");
		
		Scanner in= new Scanner(System.in);
		
		a = in.nextInt();
		
		System.out.println("Please type the second team");
		
		b = in.nextInt();	
		
		System.out.println("Predicting future, please wait");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch((int)(Math.random()*2 + 1)) {
		
		case  1:
			System.out.println(a + " has won");
			break;
		
		case 2:
			System.out.println(b + " has won");
			break;
			
		default: 
			System.out.println("If you got this message, you really messed up the program");
			
		}
		}
		
			

	}


