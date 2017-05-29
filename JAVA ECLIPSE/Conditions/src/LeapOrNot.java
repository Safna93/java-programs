import java.util.*;
public class LeapOrNot
{
	public int a;
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a year");
	int a=sc.nextInt();
	
	if((a%400==0)||(a%4==0)&&(a%100!=0))
	
	{
		System.out.println("This is leap year");
	}
	else
	{
		System.out.println("This is not leap year");
	}
}

}
