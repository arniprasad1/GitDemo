package Demo;

public class MethodOverloading {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double c= 12.5;
		double d= 13.5;
		
		int result1=minFunction(a,b);
		double result2 = minFunction(c,d);
		System.out.println("Minimum value is : " + result1);
		System.out.println("Minimum value is : " + result2);
	}
		public static int minFunction(int n1, int n2)
		{
			int min;
			if(n1>n2)
				min = n2;
			else
				min = n1;
				
			return min;
		}
		
		public static double minFunction(double n1, double n2)
		{
			double min;
			if(n1>n2)
				min = n2;
			else
				min = n1;
				
			return min;
		}
}
