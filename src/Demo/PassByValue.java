package Demo;

public class PassByValue {

	public static void main(String[] args) {
	int a=30;
	int b=40;
	System.out.println("Before swapping the values, the value of a is:" + a  + " and value of b is:" +b);
	
	swapFunction(a,b);
	System.out.println("Now before and after swapping the value of a is: " + a + " the value of b is: " + b);
	
		}
	public static void swapFunction(int a , int b)
	{
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping the value of a is: " + a + " and the value of b is: " + b);
		
	}
}
