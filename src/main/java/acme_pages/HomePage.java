package acme_pages;

import selenium_Base.Project_Specificmethods;

public class HomePage extends Project_Specificmethods {

	public HomePage verifyTitle() {
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains(driver.getTitle())) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Incorrect");
		}
		return this;
	}
}
