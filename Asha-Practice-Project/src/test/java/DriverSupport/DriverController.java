package DriverSupport;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverController {
	
public static WebDriver _driver;
	
	public static void InitializeDriver() throws IOException, InterruptedException {
	
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		_driver = new ChromeDriver(chromeOptions);
		_driver.manage().window().maximize();
        _driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
	
	}
	
	public static String TakeScreenShot(WebDriver driver, String screenshotName) throws Exception{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/TestScreenshots/"+screenshotName+".png";
		File FinalDestination= new File(destination);
		FileUtils.copyFile(source, FinalDestination);
		System.out.println(destination);
		return destination;
		
	}
	
	

}
