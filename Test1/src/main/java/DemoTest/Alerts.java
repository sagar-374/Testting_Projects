package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url http://uitestingplayground.com/alerts
		driver.get("http://uitestingplayground.com/alerts");
		
		//find alert button and perform click action
		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//switch to alert window and accept the alert
		//driver.switchTo().alert().accept();   //ok button is clicked
		
		//find confirm button and perform click action
		//driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		//switch to alert window and accept the alert
		//driver.switchTo().alert().dismiss();   //to cancel alert
		
		//find prompt button and perform click action
		driver.findElement(By.xpath("//button[@id='promptButton']"));
		
		//switch to alert window, enter your value
		driver.switchTo().alert().sendKeys("Sagar");
		
		//switch to alert window and accept the alert
		driver.switchTo().alert().accept();   //ok button is clicked

	}

}
