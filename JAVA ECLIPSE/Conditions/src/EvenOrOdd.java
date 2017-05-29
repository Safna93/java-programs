import java.util.*;
public class EvenOrOdd 
{
	public int k;
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int k=sc.nextInt();
	if(k%2==0)
	{
		System.out.println("It is even");
	}
	else
	{
		System.out.println("It is odd");
	}
	sc.close();
	
}
}
