
public class Constructor
{
	
public Constructor()
{
	System.out.println("Hello");
}
public Constructor(int a,int b)
{
	System.out.println(a+b);
}
public Constructor(int i,int j,float k)
{
	System.out.println(i*j*k);
}
public static void main(String[] args)
{
	Constructor ob1=new Constructor();
	Constructor ob2=new Constructor(3,41);
	Constructor ob3=new Constructor(5,6,3.5f);
}
}
	
	

