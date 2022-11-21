package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newRegistration {
	//declaration
	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	private WebElement lnkreg;
	@FindBy(xpath = "//button[@name='register']")
	private WebElement lnksubmit;
	
	//constructor
	public newRegistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getter method
	public WebElement getLnkreg() {
		return lnkreg;
	}

	public WebElement getLnksubmit() {
		return lnksubmit;
	}
	
	//business libraries
	public void register()
	{
		lnkreg.click();
	}
	public void submit()
	{
		lnksubmit.click();
	}
	

}
