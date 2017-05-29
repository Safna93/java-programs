import java.util.Scanner;

public class MinMax 


{


    public static void main(String[] args) {
       int count=0;
       int items=0;
       int newnum;
       int highest;
       int lowest;

       Scanner sc= new Scanner(System.in);
       System.out.println("How many numbers you want to enter?");
       count=sc.nextInt();
	System.out.println("Enter the numbers: ");
       newnum=sc.nextInt();

       


       for (count=0;count<items;count++)
{
                          
           if (highest<newnum)
               highest=newnum;

           if (lowest==0)
               lowest=newnum;

           else if (newnum<=lowest)
               lowest=newnum;
 }
       System.out.println("The highest number is"+highest);
       System.out.println("The lowest number is"+lowest);
    }
}