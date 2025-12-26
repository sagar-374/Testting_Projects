package DemoTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo3 {

    public static void main(String[] args) {
    	
    	//23-Feb-2026
        String expectedDay = "23";
        String expectedMonthYear = "February 2026";
        
        //Launch Chrome Web Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //open url https://www.goibibo.com/flights/
        driver.get("https://www.goibibo.com/flights/");
        
        //find date picker webelment to perform click action
        driver.findElement(By.xpath("//span[text()='Departure']")).click();

        while (true) {
            String monthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
            if (monthYear.equals(expectedMonthYear)) 
            {
            	List<WebElement> days = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Day') and not(contains(@class,'disabled'))]"));
            	for (WebElement day : days) {
            		if (day.getText().equals(expectedDay)) 
            		{
            			day.click();
                        System.out.println("Date Selected Successfully");
                        break;
                    }
                }
                break;
            } else {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
        }
    }
}
