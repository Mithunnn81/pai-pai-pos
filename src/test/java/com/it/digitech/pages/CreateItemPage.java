package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class CreateItemPage extends CommonMethods{

	ExtentTest test;
	
	public CreateItemPage (ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test; 
	}
	
	@FindBy (xpath= "//a[@id='dropdownMenu2_ITEM_MASTER_M']")
	private WebElement item;
	
	@FindBy (xpath= "//header/nav[1]/div[3]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement itemTwo;
	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[9]/div[1]/button[1]")
	private WebElement itemType;
	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[6]/div[1]/button[1]")
	private WebElement operatingUnitItem;
	
	@FindBy (xpath= "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[6]/div[1]/div[1]/div[1]")
	private WebElement selectOperatingUnitItem;
	
	@FindBy (xpath= "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[9]/div[1]/div[1]/div[1]")
	private WebElement finidhedGoods;
	
	@FindBy (xpath= "//textarea[@id='description']")
	private WebElement itemName;

	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[20]/div[1]/button[1]")
	private WebElement itemCatagory;
	
	@FindBy (xpath= "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[20]/div[1]/div[1]/div[1]")
	private WebElement itemCatagorySelect;
	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/fieldset[1]/div[7]/div[1]/input[1]")
	private WebElement itemContorled;
	
//	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/fieldset[1]/div[5]/div[1]/input[1]")
//	private WebElement serialContorled;
	
//	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/fieldset[1]/div[6]/div[1]/input[1]")
//	private WebElement lotControled;
	
	@FindBy (xpath= "//button[contains(text(),'Purchase')]")
	private WebElement purchaseTab;
	
	@FindBy (xpath= "//select[@id='purchaseUoM']")
	private WebElement purchaseUoM;
	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[7]/fieldset[1]/div[11]/div[1]/input[1]")
	private WebElement purchasePrice;
	
	@FindBy (xpath= "//button[contains(text(),'Inventory')]")
	private WebElement inventoryTab;
	
	@FindBy (xpath= "//select[@id='defaultUoM']")
	private WebElement inventoryUom;
	
	@FindBy (xpath= "//button[contains(text(),'Sales')]")
	private WebElement saleTab;
	
	@FindBy (xpath= "//select[@id='salesUoM']")
	private WebElement salesUom;
	
	@FindBy (xpath= "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[9]/fieldset[1]/div[11]/div[1]/input[1]")
	private WebElement salesPrice;
	
	@FindBy (xpath= "f//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[16]/button[1]")
	private WebElement save;
	
	private void clickAndCapture(WebElement element, String elementName) throws IOException {
		  
        try {
            if (element.isDisplayed()) {
                element.click();
                timeout();
                capturePass(test, elementName);
            }
        } catch (Exception e) {
        	captureFail(test, elementName);
            Assert.assertTrue(element.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
    }
	
	public void CreateItem() throws IOException {
		
		clickAndCapture(base, "base");
        clickAndCapture(item, "item");
        clickAndCapture(itemTwo, "itemTwo");
        clickAndCapture(newForm, "newForm");
        clickAndCapture(operatingUnitItem, "operatingUnitItem");
        clickAndCapture(selectOperatingUnitItem, "selectOperatingUnitItem");
        clickAndCapture(itemType, "itemType");
        clickAndCapture(finidhedGoods, "finidhedGoods");
        
        try {
            if (itemName.isDisplayed()) {
            	itemName.sendKeys("Autimation Ganerated Item 1");
                timeout();
                capturePass(test, "itemName");
            }
        } catch (Exception e) {
        	captureFail(test, "itemName");
            Assert.assertTrue(itemName.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(itemCatagory, "itemCatagory");
        clickAndCapture(itemCatagorySelect, "itemCatagorySelect");
        clickAndCapture(itemContorled, "itemContorled");
        clickAndCapture(purchaseTab, "purchaseTab");
        
        try {
            if (purchaseUoM.isDisplayed()) {
                new Select(purchaseUoM).selectByIndex(24);
                timeout();
                capturePass(test, "purchaseUoM");
            }
        } catch (Exception e) {
        	captureFail(test, "purchaseUoM");
            Assert.assertTrue(purchaseUoM.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        try {
            if (purchasePrice.isDisplayed()) {
            	purchasePrice.sendKeys("100");
                timeout();
                capturePass(test, "purchasePrice");
            }
        } catch (Exception e) {
        	captureFail(test, "purchasePrice");
            Assert.assertTrue(purchasePrice.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(inventoryTab, "inventoryTab");
        
        try {
            if (inventoryUom.isDisplayed()) {
                new Select(inventoryUom).selectByIndex(24);
                timeout();
                capturePass(test, "inventoryUom");
            }
        } catch (Exception e) {
        	captureFail(test, "inventoryUom");
            Assert.assertTrue(inventoryUom.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(saleTab, "saleTab");
        
        try {
            if (salesUom.isDisplayed()) {
                new Select(salesUom).selectByIndex(24);
                timeout();
                capturePass(test, "salesUom");
            }
        } catch (Exception e) {
        	captureFail(test, "salesUom");
            Assert.assertTrue(salesUom.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        try {
            if (salesPrice.isDisplayed()) {
            	salesPrice.sendKeys("200");
                timeout();
                capturePass(test, "salesPrice");
            }
        } catch (Exception e) {
        	captureFail(test, "salesPrice");
            Assert.assertTrue(salesPrice.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(save, "save");
	}
	
	
}
