import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
	int i,j,temp,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	j=sc.nextInt();
	temp=j;
	while(j>0)
	{
		i=j%10;
		sum=(sum*10)+i;
		j=j/10;
	}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
}
}
