package testClasses;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import baseClass.BaseClass;

	import baseClass.PathConfig;
	import baseClass.UtilityClass;
	import pomClass.Travel1POM;
//	import pomClasses.HomePage;


	public class TestCase1 {

	 BaseClass base;
	 WebDriver driver;
	 Travel1POM travel;
	 
	 int tcID;
	 @BeforeClass
	 public void launchBrowser() throws IOException {
	  base = new BaseClass();
	  driver = base.openBrowser();
	 }
	 
	 @BeforeMethod
	 public void refreshBrowser() {
	  
	//  driver.navigate().refresh();
	 }
	 
	 @Test
	 
	 public void tc001_travelInsurance() throws InterruptedException, EncryptedDocumentException, IOException {
	  tcID=001; 
	  
	  travel= new Travel1POM(driver);
	  travel.clickOnTravelInsurance();    // click on travel Insurance
	  travel.enterDestination(UtilityClass.getTestData(1, 1));    // Enter destination
	  travel.selectFirstOption();        // Select First opt 
	  Thread.sleep(2000);
	  travel.clickOnNext();              // Click on Next
	  travel.enterStartDate(UtilityClass.getTestData(1, 2));   // Select start Date
	  travel.enterEndDate(UtilityClass.getTestData(1, 3));    // Select end date
	  Thread.sleep(2000);
	  base.pressTab();                        // Press tab button
	  travel.clickOnNext();     // Click on Next
	  
	  travel.selectAge(UtilityClass.getTestData(1, 4));     // Select age
	  Thread.sleep(1000);
	  travel.clickOnNext();                 // Click on next
	  
	  travel.selectMedicalCondition(UtilityClass.getTestData(1, 5));
	  Thread.sleep(5000); 
	  
//	  travel.clickOnNext();                 // Click on next
//	  Thread.sleep(5000);   

//	  travel.enterMobile(UtilityClass.getTestData(1,6));  
	  String actualTitle = driver.getTitle(); 
	  System.out.println(actualTitle);
	  String expectedTitle = "PolicyBazaar Travel Insurance";
	  Assert.assertEquals(actualTitle, expectedTitle);  

	 }
 	 
	 @Test
	 public void tc003_travelInsurance() throws InterruptedException, EncryptedDocumentException, IOException {
	  tcID=002; 
	//  driver.get(PathConfig.chromeDriverPath);
	   travel= new Travel1POM(driver);
	  
	  travel.clickOnTravelInsurance();    // click on travel Insurance
	  travel.enterDestination(UtilityClass.getTestData(2, 1));    // Enter destination
	  travel.selectFirstOption();        // Select First opt 
	  travel.clickOnNext();              // Click on Next
	  travel.enterStartDate(UtilityClass.getTestData(2, 2));   // Select start Date
	  travel.enterEndDate(UtilityClass.getTestData(2, 3));    // Select end date
	  Thread.sleep(2000);
	  base.pressTab();                        // Press tab button
	  travel.clickOnNext();     // Click on NExt
	  travel.selectAge(UtilityClass.getTestData(2, 4));     // Select age
	  travel.clickOnNext();                 // Click on next
	  Thread.sleep(1000);  
	  
	  travel.selectMedicalCondition(UtilityClass.getTestData(2, 5));
	  Thread.sleep(1000);   
	  
	  
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "Travel Insurance";
	  Assert.assertEquals(actualTitle, expectedTitle);  

	 }
	 

	 @Test
	 public void tc004_travelInsurance() throws InterruptedException, EncryptedDocumentException, IOException {
	  tcID=003; 
	//  driver.get(PathConfig.chromeDriverPath);
	   travel= new Travel1POM(driver);
	  
	  travel.clickOnTravelInsurance();    // click on travel Insurance
	  travel.enterDestination(UtilityClass.getTestData(3, 1));    // Enter destination
	  travel.selectFirstOption();        // Select First opt 
	  travel.clickOnNext();              // Click on Next
	  travel.enterStartDate(UtilityClass.getTestData(3, 2));   // Select start Date
	  travel.enterEndDate(UtilityClass.getTestData(3, 3));    // Select end date
	  Thread.sleep(2000);
	  base.pressTab();                        // Press tab button
	  travel.clickOnNext();     // Click on NExt
	  travel.selectAge(UtilityClass.getTestData(3, 4));     // Select age
	  travel.clickOnNext();                 // Click on next
	  Thread.sleep(1000);
	  
	  travel.selectMedicalCondition(UtilityClass.getTestData(3, 5));
	  Thread.sleep(1000);
	  
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "PolicyBazaar Travel Insurance";
	  Assert.assertEquals(actualTitle, expectedTitle);  

	 }
	 
	 @Test
	 public void tc005_travelInsurance() throws InterruptedException, EncryptedDocumentException, IOException {
	  tcID=004; 
	//  driver.get(PathConfig.chromeDriverPath);
	   travel= new Travel1POM(driver);
	  travel.clickOnTravelInsurance();    // click on travel Insurance
	  travel.enterDestination(UtilityClass.getTestData(4, 1));    // Enter destination
	  travel.selectFirstOption();        // Select First opt 
	  travel.clickOnNext();              // Click on Next
	  travel.enterStartDate(UtilityClass.getTestData(4, 2));   // Select start Date
	  travel.enterEndDate(UtilityClass.getTestData(4, 3));    // Select end date
	  Thread.sleep(2000);
	  base.pressTab();                        // Press tab button
	  travel.clickOnNext();     // Click on NExt
	  travel.selectAge(UtilityClass.getTestData(4, 4));     // Select age
	  travel.clickOnNext();                 // Click on next
	  Thread.sleep(1000); 
	  
	  travel.selectMedicalCondition(UtilityClass.getTestData(4, 5));
	  Thread.sleep(1000);
	  
	  
	  String actualTitle = driver.getTitle();  
	  String expectedTitle = "PolicyBazaar Travel Insurance";
	  Assert.assertEquals(actualTitle, expectedTitle);  

	 }
 
	 
	 @AfterMethod
	 public void afterTestCase(ITestResult res) throws IOException {
	  if(ITestResult.FAILURE == res.getStatus()) 
	  {
		  UtilityClass.captureScreenshot(driver, tcID);
	  }
	  driver.navigate().refresh();
	 }
	 @AfterClass
	 public void closeBrowser()
	 {
	  Reporter.log("----close browser----", true);
	  //driver.close();
	 }
	
}
