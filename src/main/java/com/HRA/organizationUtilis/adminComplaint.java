package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminComplaint {
	//declaration
	@FindBy(xpath="//a[text()='Complaint List']")
	private WebElement lnkcomp;
	
	//constructor
	public adminComplaint(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//getter method

	public WebElement getLnkcomp() {
		return lnkcomp;
	}
	//business libraries
	public void admincomp()
	{
		lnkcomp.click();
	}
}
