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

public class PartySalePage extends CommonMethods{

	ExtentTest test;

    public PartySalePage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;	        
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_SALES']")
    private WebElement saleWithBar;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    private WebElement partySaleWithBar;
    
    @FindBy(xpath = "//input[@id='customerAccount']")
    private WebElement customerAccount;
    
    @FindBy(xpath = "//input[@id='headerItemForSearch']")
    private WebElement enterBarcode;
    
    @FindBy(xpath = "//input[@id='headerLookupItem']")
    private WebElement itemSelect;
    
    @FindBy(xpath = "//input[@id='cashReceived']")
    private WebElement cashRcv;
    
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
    public void PartySale() throws IOException {
        clickAndCapture(sales, "sales");
        clickAndCapture(saleWithBar, "saleWithBar");
        clickAndCapture(partySaleWithBar, "partySaleWithBar");
        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");

//        try {
//            if (operatingUnit.isDisplayed()) {
//                new Select(operatingUnit).selectByIndex(1);
//                timeout();
//                capturePass(test, "operatingUnit");
//            }
//        } catch (Exception e) {
//        	captureFail(test, "operatingUnit");
//            Assert.assertTrue(operatingUnit.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
        
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
            if (customerAccount.isDisplayed()) {
            	customerAccount.sendKeys("pty");
            	customerAccount.click();
                timeout();

                Actions action = new Actions(PageDriver.getCurrentDriver());
                action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();           
                timeout();

                capturePass(test, "customerAccount");
            }
        } catch (Exception e) {
            captureFail(test, "customerAccount");
            Assert.assertTrue(customerAccount.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
//	      try {
//	      if (itemSelect.isDisplayed()) {
//	      	itemSelect.click();
//	      	itemSelect.click();
//
//	        // Create a Select object
//	    	  System.out.println("Before");
//	    	  
//	        Select dropdown = new Select(itemSelect);
//	        System.out.println("After");
//	        List<WebElement> options = dropdown.getOptions();
//
//	        // Extract text from each option and store it in a list
//	        List<String> optionTexts = new ArrayList<>();
//	        for (WebElement option : options) {
//	            optionTexts.add(option.getText());
//	            System.out.println("Item : "+option.getText());
//	        }
//	      	
//
//	          timeout();
//	          capturePass(test, "itemSelect");
//	      }
//	      
//	  } catch (Exception e) {
//		  System.out.println("error : "+e.getMessage());
//	  	captureFail(test, "itemSelect");
//	      Assert.assertTrue(itemSelect.isDisplayed());
//	      PageDriver.getCurrentDriver().quit();
//	  }

        
        try {
            if (enterBarcode.isDisplayed()) {
            	enterBarcode.sendKeys("XT3");
                timeout();

                capturePass(test, "enterBarcode");
            }
        } catch (Exception e) {
            captureFail(test, "enterBarcode");
            Assert.assertTrue(enterBarcode.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }

        
        try {
            if (cashRcv.isDisplayed()) {
            	cashRcv.clear();
            	
            	cashRcv.sendKeys("2000");
                timeout();
                capturePass(test, "cashRcv");
            }
        } catch (Exception e) {
        	captureFail(test, "cashRcv");
            Assert.assertTrue(cashRcv.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(saveButton, "saveButton");
    }
}
