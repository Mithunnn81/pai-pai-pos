package com.it.digitech.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

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
			
		public void login() throws IOException {
		
		typeAndCapture(test, userName, "username", "mithun123");
		typeAndCapture(test, passWord, "passWord", "1234");
		clickAndCapture(test, submit, "submit");
	}

}

