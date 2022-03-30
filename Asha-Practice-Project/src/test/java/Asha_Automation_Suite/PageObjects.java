package Asha_Automation_Suite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverSupport.DriverController;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class PageObjects {
	
	
	public WebElement AddUser() {
		return DriverController._driver.findElement(By.xpath("//button[text()=' Add User']"));
	}
	
	public WebElement FirstName() {
		return DriverController._driver.findElement(By.xpath("//input[@name='FirstName']"));
	}
	
	public WebElement LastName() {
		return DriverController._driver.findElement(By.xpath("//input[@name='LastName']"));
	}
	
	public WebElement UserName() {
		return DriverController._driver.findElement(By.xpath("//input[@name='UserName']"));
	}
	
	public WebElement PassWord() {
		return DriverController._driver.findElement(By.xpath("//input[@name='Password']"));
	}
	
	public WebElement CompanyType (String CompanyType) {
		return DriverController._driver.findElement(By.xpath("//label[text()='"+CompanyType+"']"));
	}
	
	public WebElement RoleDropDown() {
		return DriverController._driver.findElement(By.xpath("//select[@name='RoleId']"));
	}
	
	public WebElement DropDownPicker(String Val) {
		return DriverController._driver.findElement(By.xpath("//option[text()='"+Val+"']"));
	}
	
	public WebElement Email() {
		return DriverController._driver.findElement(By.xpath("//input[@name='Email']"));
	}
	
	public WebElement MobilePhone() {
		return DriverController._driver.findElement(By.xpath("//input[@name='Mobilephone']"));
	}
	
	public WebElement Save() {
		return DriverController._driver.findElement(By.xpath("//button[text()='Save']"));
	}
	
	public WebElement User(String Text) {
		return DriverController._driver.findElement(By.xpath("//td[text()='"+Text+"']"));
	}
	
	public List<WebElement> Users(String Text) {
		return DriverController._driver.findElements(By.xpath("//td[text()='"+Text+"']"));
	}
	
	public WebElement CrossIcon(String User) {
		return DriverController._driver.findElement(By.xpath("//td[text()='"+User+"']/..//button[@ng-click='delUser()']"));
	}
	
	public WebElement ConfirmationScreenTitle() {
		return DriverController._driver.findElement(By.xpath("//h3[text()='Confirmation Dialog']"));
	}
	
	public WebElement ConfirmationText() {
		return DriverController._driver.findElement(By.xpath("//p[text()='Do you really want to delete the user?']"));
	}
	
	public WebElement OkButton() {
		return DriverController._driver.findElement(By.xpath("//button[text()='OK']"));
	}
	
}
