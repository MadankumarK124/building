package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRA.GenericUtilities.ExcelUtility;

public class editUser extends ExcelUtility {
	@FindBy(xpath = "(//a[@class='nav-link'])[5]")
	private WebElement lnkupdate;
	@FindBy(xpath = "(//a[contains(@class,'btn btn-warning float-right')])[1]")
	private WebElement btnedit;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement tbmobile;
	@FindBy(xpath = "//button[@name='register_individuals']")
	private WebElement btnsubmit;

	// initilize constructor
	public editUser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getter method
	public WebElement getLnkupdate() {
		return lnkupdate;
	}

	public WebElement getBtnedit() {
		return btnedit;
	}

	public WebElement getTbmobile() {
		return tbmobile;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	// business libreries
	public void edit() {
		lnkupdate.click();
		btnedit.click();

	}

	public void data(CharSequence[] data) {
		tbmobile.sendKeys(data);
	}

	public void submit() {
		btnsubmit.click();
	}

//	public void ex(String sheetname, int rowno, int colno) throws Throwable {
//		readDataFromExcel(sheetname, rowno, colno);
//	}
}
