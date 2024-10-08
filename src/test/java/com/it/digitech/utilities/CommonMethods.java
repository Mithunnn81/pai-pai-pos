package com.it.digitech.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.it.digitech.drivers.BaseDriver;
import com.it.digitech.drivers.PageDriver;

public class CommonMethods extends BaseDriver {

	
	@FindBy(xpath = "//a[@id='navbarDropdown_PUR']")
    public WebElement purchase;
	
	@FindBy(xpath = "//input[@id='operatingUnit']") 
    public WebElement operatingUnit;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]")
    public WebElement selectOperatingUnit;
	
	public static void timeout() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	public static void capturePass(ExtentTest test, String elementName) {
		try {
			test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>" + elementName + " passed</b></p>");
	        GetScreenShot.capture(PageDriver.getCurrentDriver(), elementName);
	        String dest = System.getProperty("user.dir") + "\\screenshots\\" + elementName + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void captureFail(ExtentTest test, String elementName) {
		try {
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>" + elementName + " failed</b></p>");
	        test.fail(new InterruptedException("Exception"));
	        GetScreenShot.capture(PageDriver.getCurrentDriver(), elementName);
	        String dest = System.getProperty("user.dir") + "\\screenshots\\" + elementName + ".png";
	        test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
