                           package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class PartySaleWithoutBarPage extends CommonMethods{
	ExtentTest test;

    public PartySaleWithoutBarPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;	        
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_SALL']")
    private WebElement saleWithoutBar;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[3]/ul[1]/li[2]/a[1]")
    private WebElement partySaleWob;
    
    @FindBy(xpath = "//input[@id='custAcc']")
    private WebElement customerAccount;
    
    @FindBy(xpath = "//input[@id='srcItem']")
    private WebElement itemNameEnter;
    
    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/input[1]")
    private WebElement itemQty;
    
    @FindBy(xpath = "//input[@id='orderCashQuantity']")
    private WebElement cashRcv;

    public void PartySaleWithoutBar() throws IOException {
        clickAndCapture(test, sales, "sales");
        clickAndCapture(test, saleWithoutBar, "saleWithoutBar");
        clickAndCapture(test, partySaleWob, "partySaleWob");
        selectFromDropdown(test, operatingUnit, "operatingUnit", 1);
        selectFromDropdown(test, warehouse, "warehouse", 1);
        dropdownWithKeyboardArrow(test, customerAccount, "customerAccount", "pty");
        dropdownWithKeyboardArrow(test, itemNameEnter, "itemNameEnter", "item");
        typeAndCapture(test, itemQty, "itemQty", "2");
        typeAndCapture(test, cashRcv, "cashRcv", "2000");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
    }
}

