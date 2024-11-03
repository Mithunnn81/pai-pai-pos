package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class HireSaleWithoutBarPage extends CommonMethods{
	
	ExtentTest test;

    public HireSaleWithoutBarPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;	        
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_SALL']")
    private WebElement saleWithoutBar;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[3]/ul[1]/li[3]/a[1]")
    private WebElement hireSaleWob;
    
    @FindBy(xpath = "//input[@id='customer']")
    private WebElement customerName;
    
    @FindBy(xpath = "//input[@id='referrer1Name']")
    private WebElement reffererName;
    
    @FindBy(xpath = "//input[@id='referrer1MobilePhone']")
    private WebElement reffererNumber;
    
    @FindBy(xpath = "//input[@id='headerLookupItem']")
    private WebElement itemName;
    
    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement itemQty;
    
    @FindBy(xpath = "//button[@id='btn_distributeInstallmentSchemeAmount']")
    private WebElement refreshInstallment;
    
    @FindBy(xpath = "//input[@id='cashReceived']")
    private WebElement paidAmount;
    
    public void clickAndCapture(WebElement element, String elementName) throws IOException {
		
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
	            PageDriver.getCurrentDriver().quit();
	        }
		}
    
    public void typeAndCapture(WebElement element, String elementName, String key) throws IOException {
    	
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
	            PageDriver.getCurrentDriver().quit();
	        }
    	
    }
    
    public void HireSaleWithoutBar() throws IOException {
        clickAndCapture(sales, "sales");
        clickAndCapture(saleWithoutBar, "saleWithoutBar");
        clickAndCapture(hireSaleWob, "hireSaleWob");
        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");
        
       
        
        try {
            if (warehouse.isDisplayed()) {
                new Select(warehouse).selectByIndex(1);
                timeout();
                capturePass(test, "warehouse");
            }
        } catch (Exception e) {
        	captureFail(test, "warehouse");
            Assert.assertTrue(warehouse.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        try {
            if (customerName.isDisplayed()) {
                customerName.sendKeys("hre");
                customerName.click();
                timeout();

                Actions action = new Actions(PageDriver.getCurrentDriver());
                action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
                
                timeout();

                capturePass(test, "customerName");
            }
        } catch (Exception e) {
            captureFail(test, "customerName");
            Assert.assertTrue(customerName.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        try {
            if (reffererName.isDisplayed()) {          	
            	reffererName.sendKeys("Automation generated name");
                timeout();
                capturePass(test, "reffererName");
            }
        } catch (Exception e) {
        	captureFail(test, "reffererName");
            Assert.assertTrue(reffererName.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
//        try {
//            if (reffererNumber.isDisplayed()) {          	
//            	reffererNumber.sendKeys("88776test");
//                timeout();
//                capturePass(test, "reffererNumber");
//            }
//        } catch (Exception e) {
//        	captureFail(test, "reffererNumber");
//            Assert.assertTrue(reffererNumber.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
        
        typeAndCapture(reffererNumber, "reffererNumber", "88776test");
        
        try {
            if (itemName.isDisplayed()) {
            	itemName.sendKeys("item");
                timeout();

                Actions action = new Actions(PageDriver.getCurrentDriver());
                action.moveToElement(itemName).perform();
                action.sendKeys(Keys.ARROW_DOWN).perform();
                action.sendKeys(Keys.ENTER).perform();
                timeout();

                capturePass(test, "itemName");
            }
        } catch (Exception e) {
            captureFail(test, "itemName");
            Assert.assertTrue(itemName.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }

        try {
            if (itemQty.isDisplayed()) {
            	itemQty.clear();
            	
            	itemQty.sendKeys("3");
                timeout();
                capturePass(test, "itemQty");
            }
        } catch (Exception e) {
        	captureFail(test, "itemQty");
            Assert.assertTrue(itemQty.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(refreshInstallment, "refreshInstallment");
        
        try {
            if (paidAmount.isDisplayed()) {
            	paidAmount.sendKeys("300");
                timeout();
                capturePass(test, "paidAmount");
            }
        } catch (Exception e) {
        	captureFail(test, "paidAmount");
            Assert.assertTrue(paidAmount.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(refreshInstallment, "refreshInstallment");
        clickAndCapture(saveButton, "saveButton");
        
    }
}
