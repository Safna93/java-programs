import java.util.Scanner;
public class EvenOddCount
{


    public static void main(String[] args) 
    {
        int  even = 0, odd= 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        int n = s.nextInt();
        int[] a = new int[10];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
        }
        
        
        for(int i = 0; i < 10; i++)
        {
            if(a[i] % 2 == 0)
            {
                even = even + a[i];
            }
            else
            {
                odd = odd+ a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+even);
        System.out.println("Sum of Odd Numbers:"+odd);
    }
}


