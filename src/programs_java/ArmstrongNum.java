package programs_java;


public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int amst=num;
		int sum=0;
		
		while(num>0)
		{
			sum=(int) (sum+Math.pow((double)num%10, 3));
			num=num/10;
		}
		
		if(amst==sum)
		{
			System.out.println(args[0]+" - yes it is amstrong");
		}
		else
		{
			System.out.println(args[0]+" - no it is not amstrong");
		}
	}

}
