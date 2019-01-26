package programs_java;

import java.util.Scanner;

public class Palindrome {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number to check whether it is a palindrome or not: ");
		scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println("The given number is a palindrome? "+palindrome(num));
	}
	
	public static boolean palindrome(int num)
	{
		int temp=num,rev=0;
		boolean chk=false;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if(temp==rev)
			chk=true;
		else
		{
			chk=false;
		}
		return chk;
	}

}
