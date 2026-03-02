package example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest1 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("Launching Browser...");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testValidLogin() {
        System.out.println("Executing Login Test...");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginBtn.click();

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("inventory"),
                "Login Failed - Inventory page not loaded");

        System.out.println("Login Successful!");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Closing Browser...");
        if (driver != null) {
            driver.quit();
        }
    }
}