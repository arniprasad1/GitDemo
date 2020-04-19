package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/index.php");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("covid-19");
	//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys(Keys.ENTER);
	//Thread.sleep(500);
	//driver.findElement(By.xpath(("//input[@name='btnK']"))).click();
	//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();
	//driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a")).click();
	driver.findElement(By.xpath("//li[a[contains(text(),'Home')]]/following-sibling::li[1]")).click();
	//driver.findElement(By.xpath("//li[a[contains(text(),'Home')]]/following-sibling::li[2]")).click();
	}

}
