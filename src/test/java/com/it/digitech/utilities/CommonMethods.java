package com.it.digitech.utilities;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.FindAll;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.it.digitech.drivers.BaseDriver;
import com.it.digitech.drivers.PageDriver;

public class CommonMethods extends BaseDriver {

	@FindBy(xpath = "//a[@id='navbarDropdown_BAS']")
    public WebElement base;
	
	@FindBy(xpath = "//a[@id='navbarDropdown_PUR']")
    public WebElement purchase;
	
	@FindBy(xpath = "//a[@id='navbarDropdown_WHS']")
    public WebElement inventory;
	
    @FindBy(xpath = "//a[@id='navbarDropdown_SAL']")
    public WebElement sales;
	
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
		@FindBy(xpath = "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[16]/button[1]"),
		@FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[3]/div[1]/button[1]"),
		@FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[3]/div[1]/button[1]"),		
	})					
	public WebElement saveButton;
	
	@FindBy(xpath = "//button[@id=' BTN_CONFIRM ']")	
	public WebElement confirmButton;
    
	
	public static void timeout() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void timeout(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	
	
	public static void capturePass(ExtentTest test, String elementName) {
	    try {
	        test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>" + elementName + " passed</b></p>");
	        String timestamp = String.valueOf(System.currentTimeMillis());
	        GetScreenShot.capture(PageDriver.getCurrentDriver(), elementName + "_" + timestamp);
	        String dest = System.getProperty("user.dir") + "\\screenshots\\" + elementName + "_" + timestamp + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}

	public static void captureFail(ExtentTest test, String elementName) {
	    try {
	    	String timestamp = String.valueOf(System.currentTimeMillis());
	        test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>" + elementName + " failed</b></p>");
	        test.fail(new InterruptedException("Exception"));
	        GetScreenShot.capture(PageDriver.getCurrentDriver(), elementName + "_" + timestamp);
	        
	        String dest = System.getProperty("user.dir") + "\\screenshots\\" + elementName + "_" + timestamp + ".png";
	        test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void clickAndCapture(ExtentTest test, WebElement element, String elementName) throws IOException {
		
		try {
			 if (element.isDisplayed()) {
	                element.click();
	                timeout();
	                capturePass(test, elementName);
	            }
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        	captureFail(test, elementName);
	            Assert.assertTrue(element.isDisplayed());
	        }
		}
    
    public void typeAndCapture(ExtentTest test, WebElement element, String elementName, String key) throws IOException {
    	
		try {
			 if (element.isDisplayed()) {
				 
	                element.sendKeys(key);
	                timeout();
	                capturePass(test, elementName);
	            }
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        	captureFail(test, elementName);
	            Assert.assertTrue(element.isDisplayed());
	        }
    }
    	
	public void selectFromDropdown(ExtentTest test, WebElement element, String elementName, Integer number) throws IOException {
		
        try {
            if (element.isDisplayed()) {
                new Select(element).selectByIndex(number);
                timeout();
                capturePass(test, elementName);
            }
        } catch (Exception e) {
        	captureFail(test, elementName);
            Assert.assertTrue(element.isDisplayed());
        }
    }
	
	public void dropdownWithKeyboardArrow(ExtentTest test, WebElement element, String elementName, String key) throws IOException {
		
		try {
            if (element.isDisplayed()) {
            	element.sendKeys(key);
            	element.click();
                timeout();

                Actions action = new Actions(PageDriver.getCurrentDriver());
                action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
                
                timeout();

                capturePass(test, elementName);
            }
        } catch (Exception e) {
            captureFail(test, elementName);
            Assert.assertTrue(element.isDisplayed());
        }
	}
	
}
