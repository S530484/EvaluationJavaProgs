package programs_java;

import java.util.Scanner;

public class Fibonacci {

		private static Scanner scanner;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1=1;
			int num2=1;
			int num3=0;
			
			System.out.println("Enter the numbers till where the fibonacci nums must be printed: ");
			scanner = new Scanner(System.in);
			int n=scanner.nextInt();
			
			System.out.print(num1+ " " + num2);
			
			for(int i=2;i<n;i++)
			{
				num3=num1+num2;
				System.out.print(" "+num3);
				
				num1=num2;
				num2=num3;
			}
	}
}
