package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class SalesReturnPage extends CommonMethods{

	ExtentTest test;

    public SalesReturnPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[6]/ul[1]/li[6]/a[1]")
    private WebElement salesReturnButton;
    
		  
	@FindBy(xpath = "//input[@id='salesInvoice']")
	public WebElement clickInvoiceNo;
		  
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
	public WebElement selectinvoice;
		  
	@FindBy(xpath = "//a[contains(text(),'Fetch')]")
	public WebElement fetchInvoice;

    public void salesReturn() throws IOException {
        clickAndCapture(test, sales, "sales");
        clickAndCapture(test, salesReturnButton, "salesReturnButton");
        clickAndCapture(test, clickInvoiceNo, "clickInvoiceNo");
        clickAndCapture(test, selectinvoice, "selectinvoice");
        clickAndCapture(test, fetchInvoice, "fetchInvoice");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");

    }
}
