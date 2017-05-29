class MethodOverload
{
	    public void sum(int a,int b)
	    {
	   System.out.println(+(a+b));
	    }
	    public void sum(int a,int b,int c)
	    {
	   System.out.println(+(a+b+c));
	    }
	    public static void main(String[] args) 
	    {
			MethodOverload ob=new MethodOverload();
			ob.sum(50,20);
			ob.sum(50, 50, 1);
		}
}
	   