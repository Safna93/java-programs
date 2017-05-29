class MethodOverride//Runtime
{
public void sum()
{
	System.out.println("abc");
}
}
class MethodOverride1 extends MethodOverride
{
public void sum()
{
	System.out.println("cvb");
}
}
 class Main1
{
public static void main(String[] args)
{
	MethodOverride1 ob=new MethodOverride1();
	 ob.sum();
	 
}
}








