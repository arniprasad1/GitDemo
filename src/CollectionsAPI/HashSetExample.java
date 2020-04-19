package CollectionsAPI;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
	HashSet<String> hs = new HashSet<String>();
	hs.add("India");
	hs.add("USA");
	hs.add("India");
	hs.add("London");
	hs.add("Canada");
	System.out.println(hs);
	
	java.util.Iterator<String> i = hs.iterator();
	while (i.hasNext())
	{
		
		System.out.println(i.next());
	}
	

	}

}
