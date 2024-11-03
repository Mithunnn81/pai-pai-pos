package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    // Helper method to click and capture screenshots
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

    public void salesReturn() throws IOException {
        clickAndCapture(sales, "sales");
        clickAndCapture(salesReturnButton, "salesReturnButton");
        clickAndCapture(clickInvoiceNo, "clickInvoiceNo");
        clickAndCapture(selectinvoice, "selectinvoice");
        clickAndCapture(fetchInvoice, "fetchInvoice");
        clickAndCapture(saveButton, "saveButton");

    }
}
