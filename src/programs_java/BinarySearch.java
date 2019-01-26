package programs_java;

import java.util.Scanner;

public class BinarySearch {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,1,9,11,3,20,5,44,76,43};
		int n=arr.length;
		int temp=0;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		int mid=n/2;
		sc = new Scanner(System.in);
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(key<=arr[mid] && mid!=0)
			{
				
			}
		}
		
		
	}

}
