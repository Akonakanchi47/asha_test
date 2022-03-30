package Asha_Automation_Suite;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import DriverSupport.DriverController;

public class BusinessLogic {
	
	PageObjects PageObj = new PageObjects();
	
	
	public BusinessLogic GetInstance(String MethodName) {
		return this;
	}
	
	public BusinessLogic ClickAddUser() {
		try {
			PageObj.AddUser().click();
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	public BusinessLogic EnterFirstName(String FirstName) {
		try {
			PageObj.FirstName().click();
			PageObj.FirstName().sendKeys(FirstName);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic EnterLastName(String LastName) {
		try {
			PageObj.LastName().click();
			PageObj.LastName().sendKeys(LastName);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	public BusinessLogic EnterUserName(String UserName) {
		try {
			PageObj.UserName().click();
			PageObj.UserName().sendKeys(UserName);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic EnterPassword(String Password) {
		try {
			PageObj.PassWord().click();
			PageObj.PassWord().sendKeys(Password);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic SelectCompanyType(String CompanyType) {
		try {
			PageObj.CompanyType(CompanyType).click();
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic SelectRole(String RoleType) {
		try {
			PageObj.RoleDropDown().click();
			PageObj.DropDownPicker(RoleType).click();
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic EnterEmail(String Email) {
		try {
			PageObj.Email().click();
			PageObj.Email().sendKeys(Email);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic EnterPhone(String Phone) {
		try {
			PageObj.MobilePhone().click();
			PageObj.MobilePhone().sendKeys(Phone);
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic Save() {
		try {
			PageObj.Save().click();
			DriverController.TakeScreenShot(DriverController._driver,"UserAdded");
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic VerifyUser(String FirstName, String LastName, String UserName) {
		try {
			if(PageObj.User(FirstName).isDisplayed()&&PageObj.User(LastName).isDisplayed()&&PageObj.User(UserName).isDisplayed()) {
				System.out.println("User has been added successfully");
			}
			else {
				Assert.fail("User is not added");				
			}
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic VerifyUser(String UserName) {
		try {
			if (PageObj.Users(UserName).size()>0) 
			{
				org.junit.Assert.fail("User is not deleted");
			} else {
				System.out.println("User has been deleted successfully");
			}
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	public BusinessLogic DeleteUser(String UserName) {
		try {
			PageObj.CrossIcon(UserName).click(); 
			if(PageObj.ConfirmationScreenTitle().isDisplayed()&&PageObj.ConfirmationText().isDisplayed()) {
				System.out.println("Confirmation Pop up is displayed");
			}
			PageObj.OkButton().click(); 
			DriverController.TakeScreenShot(DriverController._driver, "UserDeleted");
			
		} catch (Exception e) {
			System.out.println("Failed during method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			org.junit.Assert.fail(e.getMessage());
		}
		return this.GetInstance(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	


}
