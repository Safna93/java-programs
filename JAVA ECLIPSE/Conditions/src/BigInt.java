import java.util.*;
public class BigInt
{

public static void main(String[] args)
{
	 int i,j,k;

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	i=sc.nextInt();
	
	System.out.println("Enter 2nd number");
	j=sc.nextInt();
	
	System.out.println("Enter 3rd number");
	k=sc.nextInt();
	
	
	BigInt o=new BigInt();
	if(i>j&&i>k)
		
	{
		System.out.println("First number is largest");
	}
	else if (j>k&&j>i)
	{
		System.out.println("Second number is greatest");
		
	}
	else if(k>i&&k>j)
	{
		System.out.println("Third number is greatest");
	}
	else
	{
	}
	}
}

