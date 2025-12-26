package DemoTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://www.google.com/
		driver.get("https://www.google.com/");
		System.out.println("first page: "+driver.getTitle());
		
		//open new tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		System.out.println("second tab: "+driver.getTitle());
		
		//get window handle 
		Set <String> windowHandles = driver.getWindowHandles();
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));         //swich to google.com
		System.out.println("first page: "+driver.getTitle());
	}

}
