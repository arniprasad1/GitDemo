package Demo;

public class ExceptionDemo {

	
	public static void main(String[] args)
	{
		
		int b=6;
		int c=0;
		
		try
		{
			int d=b/c;
			
			System.out.println(d);
		}
		
		catch(Exception e)
		{
			System.out.println("I catched the exception");
		}
			
	}
}
