package Asha_Automation_Suite;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverSupport.DriverController;

public class TestSuite {
	
	@BeforeClass
	public static void beforeClass() throws IOException, InterruptedException {
		DriverController.InitializeDriver();
	}
	
	@After
	public void after() throws IOException, InterruptedException{
		DriverController._driver.navigate().refresh();
	}
	
	@AfterClass
	public static void afterClass() throws IOException, InterruptedException{
		DriverController._driver.quit();
	}

	@Test
	public void AddUser() throws InterruptedException, IOException{
		
		new BusinessLogic().ClickAddUser().EnterFirstName("Asha").EnterLastName("Konakanchi").EnterUserName("Akona").
		EnterPassword("Password").SelectCompanyType("Company AAA").SelectRole("Customer").EnterEmail("TestEmail.1@gmail.com")
		.EnterPhone("1111111111").Save().VerifyUser("Asha", "Konakanchi", "Akona");

    }
	
	@Test
	public void DeleteUser() throws InterruptedException, IOException{
		new BusinessLogic().DeleteUser("novak").VerifyUser("novak");

    }

}


