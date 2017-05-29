import java.util.Scanner;
public class Armstrong
{
public static void main(String[] args)
{
	int i,j,temp,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	j=sc.nextInt();
	 temp=j;
	while(j>0)
	{
		i=j%10;
		sum=sum+(i*i*i);
		j=j/10;
	}
	if(temp==sum)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
	
}
}
