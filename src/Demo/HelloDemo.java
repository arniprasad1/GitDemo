package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelloDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//Validate if page title is correct
		System.out.println(driver.getTitle());
		//validate if landed url is correct 
		System.out.println(driver.getCurrentUrl());
		driver.get("http://yahoo.com");
		driver.quit();
		
		
	}

}
