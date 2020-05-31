package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import utility.CommonFunctions;

public class SeleniumGrid {
	CommonFunctions cf = new CommonFunctions();
	
	@Test
	public void seleniumGridTest() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "H:/ProjectWorkSpace/TestNGListner/TestNGListner/drivers/chromedriver.exe");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		//cap.setVersion("83.0.4");
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://192.168.43.18:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.guru99.com/introduction-to-selenium-grid.html");
		
	}
	
	

}
