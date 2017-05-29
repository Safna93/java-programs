class ToStringDemo
{

int n;
String str;

@Override
public String toString()
{
//System.out.println(n);
return "String is "+str+" and value is "+n;
}

public static void main(String[] args)
{
ToStringDemo obj=new ToStringDemo();
obj.n=101;
obj.str="Java";

System.out.println(obj.str);

}
}