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

public class RetailSalesWithoutBarPage extends CommonMethods{
	
	 ExtentTest test;

	    public RetailSalesWithoutBarPage(ExtentTest test) {
	        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	        this.test = test;	        
	    }
	    
	    @FindBy(xpath = "//a[@id='dropdownMenu2_SALL']")
	    private WebElement saleWithoutBar;
	    
	    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	    private WebElement retailSaleWob;
	    
	    @FindBy(xpath = "//input[@id='customerName']")
	    private WebElement customerName;
	    
	    @FindBy(xpath = "//input[@id='srcItem']")
	    private WebElement itemNameEnter;
	    
	    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/input[1]")
	    private WebElement itemQty;
	    
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
	    public void RetailSalesWithoutBar() throws IOException {
	        clickAndCapture(sales, "sales");
	        clickAndCapture(saleWithoutBar, "saleWithoutBar");
	        clickAndCapture(retailSaleWob, "retailSaleWob");
	        clickAndCapture(operatingUnit, "operatingUnit");

	        try {
	            if (operatingUnit.isDisplayed()) {
	                new Select(operatingUnit).selectByIndex(1);
	                timeout();
	                capturePass(test, "operatingUnit");
	            }
	        } catch (Exception e) {
	        	captureFail(test, "operatingUnit");
	            Assert.assertTrue(operatingUnit.isDisplayed());
	            PageDriver.getCurrentDriver().quit();
	        }
	        
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
	                customerName.sendKeys("Rtl");
	                customerName.click();
	                timeout();

	                Actions action = new Actions(PageDriver.getCurrentDriver());
	                action.sendKeys(Keys.ENTER).perform();
	                
	                timeout();

	                capturePass(test, "customerName");
	            }
	        } catch (Exception e) {
	            captureFail(test, "customerName");
	            Assert.assertTrue(customerName.isDisplayed());
	            PageDriver.getCurrentDriver().quit();
	        }

	        
	        try {
	            if (itemNameEnter.isDisplayed()) {
	                itemNameEnter.sendKeys("item");
	                timeout();

	                Actions action = new Actions(PageDriver.getCurrentDriver());
	                action.moveToElement(itemNameEnter).perform();
	                action.sendKeys(Keys.ARROW_DOWN).perform();
	                action.sendKeys(Keys.ENTER).perform();
	                timeout();

	                capturePass(test, "itemNameEnter");
	            }
	        } catch (Exception e) {
	            captureFail(test, "itemNameEnter");
	            Assert.assertTrue(itemNameEnter.isDisplayed());
	            PageDriver.getCurrentDriver().quit();
	        }

	        try {
	            if (itemQty.isDisplayed()) {
	            	itemQty.clear();
	            	
	            	itemQty.sendKeys("2");
	                timeout();
	                capturePass(test, "itemQty");
	            }
	        } catch (Exception e) {
	        	captureFail(test, "itemQty");
	            Assert.assertTrue(itemQty.isDisplayed());
	            PageDriver.getCurrentDriver().quit();
	        }
	        
	        clickAndCapture(saveButton, "saveButton");
	    }
}
