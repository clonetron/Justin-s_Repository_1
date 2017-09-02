import java.util.Scanner;

public class calc {
	
	public static boolean done = false;
	public static double a;
	public static double b;
	public static void main(String[] args)
	
	{
	
		Scanner in = new Scanner(System.in);
		
		
		
		 System.out.println("Booting up machine, do not press any buttons");
		
		timer.timer1(); 
		
		System.out.println("Welcome to JustinsCalculator, Version 1.0");
		
		timer.timer1();
		
		System.out.println("Please input your first number");
		
		while(!done) {
		try
		{
		a = in.nextDouble();
		 System.out.println("Your first number is " + a);
		}
		 catch (Exception e)
		{
			System.out.println("That's not a number, please try again");
			
		}
		
		timer.timer1();
		
	
		
		System.out.println("Enter a second number");
		
		try
		{
		 b = in.nextDouble();
		 System.out.println("Your second number is " + b);
		
		}
		catch (Exception e)
		{
			System.out.println("That is not a number");
		}

		
		
		timer.timer1();
		
		
		System.out.println("do you want add, subtract, multiply, divide?");
		
		in.nextLine();
		
		switch(in.nextLine()) {
		
		case "add":
			System.out.println("Your sum is " + (a + b));
			break;
		
		case "subtract":
			System.out.println("Your difference is " + (a - b));
			break;
		
		case "multiply":
			System.out.println("Your product is " + (a * b)); 
			break;
		
		case "divide":
			System.out.println("Your quotient is " + (a / b));
			 break;	
			
		default:
			System.out.println("System error - did you type it in correctly?");
			break;
		
		}
		
	
		
	}
			
}
}
