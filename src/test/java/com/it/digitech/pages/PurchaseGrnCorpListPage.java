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

public class PurchaseGrnCorpListPage extends CommonMethods {

    ExtentTest test;

    public PurchaseGrnCorpListPage(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }
    
    @FindBy(xpath = "//a[@id='dropdownMenu2_GRN']")
    private WebElement createGrn;
    
    @FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    private WebElement grnCorpList;
    
    @FindBy(xpath = "//button[contains(text(),'New')]")
    private WebElement newGrn;
    
    @FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/button[1]")
    private WebElement selectSupplier;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    private WebElement clickSupplier;
    
    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/button[1]")
    private WebElement chooseItem;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/div[1]")
    private WebElement selectItem;
    
    @FindBy(xpath = "//input[@id='receivedQuantity']")
    private WebElement quantity;
    
    @FindBy(xpath = "//body/div[@id='_windowWrapper']/main[@id='main']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[8]/div[3]/div[1]/button[1]")
    public WebElement saveDown;
    

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

    public void purchaseGrnCorpList() throws IOException {
        clickAndCapture(purchase, "purchase");
        clickAndCapture(createGrn, "createGrn");
        clickAndCapture(grnCorpList, "grnCorpList");
        clickAndCapture(newGrn, "newGrn");
        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");
        clickAndCapture(selectSupplier, "selectSupplier");
        clickAndCapture(clickSupplier, "clickSupplier");
        
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
        
        clickAndCapture(chooseItem, "chooseItem");
        clickAndCapture(selectItem, "selectItem");
        
        try {
            if (quantity.isDisplayed()) {
            	quantity.sendKeys("5");
                timeout();
                capturePass(test, "quantity");
            }
        } catch (Exception e) {
        	captureFail(test, "quantity");
            Assert.assertTrue(quantity.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        clickAndCapture(saveDown, "saveDown");

    }
}
