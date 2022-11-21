package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	//declaration
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement btnlogout;
	
	//constructor
	public logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//getter mathod
	public WebElement getBtnlogout() {
		return btnlogout;
	}
	//busniess method
	public void logout()
	{
		btnlogout.click();
	}
	

}
