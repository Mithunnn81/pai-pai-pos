package com.it.digitech.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    

    public void PartySale() throws IOException {
        clickAndCapture(test, sales, "sales");
        clickAndCapture(test, saleWithBar, "saleWithBar");
        clickAndCapture(test, partySaleWithBar, "partySaleWithBar");
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        selectFromDropdown(test, warehouse, "warehouse", 1);
        dropdownWithKeyboardArrow(test, customerAccount, "customerAccount", "pty");
        typeAndCapture(test, enterBarcode, "enterBarcode", "XT3");
        typeAndCapture(test, cashRcv, "cashRcv", "2000");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
    }
}
