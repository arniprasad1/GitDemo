package Demo;

public class Sub_Class extends Super_Class {
	
	int num = 30;
	public void display()
	{
		System.out.println("this is the display of subclass" );
	}
	
	public void my_method()
	{
		Sub_Class sub = new Sub_Class();
		sub.display();
		super.display();
		
		System.out.println(" value of variable value in subclass is :" + sub.num);
		
		System.out.println("value of variable name in super class is :" + super.num);
	}
	public static void main(String[] args) {
		
		Sub_Class obj = new Sub_Class();
			obj.my_method();
	}

}
