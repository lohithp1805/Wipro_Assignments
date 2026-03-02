package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooLogin {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		
		driver.get("https://login.yahoo.com/");

//		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).click();

		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("lohithpadmanabhuni@yahoo.com");

		
//		String error = driver.findElement(By.className("error-msg")).getText();
//
//		if (error.contains("don't recognise this email")) {
//		    System.out.println("Invalid Username entered");
//		    driver.quit();
//		}
//		else {
//		    System.out.println("Username is valid");
//		}
//
//		
//		
//		WebElement checkbox = driver.findElement(By.id("persistent"));
//
//		if (!checkbox.isSelected()) {
//		    checkbox.click();
//		    System.out.println("Check Box Clicked");
//		}else {
//			System.out.println("Check box not clicked");
//		}
//		
//
//		
		driver.findElement(By.name("signin")).click();
	
		driver.findElement(By.name("password")).sendKeys("Lohi@2004");
	
		driver.findElement(By.name("verifyPassword")).click();
		
	}

}