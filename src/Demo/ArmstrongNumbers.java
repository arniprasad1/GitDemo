package Demo;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		//we need to find the length
		//we need to find the reminder
		//multiply with rem 
		//storing with Arm variable
		
		int no = s.nextInt();
		int t1=no;
		int length=0;
		
		while(t1!=0)
		{
			length = length +1;
			t1=t1/10;
		}
		
		int t2=no;
		int arm =0;
		
		while(t2!=0)
		{
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			
			arm=arm+mul;
			t2=t2/10;
		}
		
		if(arm==no)
		{
			System.out.println(no + " is Armstrong number");
		}
		else
		{
			System.out.println(no + " Is not an Armstrong number");
		}
		
		

	}

}
