package selenium_Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.LearnReadExcel;

public class Project_Specificmethods {
public static ChromeDriver driver;

@BeforeMethod
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

@AfterMethod
public void closeBrowser() {
	driver.close();
}

	
	  @DataProvider public String[][] sendData() throws IOException { 
		  LearnReadExcel excel = new LearnReadExcel(); 
		  String[][] data1 = excel.readExcel("Book1"); 
	  return data1;
	 
	  }
	 

}
