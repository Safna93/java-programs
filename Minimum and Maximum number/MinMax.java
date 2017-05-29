import java.util.Scanner;

class MinMax
{
	public static void main(String[] args)
	{
		int val,max,min;

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter number :");

		val=sc.nextInt();

		max=min=val;

		for(int i=1;i<10;i++)
		{
			System.out.println("enter number :");
			val=sc.nextInt();

			if(max<val)
			max=val;

			   if(min>val)
			     min=val;

		}
	System.out.println("highest number :"+max);
	System.out.println("lowest number :"+min);

	}




}