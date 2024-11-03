package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
    
    public void clickAndCapture(WebElement element, String elementName) throws IOException {
		
		try {
			 if (element.isDisplayed()) {
	                element.click();
	                timeout();
	                capturePass(test, elementName);
	            }
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        	captureFail(test, elementName);
	            Assert.assertTrue(element.isDisplayed());
	            PageDriver.getCurrentDriver().quit();
	        }
		}
    public void RetailSales() throws IOException {
        clickAndCapture(sales, "sales");
        clickAndCapture(saleWithBar, "saleWithBar");
        clickAndCapture(retailSaleWb, "retailSaleWb");
        clickAndCapture(operatingUnit, "operatingUnit");
        clickAndCapture(selectOperatingUnit, "selectOperatingUnit");
        
        
        try {
            if (warehouse.isDisplayed()) {
                new Select(warehouse).selectByIndex(1);
                timeout();
                capturePass(test, "warehouse");
            }
        } catch (Exception e) {
        	captureFail(test, "warehouse");
            Assert.assertTrue(warehouse.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }
        
        try {
            if (customerName.isDisplayed()) {
                customerName.sendKeys("Rtl");
                customerName.click();
                timeout();

                Actions action = new Actions(PageDriver.getCurrentDriver());
                action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();               
                timeout();
                
                capturePass(test, "customerName");
            }
        } catch (Exception e) {
            captureFail(test, "customerName");
            Assert.assertTrue(customerName.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        }

        
//        try {
//            if (itemNameEnter.isDisplayed()) {
//                itemNameEnter.sendKeys("item");
//                timeout();
//
//                Actions action = new Actions(PageDriver.getCurrentDriver());
//                action.moveToElement(itemNameEnter).perform();
//                action.sendKeys(Keys.ARROW_DOWN).perform();
//                action.sendKeys(Keys.ENTER).perform();
//                timeout();
//
//                capturePass(test, "itemNameEnter");
//            }
//        } catch (Exception e) {
//            captureFail(test, "itemNameEnter");
//            Assert.assertTrue(itemNameEnter.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
        
 
//        String parentTab = PageDriver.getCurrentDriver().getWindowHandle();
//        try {
//        	
//
//        	PageDriver.getCurrentDriver().switchTo().newWindow(WindowType.TAB);
//    		timeout();
//    		PageDriver.getCurrentDriver().get("http://192.168.118.168:8080/wpos-test/systemMain/main?rEntityName=StockItemSerial");
//    		timeout();
//    		
//    		Set<String> allTabs = PageDriver.getCurrentDriver().getWindowHandles();
//    		System.out.println("Number of Tab: "+allTabs.size());
//    		
//    		System.out.println("Before serial clicked");
//    		
//    		clickAndCapture(clickSerial, "clickSerial");
//    		System.out.println("serial clicked");
//    		timeout();
//    		String textToCopy = serialNumber.getText();
//    		capturePass(test, "serialNumber");
//    		
//    		StringSelection stringSelection = new StringSelection(textToCopy);
//            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//            clipboard.setContents(stringSelection, null);
//            System.out.println("Text copied to clipboard: " + textToCopy);    
//              		
//        } 
//       
//        catch (Exception e) {
//        	System.out.println("not successfull "+e.getMessage());
//        }
//        
//        System.out.println("Switching to parent table");
//		PageDriver.getCurrentDriver().switchTo().window(parentTab);
//		System.out.println("Alrealdy switched to parent table");
//		timeout();
        
        
        try {
            if (pasteSerial.isDisplayed()) {
            	pasteSerial.sendKeys("XT3");
                timeout();

//                Actions actions = new Actions(PageDriver.getCurrentDriver());
//                actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();               
//                timeout();
                
                capturePass(test, "pasteSerial");
            }
        } catch (Exception e) {
            captureFail(test, "pasteSerial");
            Assert.assertTrue(pasteSerial.isDisplayed());
            PageDriver.getCurrentDriver().quit();
        } 
        

//        try {
//            if (itemQty.isDisplayed()) {
//            	itemQty.clear();
//            	
//            	itemQty.sendKeys("2");
//                timeout();
//                capturePass(test, "itemQty");
//            }
//        } catch (Exception e) {
//        	captureFail(test, "itemQty");
//            Assert.assertTrue(itemQty.isDisplayed());
//            PageDriver.getCurrentDriver().quit();
//        }
        
        clickAndCapture(saveButton, "saveButton");
    }
}
