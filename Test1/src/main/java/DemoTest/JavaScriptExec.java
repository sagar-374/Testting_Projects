package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open url https://tablepress.org/demo/
		driver.get("https://tablepress.org/demo/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//enter text in search box
		js.executeScript("document.getElementById('dt-search-0').value='Adam'");
		
		//click on find button
		WebElement element = driver.findElement(By.xpath("//button[@class='dt-toggleSearch']"));
		//js.executeScript("arguments[0].click()", element)
		JavaScriptUtility.drawBorder(element, driver);
		System.out.println(JavaScriptUtility.getTitleByJS(driver));
		JavaScriptUtility.clickElementByJS(element, driver);
		
//		//refresh browser 
//		js.executeScript("history.go(0)");
		
//		//get domain name
//		String domain = js.executeScript("return document.domain;").toString();
//		System.out.println("Domain: "+domain);
//		
//		//get title name
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println("Tittle: "+title);
//		
//		//get domain name
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println("URL: "+url);
		
//		//draw border around toggleSearch
//		js.executeScript("arguments[0].style.border = '3px solid red';",element);
		
//		//zoom 50%
//		js.executeScript("document.body.style.zoom='50%'");
//		
//		//Return height and width of web page
//		System.out.println(js.executeScript("return window.innerHeight;").toString());
//		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
//		//scroll vertically till the end
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		
//		//scroll vertically page up
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		
//		//generate alert pop window message
//		js.executeScript("alert('This is my Alert message.')");
		
//		//navigate goggle url
//		js.executeScript("window.location='http://www.google.com'");
		
		//flash
//		String bgcolor = element.getCssValue("backgroundColor");
//		for(int i=0;i<20;i++)
//		{
//			js.executeScript("arguments[0].style.backgroundColor ='#000000'",element);
//			try {
//				Thread.sleep(80);  //20ms
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'",element);
//			
//			try {
//				Thread.sleep(80);  //20ms
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}


