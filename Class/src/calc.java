import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		double a;
		double b;
		
		{ System.out.println("Booting up machine, do not press any buttons");
		
		timer.timer1(); 
		
		System.out.println("Welcome to JustinsCalculator, Version 1.0");
		
		timer.timer1();
		
		System.out.println("Please input your first number");
		} 
		
		a= in.nextDouble();
		
		System.out.println("Your first number is " + a);
		
		timer.timer1();
		
		
		System.out.println("Enter a second number");
		b =in.nextDouble();
		System.out.println("Your second number is " + b);
		
		timer.timer1();
		
		
		System.out.println("do you want add, subtract, multiply, divide?");
		
		in.nextLine();
		
		switch(in.nextLine()) {
		
		case "add":
			System.out.println( a + b);
			break;
		
		case "subtract":
			System.out.println(a - b);
			break;
		
		case "multiply":
			System.out.println(a * b); 
			break;
		
		case "divide":
			System.out.println(a / b);
			 break;	
			
		default:
			System.out.println("System error - did you type it in correctly?");
			break;
		
		}
		
	
		
	}
			
}
	
