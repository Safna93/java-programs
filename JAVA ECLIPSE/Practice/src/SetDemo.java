class MethodOverload
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
MethodOverload obj1=new MethodOverload();
obj1.sum(5,3);
obj1.sum(a, b);
}
}
