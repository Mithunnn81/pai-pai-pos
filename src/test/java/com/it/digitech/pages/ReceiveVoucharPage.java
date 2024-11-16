package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class ReceiveVoucharPage extends CommonMethods{
ExtentTest test;
	
	public ReceiveVoucharPage(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test=test;
	}
	
	@FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[7]/ul[1]/li[2]/ul[1]/li[3]/a[1]")
    private WebElement receiveVouchar;
	
	@FindBy(xpath = "//select[@id='voucherType']")
    private WebElement voucharType;
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/button[1]")
    private WebElement accountHead;
    
    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/button[1]")
    private WebElement chooseCustomer;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/div[1]")
    private WebElement selectCustomer;
    
    @FindBy(xpath = "//input[@id='creditAmount']")
    private WebElement creditAmount;
    
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
//	            PageDriver.getCurrentDriver().quit();
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
//	            PageDriver.getCurrentDriver().quit();
	        }
    	
    }
    
 public void ReceiveVouchar() throws IOException {
    	
    	clickAndCapture(test, accounts, "accounts");    
    	clickAndCapture(test, voucharPayment, "voucharPayment");
        clickAndCapture(test, receiveVouchar, "receiveVouchar");
        clickAndCapture(test, newButton, "newButton");
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        selectFromDropdown(test, voucharType, "voucharType", 1);      
        clickAndCapture(test, accountHead, "accountHead");
        clickAndCapture(test, accountsHeadJournalVouchar, "accountsHeadJournalVouchar");       
        clickAndCapture(test, chooseCustomer, "chooseCustomer");
        clickAndCapture(test, selectCustomer, "selectCustomer");        
        typeAndCapture(test, creditAmount, "creditAmount","100");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
    }
}
