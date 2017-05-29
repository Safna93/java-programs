
import java.util.*;
import java.util.HashSet;
class HashsetDemo
{
	public static void main(String[] args)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(9);
		hs.add(1);
		
Iterator itr=hs.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		
		
		}}
}