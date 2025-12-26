package DemoTest;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//open https://www.deadlinkcity.com/
	    driver.get("http://www.deadlinkcity.com/");
	    
	    //find hyperlinks
	    List <WebElement> linkList = driver.findElements(By.tagName("a"));
	    
	    int resCode = 200;   // 2xx response code valid link
	    int brokenLinkCount = 0;
	    
	    System.out.println("Total links on page: "+linkList.size());
	    
	    for(WebElement element:linkList)
	    {
	    	String url = element.getAttribute("href");
	    	
	    	try {
	    		
	    		URL urlLink = new URL(url);
	    		
	    		HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
	    		huc.setRequestMethod("HEAD");
	    		huc.connect();
	    		
	    		resCode = huc.getResponseCode();
	    		
	    		if(resCode >= 400)
	    		{
	    			System.out.println(url+"broken link.");
	    			brokenLinkCount++;
	    		}
	    	}
	    	catch(MalformedURLException e)
	    	{
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    }
	    
	    System.out.println("Total broken links: "+brokenLinkCount);

	}

}
