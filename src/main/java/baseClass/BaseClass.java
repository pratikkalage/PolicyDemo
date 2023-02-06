package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver",PathConfig.chromeDriverPath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(PathConfig.URLPath);
		return driver;		
	}
	public void pressTab() {
		
	}
}
