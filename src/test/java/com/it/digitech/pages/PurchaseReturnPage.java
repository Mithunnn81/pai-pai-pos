package com.it.digitech.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class PurchaseReturnPage extends CommonMethods {

    ExtentTest test;

    public PurchaseReturnPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[4]/ul[1]/li[2]/a[1]")
    private WebElement purchaseReturnButton;
    
    @FindBy(xpath = "//button[contains(text(),'New')]")
    private WebElement newPurchaseReturn;
		  
	@FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/button[1]")
	public WebElement clickGrn;
		  
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[6]")
	public WebElement selectGrn;
		  
	@FindBy(xpath = "//a[contains(text(),'Fetch')]")
	public WebElement fetchGrn;
	
	@FindBy(xpath = "//a[contains(text(),'PRTN-00001')]")
	public WebElement matchCreation;

    public void purchaseReturn() throws IOException {
        clickAndCapture(test, purchase, "purchase");
        clickAndCapture(test, purchaseReturnButton, "purchaseReturnButton");
        clickAndCapture(test, newPurchaseReturn, "newPurchaseReturn");
        selectFromDropdown(test, warehouse, "warehouse", 2);
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        clickAndCapture(test, clickGrn, "clickGrn");
        clickAndCapture(test, selectGrn, "selectGrn");
        clickAndCapture(test, fetchGrn, "fetchGrn");
        clickAndCapture(test, saveButton, "saveButton");      
        PageDriver.getCurrentDriver().navigate().back();
        
        try {
            if (matchCreation.isDisplayed()) {
                System.out.println("successfully created");
                timeout();
                capturePass(test, "matchCreation");
            }
        } catch (Exception e) {
        	captureFail(test, "matchCreation");
        	System.out.println("Not created, Try again");
            Assert.assertTrue(matchCreation.isDisplayed());
        }
        
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
        
    }
}

