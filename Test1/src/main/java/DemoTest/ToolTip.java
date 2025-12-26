package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.globalsqa.com/demoSite/practice/tooltip/forms.html
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
		//find web element age input box
		String actualTooltip = driver.findElement(By.xpath("//input[@id='firstname']")).getAttribute("title");
		
		String expectedTooltip = "Please provide your firstname";
		
		if(actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
