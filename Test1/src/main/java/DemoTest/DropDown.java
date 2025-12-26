package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open https://practice.expandtesting.com/dropdown
	    driver.get("https://practice.expandtesting.com/dropdown");
	    
	    WebElement element = driver.findElement(By.id("country"));
	    
	    Select dropdown = new Select(element);
	    
	    //dropdown.selectByVisibleText("Iceland");
	    dropdown.selectByValue("IN");
	    //dropdown.selectByIndex(1);
	    
	    if(dropdown.isMultiple())
	    {
	    	System.out.println("Dropdown is Multiple");
	    }
	    else
	    {
	    	System.out.println("Dropdown is Not Multiple");
	    }
	    
	    List <WebElement> alldropoptions = dropdown.getOptions();
	    
	    System.out.println("Total options: "+alldropoptions.size());
	    for(WebElement el:alldropoptions)
	    {
	    	System.err.println(el.getText());
	    }
	}

}
