import java.util.*;
public class ListDemo 
{
	public static void main(String[] args)
	{
		//creating collection
 ArrayList list=new ArrayList();
 
 //Adding elements
 list.add("Safna");//adding string variable
 list.add("Ananthi");
 list.add(new Integer(1));//adding integer variable
 list.add(new Student(101,"Sheryl",65));//adding student variable
 
 System.out.println(list);//displaying
 //retrieving 0th index
 String str=(String)list.get(0);
 System.out.println("Element at first index is"+str);
 //retrieving 3rd index
 Student obj1=(Student)list.get(3);
 obj1.display();
 
 
 //to check which datatype of object
 for(Object ob:list)
 {
 	if(ob instanceof String)
 	{
 		String str1=(String)ob;
 		System.out.println("String:"+str1);
 	}
 	else if(ob instanceof Integer)
 	{
 		Integer intr=(Integer)ob;
 		System.out.println("Integer:"+intr);
 	}
 	else
 	{
 		Student ob1=(Student)ob;
 		System.out.println("Student:"+ob);
 	}}}}
 	


	


	