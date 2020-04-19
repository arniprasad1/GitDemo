package Demo;

public class VirtualDemo {

	public static void main(String[] args) {
		Salary s = new Salary("KP", "1803 W Golf Rd Apt 99",3, 10000.00);
		Employee1 e= new Salary("Prasad", "Krishna", 5, 20000.00);
		System.out.println("Call mail check using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mail check using Employee reference --");
		e.mailCheck();		
		
	}

}
