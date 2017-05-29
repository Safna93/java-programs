import java.util.Scanner;

public class SumOfDigits
{
public static void main(String[] args) 
{
	
	int i,j,sum=0;
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
j=sc.nextInt();

while(j>0)
{
	i=j%10;
	sum=sum+i;
	j=j/10;
	
	
}
System.out.println("The sum is"+sum);

	
}
}

