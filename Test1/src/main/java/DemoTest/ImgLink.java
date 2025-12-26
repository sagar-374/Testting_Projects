package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgLink {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://www.opencart.com/
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//find element image link open cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
		//cverify title of the current page with expected home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test passed!");
		}
		else
		{
			System.out.println("Test failed!");
		}
		
		//browser close
		driver.close();
	}

}
