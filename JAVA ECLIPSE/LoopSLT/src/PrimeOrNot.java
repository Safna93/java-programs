import java.util.Scanner;
public class PrimeOrNot
{
	public static void main(String[] args)
	{
		int num;
		int i;
		int j=0;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	
	for(i=2;i<num;i++)
		if(num%2==0)
		{
			j++;
			break;
		}
	
	if(j==0)
	{
		System.out.println("It is prime");
	}
	else
	{
		System.out.println("It is not prime");
	}

}
}