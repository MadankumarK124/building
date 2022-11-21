package com.HRA.organizationUtilis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admin_dashboard {
	//declaration
	@FindBy(xpath = "(//div[@class='alert alert-warning'])[1]")
	private WebElement lnkreguser;
	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	private WebElement lnkhome;
	@FindBy(xpath = "(//div[@class='alert alert-warning'])[2]")
	private WebElement lnkrooms;
	
	//initilization 
	public admin_dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getter method
	public WebElement getLnkreguser() {
		return lnkreguser;
	}

	public WebElement getLnkhome() {
		return lnkhome;
	}

	public WebElement getLnkrooms() {
		return lnkrooms;
	}
	
	//business libreries
	public void user()
	{
		lnkreguser.click();
	}
	public void home()
	{
		lnkhome.click();
	}
	public void room()
	{
		lnkrooms.click();
	}
	
	

}
