package com.it.digitech.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class HireSalePage extends CommonMethods{
	ExtentTest test;

    public HireSalePage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;	        
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_SALES']")
    private WebElement saleWithBar;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    private WebElement hireSaleWithBar;
    
    @FindBy(xpath = "//input[@id='customer']")
    private WebElement customerName;
    
    @FindBy(xpath = "//input[@id='referrer1Name']")
    private WebElement reffererName;
    
    @FindBy(xpath = "//input[@id='referrer1MobilePhone']")
    private WebElement reffererNumber;
    
    @FindBy(xpath = "//input[@id='headerItemForSearch']")
    private WebElement barCode;
    
//    @FindBy(xpath = "//input[@id='quantity']")
//    private WebElement itemQty;
    
    @FindBy(xpath = "//button[@id='btn_distributeInstallmentSchemeAmount']")
    private WebElement refreshInstallment;
    
    @FindBy(xpath = "//input[@id='cashReceived']")
    private WebElement paidAmount;
    
    public void HireSale() throws IOException {
        clickAndCapture(test, sales, "sales");
        clickAndCapture(test, saleWithBar, "saleWithBar");
        clickAndCapture(test, hireSaleWithBar, "hireSaleWithBar");
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        selectFromDropdown(test, warehouse, "warehouse", 1);
        dropdownWithKeyboardArrow(test, customerName, "customerName", "hre");
        typeAndCapture(test, reffererName, "reffererName", "Automation generated name");
        
        typeAndCapture(test, reffererNumber, "reffererNumber", "88776test");
        typeAndCapture(test, barCode, "barCode", "XT3");
        
        clickAndCapture(test, refreshInstallment, "refreshInstallment");
        typeAndCapture(test, paidAmount, "paidAmount", "300");      
        clickAndCapture(test, refreshInstallment, "refreshInstallment");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
        
    }
}
