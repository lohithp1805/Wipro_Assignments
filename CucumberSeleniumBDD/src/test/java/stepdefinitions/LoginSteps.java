package stepdefinitions;

//package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {

    WebDriver driver;

    @Given("Launch the browser")
    public void launch_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open the login page")
    public void open_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter the valid username and password")
    public void enter_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("I click on login button")
    public void click_login() {
        driver.findElement(By.id("login-button")).click();
    }
    
    @Then("I should see the products page")
    public void verify_login() {

        if(driver.getCurrentUrl().contains("inventory")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        driver.quit();
    }
}