package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRA.GenericUtilities.WebDriverUtility;
import com.HRA.GenericUtilities.fileUtility;
import com.HRA.GenericUtilities.iPathConstants;

public class apartment extends WebDriverUtility {
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement lnkreg;
	@FindBy(xpath = "//a[text()='Apartment Registration']")
	private WebElement lnkapartment;
	@FindBy(xpath = "(//input[@name='image'])[2]")
	private WebElement lnkimg;
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	private WebElement btnsubmit;

	public apartment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// getter method

	public WebElement getLnkreg() {
		return lnkreg;
	}

	public WebElement getLnkapartment() {
		return lnkapartment;
	}

	public WebElement getLnkimg() {
		return lnkimg;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public void setBtnsubmit(WebElement btnsubmit) {
		this.btnsubmit = btnsubmit;
	}

//business libraries
	public void apart() {
		lnkreg.click();
		lnkapartment.click();

	}

	public void scrollToImg(WebDriver driver) {

		scrollAction(driver, lnkimg);
		file(driver);

	}

	public void submit() {
		btnsubmit.click();
	}

}
