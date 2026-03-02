package Selinium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open upload page
        driver.get("https://the-internet.herokuapp.com/upload");

        // File path (change to your file location)
        String filePath = "D:\\Downloads\\1770017292511-SDET- Daily Assignment- Day 18 Q3.docx";

        // Upload file
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        // Click upload button
        driver.findElement(By.id("file-submit")).click();

        // Print confirmation text
        String message = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Upload status: " + message);

        Thread.sleep(3000);
        driver.quit();
    }
}

