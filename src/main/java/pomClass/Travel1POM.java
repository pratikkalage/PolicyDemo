package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

		public class Travel1POM {

		 		 
		 @FindBy(xpath = "//button[text()='Next']") private WebElement next; 
	//	 @FindBy(xpath = "//button[@class='travel_main_cta']") private WebElement next; 
	 
		 @FindBy(xpath = "//input[@id='country']") private WebElement dest; 
		 @FindBy(xpath = "//ul[@class='search-list']/li") private WebElement firstopt; 
		 @FindBy(xpath = "(//input[@type='text'])[1]") private WebElement sDate; 
		 @FindBy(xpath = "(//input[@type='text'])[2]") private WebElement eDate; 

		 @FindBy(xpath = "(//select[@id='feet'])") private WebElement age; 
		 
	//	 @FindBy(xpath = "(//input[@type='radio'])[1]") private WebElement opt;
		 @FindBy(xpath = "//label[@for='ped_yes']") private WebElement opt_yes;
		 @FindBy(xpath = "//input[@id='ped_no']") private WebElement opt_no;
	 
		 @FindBy(xpath = "//input[@id='mobileNumber']") private WebElement mob;
		 @FindBy(xpath = "(//div[@class='prd-icon add shadowHandler short'])[7]") private WebElement travelInsurance; 
		 
		 // Constructor
		 public Travel1POM(WebDriver driver )
		 {
		  PageFactory.initElements(driver, this);
		 }
		 
		 public void clickOnTravelInsurance() {
		  travelInsurance.click();
		 }
		 // usage
		 public void enterDestination(String destn) {
		  dest.sendKeys(destn);  
		 }
		 
		 public void selectFirstOption() {
		  firstopt.click();
		 }
		 
		 public void clickOnNext() {
		  next.click();
		 }
		 
		 public void enterStartDate(String date) {
		  sDate.sendKeys(date);
		 }
		 public void enterEndDate(String date) {
		  eDate.sendKeys(date);
		 }
		 
		 public void selectAge(String ag) {
		  Select s = new Select(age);
		  //s.selectByValue(ag);
		  s.selectByVisibleText(ag);
		  //s.selectByIndex(ag);
		 }
		 
		 public void selectMedicalCondition(String opt) { 
			 if (opt.equalsIgnoreCase("Yes")){		// ith "==" chalal nahi so .equaligorecase use kel
				  opt_yes.click();
			 }
			 else if (opt.equalsIgnoreCase("No")) {
				  opt_no.click();
			 }	  
		 }
		 
		 public void enterMobile(String number) 
		 {
		  mob.sendKeys(number);
		 }
}
