import java.util.*;
public class MapDemo
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String>hm=new TreeMap<Integer,String>();
		hm.put(100, "Safna");
		hm.put(200, "Fathima");
		hm.put(300, "Anu");
		
		Set<Integer> keys=hm.keySet();
		for(Integer integr:keys)
		{
			
			String str=hm.get(integr);
			
			System.out.println(hm);
		}
		
		
	}

}
