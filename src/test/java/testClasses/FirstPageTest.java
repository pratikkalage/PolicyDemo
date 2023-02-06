package testClasses;

	import java.io.IOException;
//	import java.util.concurrent.TimeUnit;

//	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

//	import baseClass.BaseClass;
//	import baseClass.PathConfig;
//	import baseclasses.Utility;
//	import pomClasses.HomePage;
	import pomClass.Travel1POM;

	public class FirstPageTest {
//	 BaseClass base;
	 WebDriver driver;
	 int tcID;
	 @BeforeClass
	 public void launchBrowser() throws IOException {
//	  base = new BaseClass();
//	  driver=base.initializeBrowser();
	 }
	 
	 @BeforeMethod
	 public void refreshBrowser() {
	  
	  driver.navigate().refresh();
	 }
	 
	 @Test
	 public void tc001_travelInsurance() throws InterruptedException {
	  tcID=001; 
	  
	  Travel1POM travel= new Travel1POM(driver);
	  travel.clickOnTravelInsurance();    // click on travel Insurance
	  travel.enterDestination("USA");    // Enter destination
	  travel.selectFirstOption();        // Select First opt 
	  travel.clickOnNext();              // Click on Next
	  travel.enterStartDate("15-02-2023");   // Select start Date
	  travel.enterEndDate("20-02-2023");    // Select end date
	  Thread.sleep(2000);
//	  base.pressTab();                        // Press tab button
	  travel.clickOnNext();     // Click on NExt
	  travel.selectAge("30");     // Select age
	  travel.clickOnNext();                 // Click on next
	  Thread.sleep(1000);   
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "PolicyBazaar Travel Insurance";
	  Assert.assertEquals(actualTitle, expectedTitle);  

	 }
	 
	 @AfterMethod
	 public void afterTestCase(ITestResult res) throws IOException {
	  if(ITestResult.FAILURE == res.getStatus()) 
	  {
//	  Utility.captureScreenshot(driver, tcID);
	  }
	 }
	 @AfterClass
	 public void closeBrowser()
	 {
	  Reporter.log("----close browser----", true);
	  //driver.close();
	 }
	}