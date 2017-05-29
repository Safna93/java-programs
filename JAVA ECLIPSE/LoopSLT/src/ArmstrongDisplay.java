public class ArmstrongDisplay
{
	public static void main(String[] args)
	{
		int i,j,n,sum=0;
		
	System.out.println("the numbers are");
	
	for(j=100;j<=500;j++)
	{
	
	n=j;
	
		while( n > 0)
        {
             i= n % 10;
            sum = sum + (i*i*i);
            n = n/10;
        }
		if(sum==j)
		{
			System.out.println(+j);
		}
		sum=0;
	}
	
	
	
	}
}