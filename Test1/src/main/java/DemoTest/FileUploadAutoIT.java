package DemoTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadAutoIT {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://the-internet.herokuapp.com/upload
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//find choose file web element
		WebElement button = driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		try {
			Runtime.getRuntime().exec("C://Users//sagar//OneDrive//Desktop//AutoIT//FileUpload.exe" + " " + "C:\\Users\\sagar\\Downloads\\Microservices.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}








//"C:\Users\sagar\OneDrive\Desktop\AutoIT\FileUpload.au3"