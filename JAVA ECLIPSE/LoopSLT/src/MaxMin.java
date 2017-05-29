import java.util.Scanner;

public class MaxMin
{

	public static void main(String[] args)
	{
		int i,j,max,min;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		i=sc.nextInt();
		max=min=i;
		
		for(j=0;j<10;j++)
		{
			System.out.println("Enter number");
			i=sc.nextInt();
			
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("The Greatest number is"+max);
		System.out.println("The smallest number is"+min);
				
			
		}
}
