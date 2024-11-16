package com.it.digitech.tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.it.digitech.drivers.PageDriver;
import com.it.digitech.pages.StockAdjustmentPage;
import com.it.digitech.utilities.CommonMethods;
import com.it.digitech.utilities.ExtentFactory;

public class StockAdjustmentTest extends CommonMethods{

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		timeout();
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Stock Adjustment</b></p>").assignAuthor("Mithun").assignDevice("Windows");
	}
	
	@Test
	public void testStockAdjustment() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Check For a successfull Stock Adjustment</b></p>");
		StockAdjustmentPage stockAdjustmentPage = new StockAdjustmentPage(childTest);
		stockAdjustmentPage.StockAdjustment();
	}
	
	@AfterClass
	public void report() {
		report.flush();
	}
	
}
