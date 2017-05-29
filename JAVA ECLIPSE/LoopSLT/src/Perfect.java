import java.util.Scanner;
public class Perfect 
{

	public static void main(String[] args)
	{
		int k;
		int j=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
	for(k=1;k<=num/2;k++)
	
		if(num%k==0)
		{
			j=j+k;
		}
	
	if(j==num)
	{
		System.out.println("It is perfect number");
	}
	else
	{
		System.out.println("It is not a perfect number");
	}
	}
}



