package programs_java;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,1,9,11,3,20,5,44,76,43};
		int n=arr.length;
		int temp=0;
		
		System.out.println("Before sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
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
		
		System.out.println("After sorting: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		 
	}

}
