package CollectionsAPI;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Krishna");
		System.out.println(a);
		//a.remove("Rahul");
		a.add(0,"prakash");
		//a.remove(2);
		//System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("prakash"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.size());
		
		
		

	}

}
