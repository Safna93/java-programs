import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		 
		Contacts c1=new Contacts();
		c1.setNumber(1111);
		
		Contacts c2=new Contacts();
		c2.setNumber(2222);
		
		Contacts c3=new Contacts();
		c3.setNumber(3333);
		
		
		Contacts c4=new Contacts();
		c4.setNumber(4444);
		
		HashSet<Contacts> set=new HashSet<Contacts>();
		
		set.add(c1);
		set.add(c3);
		set.add(c4);
		set.add(c2);
		
		Iterator itr=set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
