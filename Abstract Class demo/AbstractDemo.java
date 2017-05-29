abstract class AbstractClassDemo
{
public void display()
{
System.out.println("Hello! This is Abstract class");
}

abstract public void printMsg();

}


class AbstractDemo extends AbstractClassDemo
{
public void displayMsg()
{

System.out.println("Hello! Inside sub class");
}

public void printMsg()
{
System.out.println("Abstract method implemented");
}

public static void main(String[] args)
{
AbstractDemo obj=new AbstractDemo();


obj.displayMsg();

obj.display();

obj.printMsg();

}

}