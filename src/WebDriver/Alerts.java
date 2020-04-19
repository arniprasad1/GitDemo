package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		String text = "Prasd";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).sendKeys(text);
		// driver.findElement(By.cssSelector("[id='alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id='confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
