package WebDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartAdd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnip\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Opening the browser
		String [] itemsNeeded = {"Cucumber","Tomato","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		List<WebElement> products = driver.findElementsByCssSelector("h4.product-name");
		for(int i=0;i<products.size();i++)
		{
			
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
		//cucumber will fall in name[0]th index and 1 kg will fall on name[1]1st index it will have a separator '-'
			// format it to get actual vegitable name as it has space 1-kg. 
			
			//convert array in to array list for easy search
			//check whether name you extract is present in the array or not
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			int j=0;
			if(itemsNeededList.contains(formattedname))
			{
				j++;
				//add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3)
				{
					break;
				}
				
			}
			
		}
		
		

	}

}
