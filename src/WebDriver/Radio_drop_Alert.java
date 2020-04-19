package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_drop_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Opening the browser
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// clickign the checkbox and capturing the label and storing in a var
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		// selecting the dropdown based on the visible text of checkbox
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);

		// sending the text that was captured in opt variable and check the alert
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();

		if (text.contains(opt)) {
			System.out.println("alert matched and success");
		} else {
			System.out.println("Alert not matched");
		}
		driver.switchTo().alert().accept();

	}

}
