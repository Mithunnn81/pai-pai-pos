package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class StockAdjustmentPage extends CommonMethods{

ExtentTest test;
	
	public StockAdjustmentPage(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test=test;
	}
	
	@FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[5]/ul[1]/li[3]/a[1]")
    private WebElement stockAdjustment;
	
	@FindBy(xpath = "//select[@id='operatingUnit']")
    private WebElement adjustmentOperatingUnit;
    
    @FindBy(xpath = "//select[@id='inventory']")
    private WebElement adjustmentInvetory;
    
    @FindBy(xpath = "//button[contains(text(),'Search Items')]")
    private WebElement searchItems;
    
    @FindBy(xpath = "//td[contains(text(),'FG-106699-0000020')]")
    private WebElement itemCode;
    
    @FindBy(xpath = "//a[@id='enableAdjustStock']")
    private WebElement enableAdjustment;
    
    @FindBy(xpath = "//button[@id='increaseButton']")
    private WebElement increaseButton;
    
    @FindBy(xpath = "//button[@id='decreaseButton']")
    private WebElement decreaseButton;
    
    @FindBy(xpath = "//button[@id='adjustStockButton']")
    private WebElement adjustButton;
    
    @FindBy(xpath = "//input[@id='modalQuantity']")
    private WebElement ele1;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")
    private WebElement ele2;
    
    
 public void StockAdjustment() throws IOException {
    	
    	clickAndCapture(test, inventory, "inventory");    
    	clickAndCapture(test, stockAdjustment, "stockAdjustment");
    	clickAndCapture(test, adjustmentOperatingUnit, "adjustmentOperatingUnit");
    	selectFromDropdown(test, adjustmentOperatingUnit, "adjustmentOperatingUnit", 1);
    	selectFromDropdown(test, adjustmentInvetory, "adjustmentInvetory", 1);
        clickAndCapture(test, searchItems, "searchItems");
        clickAndCapture(test, itemCode, "itemCode");      
        clickAndCapture(test, enableAdjustment, "enableAdjustment");
        clickAndCapture(test, increaseButton, "increaseButton");

        try {
        	String ele1Value = ele1.getAttribute("value");  
            System.out.println(ele1Value);
            
            clickAndCapture(test, adjustButton, "adjustButton");
            
            String ele2Text = ele2.getText();
        	System.out.println(ele2Text);
        	
        		if(ele1Value.equalsIgnoreCase(ele2Text))
        		{
        			capturePass(test, "matched");
        		}else {
        			captureFail(test, "Not matched");
        		}

        }
         catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
        }
        
        PageDriver.getCurrentDriver().quit();
    
        }
}
