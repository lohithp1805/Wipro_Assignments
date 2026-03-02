package Selinium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        Thread.sleep(1000);
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);
//        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Lohi");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("sai");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("322516");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);
        System.out.println("Page title after login: " + driver.getTitle());
//        Thread.sleep(2000);
        System.out.println("Order placed successfully");
        driver.quit();
    }
}

