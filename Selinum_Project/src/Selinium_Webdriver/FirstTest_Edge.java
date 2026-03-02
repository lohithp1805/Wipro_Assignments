package Selinium_Webdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
 
public class FirstTest_Edge {
public static void main(String[] args)
	{
 
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\Wipro\\Selenium_Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
//	WebDriver driver = new FirefoxDriver();
 
	try {
		driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    String title =driver.getTitle();
	    System.out.println("Page Title" + title);
	    driver.get("https://www.selenium.dev");
	    String title1 =driver.getTitle();
	    System.out.println("Page Title" + title1);
	    Actions actions = new Actions(driver);
	    actions.scrollByAmount(0, 500).perform();
	    Thread.sleep(2000);
	    actions.scrollByAmount(0, -500).perform();
	    Thread.sleep(2000);

	    if(title.contains("Google"))
	    {
	    	System.out.println("Test Pass");
	    }
	    else
	    {
	    	System.out.println("Test Fail");
	    }
	} catch(Exception e)
	{
	System.out.println("Exception occured : " + e.getMessage());
	}
	finally
	{
		driver.quit();
	}
	}
 
}