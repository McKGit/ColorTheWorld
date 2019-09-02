package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Browser.TestSuite;
import GlobalClasses.ActionKeywords;
import GlobalClasses.ConstantsGlobalValues;
import Pageobjects.ColorTheWorldMainPage;

public class MainPageTests
{

	TestSuite testSuite;
	
	WebDriver driver;
	
	/**
	 */
	@BeforeMethod
	public void openBrowser(){
		
		TestSuite testSuite = new TestSuite();
		
		driver = testSuite.getWebDriver(ConstantsGlobalValues.getChromeBrowserType());
		
		driver.get(ConstantsGlobalValues.getColorTheWorldUrl());

		driver.manage().window().maximize();

		}
	
	
  @Test()
  public void testElements_MainPage() {
	  
	  	ColorTheWorldMainPage colorTheWorldMainPage = new ColorTheWorldMainPage(driver);
	  	
	  	String searchText = "Irresistible";
	  	
	  	colorTheWorldMainPage.enterSearchText(searchText);
	  	
	  	colorTheWorldMainPage.clickSearchToolIcon();
	  
	  
  }
}
