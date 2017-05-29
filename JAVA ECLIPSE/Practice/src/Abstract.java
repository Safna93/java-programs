
abstract class Abstract 
{
	abstract void bike();
	public void car()
	{
		System.out.println("Running slowly");
	}
class Abstract1 extends Abstract
{
	public void bike()
	{
		System.out.println("runn9ing fastly");
	}
}
public static void main(String[] args)
{
	Abstract1 obj=new Abstract1();
	obj.bike();
	obj.car();
}
}
