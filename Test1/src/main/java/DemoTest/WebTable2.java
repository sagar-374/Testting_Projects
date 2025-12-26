package DemoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		//Launch Chrome Web Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar\\DemoTest\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//open https://testautomationpractice.blogspot.com/
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total rows in webtable
		List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("rows: "+rowList.size());   //total no. of rows
		
		//find total column in webtable
		List <WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("column: "+columnList.size());   //total no. of column
		
		for(int r=2;r<=rowList.size();r++)  //2 3
		{
			for(int c=1;c<=columnList.size();c++) //1 2
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.println(data);
			}
		}

	}

}
