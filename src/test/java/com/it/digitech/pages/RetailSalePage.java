package com.it.digitech.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class RetailSalePage extends CommonMethods{
	ExtentTest test;

    public RetailSalePage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;	        
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_SALES']")
    private WebElement saleWithBar;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement retailSaleWb;
    
    @FindBy(xpath = "//input[@id='customer']")
    private WebElement customerName;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[5]/div[1]")
    private WebElement clickSerial;
    
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[6]/fieldset[1]/div[12]/div[1]/input[1]")
    private WebElement serialNumber;
    
    @FindBy(xpath = "//input[@id='headerItemForSearch']")
    private WebElement pasteSerial;
    
    @FindBy(xpath = "//input[@id='srcItem']")
    private WebElement itemNameEnter;
    
    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement itemQty;
    
    public void RetailSales() throws IOException {
        clickAndCapture(test, sales, "sales");
        clickAndCapture(test, saleWithBar, "saleWithBar");
        clickAndCapture(test, retailSaleWb, "retailSaleWb");
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        selectFromDropdown(test, warehouse, "warehouse", 1);
        dropdownWithKeyboardArrow(test, customerName, "customerName", "Rtl");   
        typeAndCapture(test, pasteSerial, "pasteSerial", "XT3");     
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
    }
}
