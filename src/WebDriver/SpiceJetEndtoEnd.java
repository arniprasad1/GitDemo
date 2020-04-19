package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetEndtoEnd{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Opening the browser
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		//getting the current title
		System.out.println(driver.getTitle());
		//Entering the origin and destination from keyboard
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Ahmedabad(AMD)");
		Thread.sleep(2000);
		// this is for selecting the current date from the calendar
		driver.findElementByXPath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[2]/td[3]/a").click();
		// verify whether the return date is enabled or not before selecting round trip radio
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		// getting the raido button state
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// radio button to select
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// verify whether the return date is enabled after selecting round trip
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {
			System.out.println("disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("enabled");
			Assert.assertFalse(false);
		}
		
		//Checking the checkbox for family and friends
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		// driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)'])[2]")).sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MUM']")).click();

		// Selecting the pax
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 //Thread.sleep(2000);
		 driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(); 
		 //Select s=new Select(driver.findElement(null);
		 
		 Select adult=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 adult.selectByValue("5");
		 //adult.selectByIndex(3); 
		 //Thread.sleep(2000);
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 //Thread.sleep(2000);
		 //adult.selectByVisibleText("7");
		 /*Select child=new Select(driver.findElement(By.id("ctl00$mainContent$ddl_Child")));
		 driver.findElement(By.id("ctl00$mainContent$ddl_Child")).click();
		 Thread.sleep(2000);
		 child.selectByValue("2");
		 //s.selectByIndex(4);
		 //child.selectByVisibleText("4");
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */
		 //Clicking on search button
		 driver.findElementById("ctl00_mainContent_btn_FindFlights").click();
		 
		 //driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys ("covid-19");
		 

	}

}
