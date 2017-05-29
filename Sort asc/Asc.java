import java.util.Scanner;

class Asc
{

	public static void main(String[] args)
		{
		int n;
		int temp;
  		int[] num=new int[10];

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of integers to sort");



for (int i = 0; i < 10; i++) 
        {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) 
        {
            for (int j= i + 1; j < 10; j++) 
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
        for (int i = 0;i<10-1;i++) 
        {
            System.out.print(num[i]+",");
        }
        System.out.print(num[10-1]);
    }
}
