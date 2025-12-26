package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//Launch Chrome Wed Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Launch Google Wed Page
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		
		//capture titile of webpage and print
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		
		//capture url of the webpage
		System.out.println("URL: "+driver.getCurrentUrl());
		
		driver.close();
	}

}
