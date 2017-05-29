
public class PerfectDisplay
{
public static void main(String[] args)
{
	int i,j,limit=100,sum=0;
	System.out.println("the perfect numbers are");
	
	for(i=1;i<=limit;i++)
	{
		sum=0;
		
		for(j=1;j<i;j++)
		{
			if(i%j==0)
		     sum=sum+j;
		   }
		if(i==sum)
			{
		System.out.println(+i);
	        }
	}
}
}





