package com.HRA.GenericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplemnatationClass implements ITestListener {
	
	//WebDriver sdDriver;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test=reports.createTest(MethodName);
		Reporter.log(MethodName+"---->textscript execution started");
	
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+ "---->passed");
		Reporter.log(MethodName+"---> Script executed successfully--");
		
	}

	public void onTestFailure(ITestResult result) {
		String Failedscript = result.getMethod().getMethodName();
		String FSript = Failedscript + new JavaUtility().getsystemdateAndTimeInFormat();
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\screenshot\\" + FSript + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}
//	TakesScreenshot t= (TakesScreenshot) sdDriver;
//	File src1 = t.getScreenshotAs(OutputType.FILE);
//	File dest1=new File(".\\screenshot\\failedscript1.png");
//	try {
//		FileUtils.copyFile(src1, dest1);
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}

	}

	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName +"---->Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(MethodName+"--> testscript execution skipped");

	}

	public void onStart(ITestContext context) {
		// Ecection Starts here
		// configure the report
		//this is empty html page
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(".\\ExtentReport\\report.html");
		htmlreport.config().setDocumentTitle("HRA Execution report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("House Rental Application Execution report");
		
		//Setting All the system information 
		 reports = new ExtentReports();
		reports.attachReporter(htmlreport);
		reports.setSystemInfo("Base_Browser", "Chrome");
		reports.setSystemInfo("OS", "Window 10");
		reports.setSystemInfo("Base_url", "https://http://rmgtestingserver/domain/House_Rental_Application/");
		reports.setSystemInfo("ReporterName", "MadanKumar");
		

	}

	public void onFinish(ITestContext context) {
		//consolidate all the parameter and generate the report
		reports.flush();

	}

}
