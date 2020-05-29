package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utility.CommonFunctions;

public class TestBase {
	public static WebDriver driver;
	CommonFunctions cf = new CommonFunctions();
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "H:/ProjectWorkSpace/TestNGListner/TestNGListner/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(cf.readPropFile().getProperty("url"));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Selenium Grid Tutorial: Hub & Node (with Example)");
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	

}
