package com.it.digitech.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.pages.PurchaseReturnPage;
import com.it.digitech.utilities.CommonMethods;
import com.it.digitech.utilities.ExtentFactory;

public class PurchaseReturnTest extends CommonMethods{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		timeout();
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Purchase Return Module</b></p>").assignAuthor("Mithun").assignDevice("Windows");
	}
	
	@Test
	public void testPurchaseReturnMethod() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Check for a successfull purchase return</b></p>");
		PurchaseReturnPage purchaseReturnPage = new PurchaseReturnPage(childTest);
		purchaseReturnPage.purchaseReturn();
	}
	
	@AfterClass
	public void report() {
		report.flush();
	}

}
