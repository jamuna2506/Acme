package testCases;

import org.testng.annotations.Test;

import acme_pages.LoginPage;
import selenium_Base.Project_Specificmethods;

public class TC001_Login extends Project_Specificmethods {
	/*
	 * @BeforeTest public void setData() { excelFileName = "Book1"; }
	 */
@Test(dataProvider = "sendData")
public void runLogin(String UserName,String Password) {
	new LoginPage()
	.enterUserName(UserName)
	.enterPassword(Password)
	.clickLoginButton()
	.verifyTitle();
}
}
