package jul11th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		new FileInputStream("D:\\email Ids\\LT 0730 1030 May 2023.txt");
		
		System.out.println("Enter some value for x : ");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.println("Enter some value for y : ");
		int y=input.nextInt();
		try
		{
		System.out.println("Quotient is "+x/y);
		}
		catch(Exception e)
		{
			System.out.println("Please enter non-zero value for y");
		}
		
		Thread.sleep(3000);
		
		System.out.println("End of Program");

	}

}
