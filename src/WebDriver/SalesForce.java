package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("arnipra");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("234234");
		driver.findElement(By.xpath("//input[contains(@name='Log')]")).click();
		//driver.close();

	}

}