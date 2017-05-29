
public class CompileOverLoad
{
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
 public void sum(int a,int b,int c)
 {
	 System.out.println(a+b+c);
	 
 }
 public static void main(String[] args)
 {
	 CompileOverLoad ob=new CompileOverLoad();
	 ob.sum(50, 60);
	 ob.sum(20, 30, 40);
 }
}

