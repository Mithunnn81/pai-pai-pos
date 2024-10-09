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

    public void purchaseReturn() throws IOException {
        clickAndCapture(purchase, "purchase");
        clickAndCapture(purchaseReturnButton, "purchaseReturnButton");
        clickAndCapture(newPurchaseReturn, "newPurchaseReturn");

        try {
            if (warehouse.isDisplayed()) {
                new Select(warehouse).selectByIndex(2);
                timeout();
                capturePass(test, "warehouse");
            }
        } catch (Exception e) {
        	captureFail(test, "warehouse");
            Assert.assertTrue(warehouse.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }

        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");
        clickAndCapture(clickGrn, "clickGrn");
        clickAndCapture(selectGrn, "selectGrn");
        clickAndCapture(fetchGrn, "fetchGrn");

    }
}

