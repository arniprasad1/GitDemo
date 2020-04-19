package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Opening the browser
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.getCurrentUrl());
		// getting the current title
		System.out.println(driver.getTitle());
		// Entering the origin and destination from keyboard
		System.out.println(driver.findElement(By.id("OneWay")).isEnabled());
		// select round trip radio
		driver.findElement(By.id("RoundTrip")).click();
		System.out.println(driver.findElement(By.id("RoundTrip")).isEnabled());

		// selecting the current date
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		// select pax
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("4");
		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("2");

		driver.findElement(By.id("AirlineAutocomplete")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("AirlineAutocomplete")).getText());

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink')")).click();

		WebElement cabin = driver.findElement(By.id("Class"));
		Select cls = new Select(cabin);
		cls.selectByValue("First");

		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
