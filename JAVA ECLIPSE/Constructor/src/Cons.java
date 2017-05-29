
public class Cons
{
	
public Cons()//default constructor
{
	System.out.println("Hai");
}

public Cons(int k)//constructor overloading,parameterized constructor

{
	System.out.println(k);
}

public Cons(float m,float n)
{
	System.out.println(m+n);
}

public static void main(String args[])
{
	Cons obj=new Cons();
	Cons obj1=new Cons(5);
	Cons obj2=new Cons(2.5f,3.6f);
	
}
}


