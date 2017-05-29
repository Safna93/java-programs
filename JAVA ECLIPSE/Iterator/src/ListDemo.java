
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
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
 
 //System.out.println(list);//displaying
 
 //retrieving 0th index
 /*String str=(String)list.get(0);
 System.out.println("Element at first index is"+str);
 
 //retrieving 3rd index
 Student obj1=(Student)list.get(3);
 obj1.display();*/
 
 
 //iterator
 Iterator itr=list.iterator();
 
 //list iterator
 //ListIterator itr=list.listIterator();
 
 while(itr.hasNext())//check whether iterator has element or not
 {
 	Object ob=itr.next();
 	
 	if(ob instanceof String)
 	{
 		String str1=(String)ob;
 		System.out.println("String:"+str1);
 		if(str1.equals("Safna"))//removing String if we need
 			itr.remove();
 	}
 	else if(ob instanceof Integer)
 	{
 		Integer intr=(Integer)ob;
 		System.out.println("String:"+intr);
 		if(intr.equals(1))//removing integer
 			itr.remove();
 	}
 	else
 	{
 		Student ob1=(Student)ob;
 		System.out.println("Student:"+ob1);
 	}
 	}
 
	
	System.out.println(list);
	
	
	}
}
 	
