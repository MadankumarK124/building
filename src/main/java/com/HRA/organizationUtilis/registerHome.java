package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRA.GenericUtilities.ExcelUtility;
import com.HRA.GenericUtilities.WebDriverUtility;

public class registerHome extends WebDriverUtility {
	// declaration
	@FindBy(linkText = "Register")
	private WebElement lnkregister;
	@FindBy(xpath = "//a[text()='Individual Home Registration']")
	private WebElement lnkhome;
	@FindBy(xpath = "//select[@name='vacant']")
	private WebElement dropdown;
	@FindBy(xpath = "(//input[@name='image'])[1]")
	private WebElement popup;
	@FindBy(xpath="(//button[@name='register_individuals'])[1]")
	private WebElement btnsubmit;

	// initilizing constructor
	public registerHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// getter method

	public WebElement getLnkregister() {
		return lnkregister;
	}

	public WebElement getLnkhome() {
		return lnkhome;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}

	public WebElement getPopup() {
		return popup;
	}

	public void setPopup(WebElement popup) {
		this.popup = popup;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

//business libraries
	public void registerHome() {
		lnkregister.click();
		lnkhome.click();

	}
	public void drop(WebDriver driver, String value)
	{
		select("0", dropdown);
	}
	
	public void submit()
	{
		btnsubmit.click();
	}

	

}
