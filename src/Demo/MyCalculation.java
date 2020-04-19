package Demo;

public class MyCalculation extends Calculatin {
	
	public void multiplication(int x, int y) {
		
		z = x * y;
		System.out.println("The product of x and y are : " + z);
		
	}

	public static void main(String[] args) {
		int a = 30; int b = 20;
		
		MyCalculation demo = new MyCalculation();
		
		demo.additon(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);	
		
			}

}
