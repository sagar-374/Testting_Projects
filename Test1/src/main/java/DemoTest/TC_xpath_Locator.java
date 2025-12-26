package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//open sauce demo page
		driver.get("http://www.saucedemo.com");
		
		//locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//locate password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		//locate login button by classname
		driver.findElement(By.className("submit-button")).click();
		
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//locate Sauce Labs Bolt T- Shirt
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));   
		System.out.println("Element size: "+elementList.size());
		
	}

}
