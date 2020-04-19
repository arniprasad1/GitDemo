package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//Validate if page title is correct
		System.out.println(driver.getTitle());
		//validate if landed url is correct 
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.cssSelector("#email")).sendKeys("arnipr");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("asdfasd");
		driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
		driver.findElement(By.cssSelector("[value='Log In'//]")).click();
		//driver.close();
				
		
		
		
	}

}
