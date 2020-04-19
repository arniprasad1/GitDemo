package Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileNotFound_Demo {

	public static void main(String[] args) 
	{
	
	try
	{
	
		File file = new File("E://prasad1.txt");
		FileReader fr = new FileReader(file);
	
	}
	catch (FileNotFoundException e)
	{
		System.out.println("Successfully Exception thrown");
	}

}
}
