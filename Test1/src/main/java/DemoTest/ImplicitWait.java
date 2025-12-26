package DemoTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
		//wait of 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Stopwatch watch = null;
		
		try {
			watch = Stopwatch.createStarted();
		//find webelement "Login"
		driver.findElement(By.linkText("Login")).click();
		}
		catch(Exception e)
		{
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
		}

	}

}
