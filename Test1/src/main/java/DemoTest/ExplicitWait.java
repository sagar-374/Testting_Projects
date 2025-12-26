package DemoTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
		//explicit wait of 10 sec
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Stopwatch watch = null;
		
		try {
			watch = Stopwatch.createStarted();
		//find webelement "Login"
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login1")));
		element.click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}
	}

}
