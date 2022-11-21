package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginUser {
	//declaration
	@FindBy(name="username")
	private WebElement tbusername;
	@FindBy(name="password")
	private WebElement tbpassword;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement btnlogin;
	//constructor initlization
	public loginUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getter method
	public WebElement getTbusername() {
		return tbusername;
	}
	public WebElement getTbpassword() {
		return tbpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	//busniess method
	public void loginUser(String username, String password)
	{
		tbusername.sendKeys(username);
		tbpassword.sendKeys(password);
		btnlogin.click();
	}
	

}
