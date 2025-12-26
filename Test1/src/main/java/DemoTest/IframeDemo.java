package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://www.rediff.com/
		driver.get("https://www.rediff.com/");
		
		//switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe");
		
		//find web element & print value
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);

	}

}
