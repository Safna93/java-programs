import java.util.Scanner;
class Employee
{
private int eid;
private String ename;
private long eph_no;
private String email;

public void setEid(int eid)
{
this.eid=eid;
}

public int getEid()
{
return eid;
}

public void setEname(String ename)
{
this.ename=ename;
}

public String getEname()
{
return ename;
}

public void setEph_no(long eph_no)
{
this.eph_no=eph_no;
}

public long getEph_no()
{
return eph_no;
}

public void setEmail(String email)
{
this.email=email;
}

public String getEmail()
{
return email;
}

public static void main(String[] args)
{
 Employee obj=new Employee();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your Eid :");
 int eid=sc.nextInt();
 System.out.println("Enter your Ename :");
 String ename=sc.next();
 System.out.println("Enter your Eph_no :");
 long eph_no=sc.nextLong();
 System.out.println("Enter your Email :");
 String email=sc.next();

 obj.setEid(eid);
 obj.setEname(ename);
 obj.setEph_no(eph_no);
 obj.setEmail(email);
 
System.out.println("Employee Details");
System.out.println("Eid = "+obj.getEid());
System.out.println("Ename = "+obj.getEname());
System.out.println("Eph_no = "+obj.getEph_no());
System.out.println("Email = "+obj.getEmail());
}
}

