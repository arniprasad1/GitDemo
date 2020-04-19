package Demo;

public class TestArrar {
	double [] myList = {1.9,10.2,11.5,12.5};
	public static void main(String[] args) {
		double [] myList = {1.9,10.2,11.5,12.5};
		//to print all the array elements
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]+ " ");
		}
		
		// to sum all the array elements
		double total = 0;
		for(int i=0;i<myList.length;i++)
		{
			total += myList[i];
			}
		System.out.println("Total is:" + total);
		
		//to find max value in array element
		
		double max = myList[0];
		for(int i=0;i<myList.length;i++)
		{
			if(myList[i]>max)max = myList[i];
		}
		
		System.out.println("Max is :" + max);
		
		
	//for each to print array elements
	for(double element: myList)
	{
		System.out.println(element);
	}
		
	
}
	}