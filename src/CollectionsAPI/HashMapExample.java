package CollectionsAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(0, "Prasad");
	hm.put(1, "Bhavana");
	hm.put(5, "Bhavana");
	hm.put(10, "Sanjana");
	hm.put(20, "Sadana");
	
	//System.out.println(hm.get(1));
	Set sn = hm.entrySet();
	Iterator it = sn.iterator();
	
	while (it.hasNext())
	{
		Map.Entry mp =(Map.Entry) it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
	}
	
	
	}

}
