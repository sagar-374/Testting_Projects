package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		
		//23-Feb-2026
		String expectedDay = "23";
		String expectedMonthYear = "February 2026";
		
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		
		//find date picker webelment to perform click action
		WebElement datepicker = driver.findElement(By.xpath("//div[@class='dateInputWrapper___74d4df dateHighlight___6cd98b']"));
		datepicker.click();
		
		while(true)
		{
			String calenderMonthYear = driver.findElement(By.xpath("//p[@class='monthYear___2b924f']")).getText();
			
			if(calenderMonthYear.equals(expectedMonthYear))
			{
				driver.findElement(By.xpath("//span[text()='23']")).click();
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___2dd861 right___841620 ']")).click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
