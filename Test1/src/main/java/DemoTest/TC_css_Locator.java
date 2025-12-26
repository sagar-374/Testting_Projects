package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_css_Locator {

	public static void main(String[] args) {
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open Swag lab web page
		driver.get("http://www.saucedemo.com");
		
		//locate user name --- tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//locate password --- tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		//locate login button --- tag.value of class name
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//switch to product page
		String currWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowHandle);
		
		//tag.valueClass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		//tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name$=light]")).click();
		
	}

}
