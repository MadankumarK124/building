package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRA.GenericUtilities.ExcelUtility;

public class logo extends ExcelUtility {
	//declaration
	@FindBy(linkText="Search")
	private WebElement lnksearch;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement lnklogin;
	@FindBy(linkText="Register")
	private WebElement lnkregister;
	//constructor initilizer
	public logo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getter method
	public WebElement getLnksearch() {
		return lnksearch;
	}

	public WebElement getLnklogin() {
		return lnklogin;
	}

	public WebElement getLnkregister() {
		return lnkregister;
	}
	//business libraries
	public void logo()
	{
		lnksearch.click();
		
		lnkregister.click();
		
	}
	public void app()
	{
		lnklogin.click();
	}
	
	public void excel(String sheetname, int rowno, int colno) throws Throwable
	{
		readDataFromExcel(sheetname, rowno, colno);
	}
	
}
