import java.util.Scanner;
public class SortAsc 
{
	
public static void main(String[] args)
{
	

	int i,j;
	
	int temp;
	int[] num=new int[10];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers to be sort in ascending order");
	
	
	for(i=0;i<10;i++)
	{
		num[i]=sc.nextInt();
	}
	 for ( i = 0; i < 10; i++) 
     {
         for (j= i + 1; j < 10; j++) 
         {
        	 if (num[i] > num[j]) 
             {
                 temp = num[i];
                 num[i] = num[j];
                 num[j] = temp;
             }
         }
}
	 System.out.print("Ascending Order:");
     for (i = 0;i<10-1;i++) 
     {
         System.out.print(num[i]+",");
     }
     System.out.print(num[10-1]);
 }
}



