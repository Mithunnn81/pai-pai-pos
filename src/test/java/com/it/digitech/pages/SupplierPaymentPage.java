package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class SupplierPaymentPage extends CommonMethods{
	
	ExtentTest test;

    public SupplierPaymentPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[7]/ul[1]/li[5]/a[1]")
    private WebElement supplierPayment;
    
    @FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement supplier;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    private WebElement selectSupplier;
    
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/button[1]")
    private WebElement paymentMethod;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/div[1]")
    private WebElement cash;
    
    @FindBy(xpath = "//input[@id='paymentAmount']")
    private WebElement amount;
    
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
    
    public void SupplierPayment() throws IOException {
    	
    	clickAndCapture(accounts, "accounts");
        clickAndCapture(supplierPayment, "supplierPayment");
        clickAndCapture(newForm, "newForm");
        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");
        clickAndCapture(supplier, "supplier");
        clickAndCapture(selectSupplier, "selectSupplier");
        clickAndCapture(paymentMethod, "paymentMethod");
        clickAndCapture(cash, "cash");
        
        typeAndCapture(amount, "amount","1000");
        
        clickAndCapture(saveButton, "saveButton");
    }

}
