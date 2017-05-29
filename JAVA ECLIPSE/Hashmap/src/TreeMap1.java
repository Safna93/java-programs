

import java.util.Set;
import java.util.TreeMap;
public class TreeMap1
{

	public static void main(String[] args)
	{
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(500, "Safna");
		hm.put(200, "Fathima");
		hm.put(900, "Anu");
		
		Set<Integer> keys=hm.keySet();
		for(Integer integr:keys)
		{
			String str=hm.get(integr);
		
			
		}
		System.out.println(hm);
		
	}

}
