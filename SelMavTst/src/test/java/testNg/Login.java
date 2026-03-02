package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class Login 
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
//	@Test(dataProvider="excelData")
	@Test(dataProvider="csvData")
	
	public void loginTest(String username, String password) throws Exception 
	{
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		
		 boolean userExists = DBUtils.isUserPresent(username);

	        if (userExists) {
	            System.out.println(username + " exists in database");
	        } else {
	            System.out.println(username + " NOT found in database");
	        }
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name = "csvData")
	public Object[][] getCSVData() throws Exception {
	    return CSVUtils.getCSVData("D:\\Wipro_HandsOn\\SelMavTst\\src\\TestData\\details.csv");
	}

//	@DataProvider(name="excelData")
//	public Object[][] getExcelData()throws Exception
//	{
//		return ExcelUtils.getEcelData("D:\\Wipro_HandsOn\\SelMavTst\\src\\TestData\\Sheet1.xlsx","Sheet1");
//	}
// 
 
}
