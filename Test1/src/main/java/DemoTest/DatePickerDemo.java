package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		//23-Feb-2026
		String expectedDay = "23";
		String expectedMonth = "February";
		String expectedYear = "2026";
		
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://jqueryui.com/datepicker/
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to iframe
		driver.switchTo().frame(0);
		
		//find date picker webelment to perform click action
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		while(true)
		{
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
			{
				List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:daysList)
				{
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay))
					{
						e.click();
						break;
					}
				}
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

	}

}
