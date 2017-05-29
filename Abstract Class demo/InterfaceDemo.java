import java.util.Scanner;


interface MyInterface
{
public void printMsg();

public void display(int id, String name);


}


class Sample
{
private int id;
private String name;

public void setId(int id)
{
this.id=id;

}

public int getId()
{
	return id;
}

public void setName(String name)
{
this.name=name;

}

public String getName()
{
	return name;
}
}

class InterfaceDemo extends Sample implements MyInterface
{


	public void printMsg()
	{	
		System.out.println("abstract method implemented");
	}


	public void display(int id, String name)
	{	
		System.out.println("Id is "+id+" & Name is "+name);
	

	}
	public static void main(String[] args)
	{
		InterfaceDemo obj=new InterfaceDemo();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your id :");
		int sid=scan.nextInt();
		System.out.println("Enter your name :");
		String sname=scan.next();

		obj.setId(sid);
		obj.setName(sname);

		obj.printMsg();
		obj.display(obj.getId(), obj.getName());


	}
		


}