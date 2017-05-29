
public class Student 
	{
	int sid;
	String sname;
	int smark;

	public Student(int sid,String sname,int smark)
	{
		this.sid=sid;
		this.sname=sname;
		this.smark=smark;
	}
	public void display()
	{
		System.out.println("Student id is:"+sid);
		System.out.println("Student Name is:"+sname);
		System.out.println("Student mark is:"+smark);
		
	}
	
public String toString()
{
	return "Studentid:"+sid+"Studentname:"+sname+"Student mark:"+smark;

}
}