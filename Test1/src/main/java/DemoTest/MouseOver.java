package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://www.ebay.com/sellercenter
		driver.get("https://www.ebay.com/sellercenter");
		
		WebElement element = driver.findElement(By.linkText("Resources"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();   //mouseToElement() or mouse over action
	}

}
