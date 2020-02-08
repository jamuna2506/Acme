package acme_pages;

import org.openqa.selenium.Keys;

import selenium_Base.Project_Specificmethods;

public class LoginPage extends Project_Specificmethods {

	public LoginPage enterUserName(String UserName) {
		driver.findElementById("email").sendKeys(UserName,Keys.TAB);
		return this;
	}
	
	public LoginPage enterPassword(String Password) {
		driver.findElementById("password").sendKeys(Password);
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElementById("buttonLogin").click();
		return new HomePage();
	}
}
