package Demo;

public class ChildDemo extends ParentDemo {
	
	String name = "qaclickAcademy";
	
	int a =5;
	public void getStringdata()
	{	
		int a = 10;
		int sum = a + this .a;
		System.out.println(sum);
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.getStringdata();

	}

}
