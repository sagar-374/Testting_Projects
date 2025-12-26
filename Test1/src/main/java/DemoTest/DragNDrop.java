package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://bestvpn.org/html5demos/drag/
		driver.get("https://bestvpn.org/html5demos/drag/");
		
		//find source and target web element
		WebElement source = driver.findElement(By.id("one"));
		WebElement target = driver.findElement(By.id("bin"));
		
		Actions act = new Actions(driver);
		
		//dragAndDrop(sourceElement, targetElement)
		act.dragAndDrop(source, target).perform();

	}

}
