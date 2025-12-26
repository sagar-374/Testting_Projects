package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Launch https://www.calculator.net/
		driver.get("https://www.calculator.net/");
		
		//locate totol hyperlinks
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links on webpage: "+linkElements.size());
		
		//text totol links 
		for(WebElement e1:linkElements)
		{
			System.out.println(e1.getText());
		}
	}

}
