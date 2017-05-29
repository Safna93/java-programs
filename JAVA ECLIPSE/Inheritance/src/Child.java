

public  class Child extends Parent
{
	public void run()
	{
		System.out.println("I can run");
	
	}
	public static void main(String args[])
	{
		Child ob=new Child();
		ob.sit();
		ob.stand();
		ob.run();
		

	}
}