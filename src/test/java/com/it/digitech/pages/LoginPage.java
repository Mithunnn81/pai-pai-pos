package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.utilities.CommonMethods;
import com.it.digitech.utilities.ExcelUtils;

public class LoginPage extends CommonMethods{

	ExtentTest test;

	ExcelUtils excelUtils = new ExcelUtils();

	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBys({ @FindBy(xpath = "//input[@id='username']") })
	WebElement userName;

	@FindBys({ @FindBy(xpath = "//input[@id='password']") })
	WebElement passWord;

	@FindBys({ @FindBy(xpath = "//button[@id='button']") })
	WebElement submit;

	public void clickAndCapture(WebElement element, String elementName) throws IOException {
		
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
		
		public void login(String username, String password) throws IOException {
		
		try {
			if (userName.isDisplayed()) {
				userName.sendKeys(username);
				timeout();
				capturePass(test, "username");
			}
		}
		catch (Exception e) {
			captureFail(test, username);
			Assert.assertTrue(userName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if (passWord.isDisplayed()) {
				passWord.sendKeys(password);
				timeout();
				capturePass(test, "password");
			}
		}
		catch (Exception e) {
			captureFail(test, password);
			Assert.assertTrue(passWord.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		clickAndCapture(submit, "submit");
	}

}

