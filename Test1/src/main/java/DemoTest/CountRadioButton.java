package DemoTest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButton {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();

		//open url https://udyamregistration.gov.in/Udyam_Login.aspx
	    //driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net/");
	    
	    //find radio button web elements on web page
	    List <WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));
	    
	    //print total no.of radio button in radiobuttonlist
	    System.out.println("Total no. of radio button on web page: "+radioButtonList.size());
	    
	    //close current browser
	    driver.close();
	}

}
