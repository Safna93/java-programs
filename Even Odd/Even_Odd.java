//Program to count the number of even and odd numbers with in a given 10numbers of array.



import java.util.Scanner;
public class Even_Odd
{
   


 public static void main(String[] args) 
    {
        int n=10;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 10 elements of array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < 10; i++) 

        {
            a[i] = s.nextInt();
        }
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}