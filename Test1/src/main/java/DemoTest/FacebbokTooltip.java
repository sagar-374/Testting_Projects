package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebbokTooltip {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		//find sign up web element
		String actualTooltip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		
		String expectedTooltip = "Sign up for Facebook";
		
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
