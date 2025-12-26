package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class NestedIframeDemo {

    public static void main(String[] args) {
    	
    	//Launch Chrome Web Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		//maximize the browser window
		driver.manage().window().maximize();

        //open url https://demo.automationtesting.in/Frames.html
        driver.get("https://demo.automationtesting.in/Frames.html");

        //click on "Iframe with in an Iframe" tab
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

        //switch to outer iframe
        driver.switchTo().frame(1);

        //switch to inner iframe
        WebElement innerFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(innerFrame);

        //type inside nested iframe
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Nested Frame!");

        //switch back to outer iframe
        driver.switchTo().parentFrame();

        //switch back to main page
        driver.switchTo().defaultContent();

        //count total iframes on page
        int frameCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total iframes = " +frameCount);
    }
}
