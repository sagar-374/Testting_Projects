package DemoTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
		//fluent wait of 10 sec
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(2))
		        .withMessage("This is custom message.")
		        .ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		element.click();

	}

}
