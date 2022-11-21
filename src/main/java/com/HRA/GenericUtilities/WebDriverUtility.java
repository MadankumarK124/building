package com.HRA.GenericUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



/**
 * this method is used to write webdriver specific method
 * 
 * @author MADAN KUMAR K
 *
 */
public class WebDriverUtility {
	
	/**
	 * maximize
	 * @param driver
	 */
	public void maxi(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is used wait for the page is load
	 * 
	 * @param driver
	 */
	public void implicitlywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * explicit wait
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitforElementToBeVisibility(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method is used to handle drop downs by using index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	/**
	 * this method is used to handle drop down by using value
	 * 
	 * @param value
	 * @param element
	 */
	public void select(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this method is used to handle drop down by using text
	 * 
	 * @param element
	 * @param text
	 */
	public void select(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	/**
	 * this method is used to move mouse to specific element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseoverElement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	/**
	 * this method is used to drag and drop the specific element
	 * 
	 * @param driver
	 * @param element
	 */
	public void dragAndDrop(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element).perform();

	}

	/**
	 * this method is used to double click on the element
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}

	/**
	 * this method is used to right click on element
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightclick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	/**
	 * method to press and release
	 * 
	 * @param driver
	 * @param element
	 * @param key1
	 * @throws Throwable
	 */
	public void keypressAndKeyrelease(WebDriver driver) throws Throwable {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.KEY_RELEASED);
		

	}

	/**
	 * used to swtich to any window basesd on window title between window
	 * 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void SwitchtoWindow(WebDriver driver, String partialWindowTitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String wID = it.next();
			driver.switchTo().window(wID);
			String CurrentWindowTitle = driver.getTitle();
			if (CurrentWindowTitle.contains(partialWindowTitle)) {
				break;
			}
		}
	}

	/**
	 * used to switch to alter window & cick on ok button alert popup ok
	 * 
	 * @param driver
	 */
	public void switchToAlertWindowAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * used to switch to alter window & click on cancel button alert popup cancel
	 * 
	 * @param driver
	 */
	public void switchToAlertWindowAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * used to switch to frame window based on index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);

	}

	/**
	 * used to switch to frame window based on id or name attribute
	 * 
	 * @param driver
	 * @param id_name_attribute
	 */
	public void switchToFrame(WebDriver driver, String id_name_attribute) {
		driver.switchTo().frame(id_name_attribute);
	}

	/**
	 * used to switch to frame window based on address
	 * 
	 * @param driver
	 * @param address
	 */
	public void switchToFrame(WebDriver driver, WebElement address) {
		driver.switchTo().frame(address);

	}

	/**
	 * to get a screenshot
	 * 
	 * @author MADAN KUMAR K
	 * @param driver
	 * @param screenshotname
	 * @throws Throwable
	 */
	public void takeScreenShot(WebDriver driver, String screenshotname) throws Throwable {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		String path = "./screenshot/" + screenshotname + ".PNG";
		File dest = new File(path);
		FileUtils.copyFile(src, dest);

	}

	/**
	 * 
	 * @param driver
	 */
	public void passEnterKey(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}

	/**
	 * double click on webpage
	 * 
	 * @param driver
	 */
	public void doubleClickActionWeb(WebDriver driver) {
		Actions ac = new Actions(driver);
		ac.doubleClick().perform();
	}
	/**
	 * This method will perform random scroll
	 * @param driver
	 */
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
	}
	/**
	 * This method will scroll untill specified element is found
	 * @param driver
	 * @param element
	 */
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")",element);
		//js.executeScript("argument[0].scrollIntoView()", element);
	}
	//upload image
	public void file( WebDriver driver)
	{
	File fil = new File(iPathConstants.filepath);
	String path = fil.getAbsolutePath();
	driver.findElement(By.id("image")).sendKeys(path);
	}
		
}
