package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://practice-automation.com/iframes/
		driver.get("https://practice-automation.com/iframes/");
		
		//switch to 1st frame
		WebElement iframeElement = driver.findElement(By.name("top-iframe"));
		driver.switchTo().frame(iframeElement);
		
		//find web element on 1st frame
		driver.findElement(By.className("getStarted_Sjon")).click();

	}

}
