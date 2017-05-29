class RunOverride 
		{
		public void sum(int a,int b)
		{
			System.out.println(a+b);
		}
		}

 class Override extends RunOverride
		{
		public void sum(int a,int b)
		{
			System.out.println(a+b);
		}
		}
class maine{
		
public static void main(String[] args)
{
	Override ob=new Override();
	ob.sum(20, 30);
}
}
