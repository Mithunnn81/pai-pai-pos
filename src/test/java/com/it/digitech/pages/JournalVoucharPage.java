package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;

public class JournalVoucharPage extends CommonMethods{

	ExtentTest test;
	
	public JournalVoucharPage(ExtentTest test) {
		
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test=test;
	}
	
	@FindBy(xpath = "//header/nav[1]/div[3]/ul[1]/li[7]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    private WebElement journalVouchar;
    
    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/button[1]")
    private WebElement accountHead;
        
    @FindBy(xpath = "//textarea[@id='particulars']")
    private WebElement particulars;
    
    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/button[1]")
    private WebElement chooseCustomer;
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]")
    private WebElement selectCustomer;
    
    @FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/button[1]")
    private WebElement chooseSupplier;
    
    @FindBy(xpath = "//html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/div[1]")
    private WebElement selectSupplier;
    
    @FindBy(xpath = "//input[@id='debitAmount']")
    private WebElement debitAmount;
    
    @FindBy(xpath = "//input[@id='creditAmount']")
    private WebElement creditAmount;

    
 public void journalVouchar() throws IOException {
    	clickAndCapture(test, accounts, "accounts");    
    	clickAndCapture(test, voucharPayment, "voucharPayment");
        clickAndCapture(test, journalVouchar, "journalVouchar");
        clickAndCapture(test, newButton, "newButton");
        clickAndCapture(test, operatingUnit, "operatingUnit");
        clickAndCapture(test, selectOperatingUnit, "selectOperatingUnit");
        clickAndCapture(test, accountHead, "accountHead");
        clickAndCapture(test, accountsHeadJournalVouchar, "accountsHeadJournalVouchar");
        typeAndCapture(test, particulars, "particulars", "Automation Generated");
        clickAndCapture(test, chooseCustomer, "chooseCustomer");
        clickAndCapture(test, selectCustomer, "selectCustomer");
        
        clickAndCapture(test, chooseSupplier, "chooseSupplier");
        clickAndCapture(test, selectSupplier, "selectSupplier");
        
        typeAndCapture(test, debitAmount, "debitAmount","100");
        typeAndCapture(test, creditAmount, "creditAmount","100");
        clickAndCapture(test, saveButton, "saveButton");
        clickAndCapture(test, confirmButton, "confirmButton");
    }
    
}
