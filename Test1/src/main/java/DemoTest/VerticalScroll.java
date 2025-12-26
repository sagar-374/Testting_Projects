package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://datatables.net/examples/basic_init/scroll_xy.html
		driver.get("https://datatables.net/examples/basic_init/scroll_xy.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		//scroll vertically down by 500 pixel
//		js.executeScript("window.scrollBy(0,500)");   
		
//		//scroll till visibility of web element
//		WebElement element = driver.findElement(By.linkText("BMI Calculator"));
//		js.executeScript("arguments[0].scrollIntoView();",element);
		
//		//To scroll down the web page at the bottom of the page
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//Horizontal scroll on the web page
		WebElement element = driver.findElement(By.className("dt-scroll-body"));
		js.executeScript("arguments[0].scrollIntoView();",element);

	}

}
