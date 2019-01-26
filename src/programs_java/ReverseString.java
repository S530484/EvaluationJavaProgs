package programs_java;

import java.util.Scanner;

public class ReverseString {
		
		private static Scanner sc;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sc = new Scanner(System.in);
			System.out.println("Enter the string to be reversed: ");
			String str=sc.nextLine();
			
			for(int i=str.length()-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
		}

}
