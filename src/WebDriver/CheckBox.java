package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//Below prog is to check whether the check box is selected and then deselected. Also with the check box count
		
		/*Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		*/
		
		//Verify able to select the drop down values from select drop down and print the selected value
		// so use select class
		/*Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropdown.selectByValue("option2");
		System.out.println(driver.findElement(By.xpath("//option[@value='option3']")).getText());
		*/
		
		//verify the suggestion dropdown
		driver.findElementByXPath("//input[@id='autocomplete']").click();
		driver.findElementByXPath("//input[@id='autocomplete']").sendKeys("chi");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='autocomplete']").sendKeys(Keys.ARROW_DOWN);
		driver.findElementByXPath("//input[@id='autocomplete']").sendKeys(Keys.ARROW_DOWN);
		driver.findElementByXPath("//input[@id='autocomplete']").sendKeys(Keys.ENTER);
		
	}

}
