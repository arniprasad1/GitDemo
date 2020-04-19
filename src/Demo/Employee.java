package Demo;

public class Employee {
	
		public String name;
		private double salary;
		
		public void Employee(String empname) {
			name = empname;
		}
		
		public void setsalary(double empsal) {
			salary = empsal;
		}
	


	public void printemp()
	{
		System.out.println("Employee Name: "+ name);
		System.out.println("Empsalary : " + salary);
	}
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.Employee("KrishnaPrasad");
		emp.setsalary(100000);
		emp.printemp();
		
		}
	

}
