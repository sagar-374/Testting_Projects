package DemoTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://testautomationpractice.blogspot.com/
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		//capture full page screenshot
//		//step1: convert webdriver object to TakesScreenshot interface
//		
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//		
//		//step2: call getScreenshotAs method to create image file
//		File src = screenshot.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("C:\\Users\\sagar\\eclipse-workspace\\Test1\\Screenshot\\fullpage.png");
//		
//		//step3: copy image file to destination
//		FileUtils.copyFile(src, dest);
		
		//capture section of a wepage screenshot
		//step1: convert webdriver object to TakesScreenshot interface
		
		WebElement section = driver.findElement(By.xpath("//select[@id='colors']"));
		
		//step2: call getScreenshotAs method to create image file
		File src = section.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\sagar\\eclipse-workspace\\Test1\\Screenshot\\section.png");
		
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);

	}

}
