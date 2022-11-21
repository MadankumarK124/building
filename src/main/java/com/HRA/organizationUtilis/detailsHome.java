package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class detailsHome {
	// declaration
	@FindBy(xpath = "//a[text()='Details/Update']")
	private WebElement lnkdetails;
	@FindBy(xpath = "(//a[text()='Complaint'])[2]")
	private WebElement btncomplaint;
	@FindBy(name = "name")
	private WebElement tbname;
	@FindBy(name = "cmp")
	private WebElement tbcomplaint;
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement btnsubmit;

	// constructor
	public detailsHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getter method
	public WebElement getLnkdetails() {
		return lnkdetails;
	}

	public WebElement getBtncomplaint() {
		return btncomplaint;
	}

	public WebElement getTbname() {
		return tbname;
	}

	public WebElement getTbcomplaint() {
		return tbcomplaint;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public void detailsHome(String fullname, String complaint) {
		lnkdetails.click();
		btncomplaint.click();
		tbname.sendKeys(fullname);
		tbcomplaint.sendKeys(complaint);
	}

	public void submit()
	{
		btnsubmit.click();
	}

}
