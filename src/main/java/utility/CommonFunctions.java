package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class CommonFunctions {
	FileInputStream fis;
	Properties prop;
	
	public Properties readPropFile()
	{
		File src = new File("H:\\ProjectWorkSpace\\TestNGListner\\TestNGListner\\config\\env.properties");
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e1) {
			System.out.println("File not available");
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("No properties");
		}
	    return prop;
		
	}
	public void takesrnshot(WebDriver driver, String file)
	{

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(src, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+new Date().toString().replace(':', '_')+file));
			
		} catch (IOException e) {
			 e.printStackTrace();
		}
				
	}

}
