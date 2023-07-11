package jul11th;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter some value for x : ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println("Enter some value for y : ");
		int y=input.nextInt();
		
		try
		{
			System.out.println("Quotient is "+x/y);
		}
		
		catch(ArithmeticException ae)
		{
			//ae.printStackTrace();
			System.out.println(ae.getMessage());
			System.out.println("Please enter non-zero value for y");
		}
		
		System.out.println("End of program ");
	}

}
