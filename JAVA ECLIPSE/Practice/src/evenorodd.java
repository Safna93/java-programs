import java.util.Scanner;
public class evenorodd
{ 
	public static void main(String[] args)
	{
		int a ,k=0,i;
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		  int j=sc.next().charAt(0);
		
		
		
		for(i=0;i<j;i++)
		 if(j%2==0)
		 {
			 k++;
			 break;
		 }
		if(k==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}