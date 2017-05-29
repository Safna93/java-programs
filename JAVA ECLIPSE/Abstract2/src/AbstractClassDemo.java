abstract class AbstractClassDemo
{
public void display()
{
System.out.println("Hello! This is Abstract class");
}

abstract public void printMsg();

}


abstract class AbstractDemo extends AbstractClassDemo
{
public void displayMsg()
{

System.out.println("Hello! Inside sub class");
}



}

class AbstractDemo1 extends AbstractDemo
{

public void printMsg()
{
System.out.println("Abstract method implemented");
}


public static void main(String[] args)
{
AbstractDemo1 obj=new AbstractDemo1();


obj.displayMsg();

obj.display();

obj.printMsg();

}


}