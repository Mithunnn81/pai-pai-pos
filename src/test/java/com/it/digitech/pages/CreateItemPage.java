package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	
	public void CreateItem() throws IOException {
		
		clickAndCapture(test, base, "base");
        clickAndCapture(test, item, "item");
        clickAndCapture(test, itemTwo, "itemTwo");
        clickAndCapture(test, newForm, "newForm");
        clickAndCapture(test, operatingUnitItem, "operatingUnitItem");
        clickAndCapture(test, selectOperatingUnitItem, "selectOperatingUnitItem");
        clickAndCapture(test, itemType, "itemType");
        clickAndCapture(test, finidhedGoods, "finidhedGoods");
        typeAndCapture (test, itemName, "itemName", "version2" );      
        clickAndCapture(test, itemCatagory, "itemCatagory");
        clickAndCapture(test, itemCatagorySelect, "itemCatagorySelect");
        clickAndCapture(test, itemContorled, "itemContorled");
        clickAndCapture(test, purchaseTab, "purchaseTab");
        selectFromDropdown(test, purchaseUoM, "purchaseUoM", 24);
        typeAndCapture (test, purchasePrice, "purchasePrice", "100" );        
        clickAndCapture(test, inventoryTab, "inventoryTab");
        selectFromDropdown (test, inventoryUom, "inventoryUom", 24 );
        clickAndCapture(test, saleTab, "saleTab");
        selectFromDropdown(test, salesUom, "salesUom", 24);
        typeAndCapture (test, salesPrice, "salesPrice", "500" );   
        clickAndCapture(test, saveButton, "saveButton");
	}
	
	
}
