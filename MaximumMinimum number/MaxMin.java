import java.util.Scanner;

class MaxMin
{
	public static void main(String[] args)
	{
		// data-type[] arr_name;
		//arr_name=new int[size];

			// datatype[] array_name=new datatype[size];

		int max=0;
		int min=1;

		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[10];

		for(int i=0;i<10;i++)
		{
			
			System.out.println("enter number :");

			num[i]=sc.nextInt();

			if(max<num[i])
			{
			max=num[i];

			}

			/*if(min>num[i])
			{
			min=num[i];
			}*/
		}	

		System.out.println("highest number :"+max);
System.out.println("lowest number :"+min);


	}





}