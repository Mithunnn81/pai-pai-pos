package com.it.digitech.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.it.digitech.drivers.BaseDriver;
import com.it.digitech.drivers.PageDriver;

public class CommonMethods extends BaseDriver {

	@FindBy(xpath = "//a[@id='navbarDropdown_BAS']")
    public WebElement base;
	
    @FindBy(xpath = "//a[@id='navbarDropdown_SAL']")
    public WebElement sales;
	
	@FindBy(xpath = "//a[@id='navbarDropdown_PUR']")
    public WebElement purchase;
	
	@FindBy(xpath = "//a[@id='navbarDropdown_ACC']")
    public WebElement accounts;
	
    @FindBy(xpath = "//button[contains(text(),'New')]")
    public WebElement newForm;
	
	@FindAll({
		@FindBy(xpath = "//input[@id='operatingUnit']"),
		@FindBy(xpath = "//select[@id='operatingUnit']")	
	})
    public WebElement operatingUnit;
	
	@FindAll({
		@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]"),
		@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]")
	})
	public WebElement selectOperatingUnit;
	
	@FindAll({
		@FindBy(xpath = "//select[@id='issuingStore']"),
		@FindBy(xpath = "//select[@id='receivingStore']")	
	})
    public WebElement warehouse;
	
		@FindBy(xpath = "//button[contains(text(),'New')]")	
    public WebElement newButton;
		
		@FindBy(xpath = "//a[@id='dropdownMenu2_VOC']")	
	public WebElement voucharPayment;
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/div[1]")	
	public WebElement accountsHeadJournalVouchar;
		
	@FindAll({	
		@FindBy(xpath = "//button[@id=' BTN_SAVE_DOCUMENT ']"),
		@FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[3]/div[1]/button[1]"),		
	})
	public WebElement saveButton;
	
	@FindBy(xpath = "//button[@id=' BTN_CONFIRM ']")	
	public WebElement confirmButton;
    
	
	public static void timeout() throws InterruptedException {
		Thread.sleep(1000);
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
