package WebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Opening the browser
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		//System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		//System.out.println(driver.getTitle());
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Parentid);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
		
		
		
		
		
	}

}
