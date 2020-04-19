package Demo;

public class ArrayMinNumber {

	public static void main(String[] args) {
		
		int b[][] = {{10,20,30},{40,5,60},{15,27,45}};
		int min = b[0][0];
		for (int i=0;i<3; i++)
		{
			for (int j=0;j<3;j++)
			{

			if(b[i][j]<min)
			{
				min=b[i][j];
				
			}
		}
	}
			System.out.println(" the min number is:" + min);
			

	}

}
