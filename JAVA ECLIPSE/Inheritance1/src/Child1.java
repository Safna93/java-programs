
public class Child1 extends Parent1
{
	public int m,n=7,p=6;
	public void sub()
	{
		m=n-p;
		System.out.println(m);
	}

	
public static void main(String[] args)
{
	Child1 obj=new Child1();
	obj.sum();
	obj.sub();
}
}