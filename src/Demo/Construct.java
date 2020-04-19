package Demo;

public class Construct {
	
	public Construct()
	{
		System.out.println(" I am in constructor");
	}
	
	public Construct(int a , int b)
	{
		System.out.println(" I am parameteized constructor");
	}
	
	public Construct(String str)
	{
		System.out.println(" I am parameteized string constructor");
	}
	public void getdata()
	{
		System.out.println(" i am in method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Construct c = new Construct();
		Construct c1 = new Construct(4,5);
		Construct  C3= new Construct("Rama");
	}
	

}
