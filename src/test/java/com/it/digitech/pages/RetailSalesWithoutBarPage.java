package com.it.digitech.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	    

	    public void RetailSalesWithoutBar() throws IOException {
	        clickAndCapture(test, sales, "sales");
	        clickAndCapture(test, saleWithoutBar, "saleWithoutBar");
	        clickAndCapture(test, retailSaleWob, "retailSaleWob");
	        selectFromDropdown(test, operatingUnit, "operatingUnit", 1);
	        selectFromDropdown(test, warehouse, "warehouse", 1);
	        dropdownWithKeyboardArrow(test, customerName, "customerName","rtl");
	        dropdownWithKeyboardArrow(test, itemNameEnter, "itemNameEnter","item");
	        typeAndCapture(test, itemQty, "itemQty", "2");      
	        clickAndCapture(test, saveButton, "saveButton");
	        clickAndCapture(test, confirmButton, "confirmButton");
	    }
}
