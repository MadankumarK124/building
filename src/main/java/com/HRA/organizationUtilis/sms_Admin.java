package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRA.GenericUtilities.WebDriverUtility;

public class sms_Admin extends WebDriverUtility {
	//declaration
	@FindBy(xpath="//a[text()='Send SMS']")
	private WebElement lnksms;
	@FindBy(xpath="(//input[@name='check[]'])[5]")
	private WebElement checkbox;
	@FindBy(xpath="//input[@name='message']")
	private WebElement tbsms;
	@FindBy(xpath="//button[@name='sms_alert']")
	private WebElement btnsendsms;
	
	//constructor
	public sms_Admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getter method
	public WebElement getLnksms() {
		return lnksms;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getTbsms() {
		return tbsms;
	}

	public WebElement getBtnsendsms() {
		return btnsendsms;
	}
	//business libraries
	public void sms(String data)
	{
		lnksms.click();
		checkbox.click();
		tbsms.sendKeys(data);
		btnsendsms.click();
	}
	// scroll to name
	public void scrollTocheck(WebDriver driver)
	{
		scrollAction(driver, checkbox);
	}
	
	
	
	
}
