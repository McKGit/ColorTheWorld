package GlobalClasses;

import java.util.List;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


//import ConstantsGlobalValues;
//import mainScript.Driverscript;
//import utilities.Locatorvaluesplit;

public class ActionKeywords {

	public static WebDriver driver;
	public static WebDriverWait wait; 
	public static String fetchedvalue;
	
	public static WebDriver browserType(String bName) {
		try {
			if (bName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ConstantsGlobalValues.getChromeWebDriverPath());
				driver = new ChromeDriver();	
				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
			} else if (bName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", ConstantsGlobalValues.getGeckoWebDriverPath());
				driver = new FirefoxDriver();			
				driver.manage().window().maximize();
			} else {
				System.out.println("Wrong browser name entered");
			}			
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("Browser type recognized.");
		
		return driver;
	}
	
	public static void openBrowser(String testdata) {
		try {
			driver.get(testdata);			
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}

		//Log.info("Browser opened.");
	
	}
	
	public static void mousehover_Withoutclick(String locatorvalue) {
		try {
			//WebElement membershiplink = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
		
			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 
			//WebElement membershipLink = driver.findElement(Locators.communityLink_EdurekaStudentMainPage);

			Actions act = new Actions(driver);
			//act.moveToElement(membershipLink).build().perform();
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}

		//Log.info("mouseover without click performed.");
	
	}
	
	public static void mousehover_Withclick(String locatorvalue) {
		try {
			//WebElement individualLink = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			
			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 
			//WebElement individualLink = driver.findElement(LocatorValues.communityLink_EdurekaStudentMainPage);
			
			Actions act = new Actions(driver);
			//act.moveToElement(individualLink).click().build().perform();
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("mouseover with click performed.");

	}
	
	public static void enterTextInTextBox(String textToEnter){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement searchTextBox = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(Locators.searchTextBox_CTWMainPage));

		searchTextBox.clear();
		
		searchTextBox.sendKeys(textToEnter);
	}
	
	public static String fetchValue(String locatorvalue) throws Exception {
		try {
			
			//fetchedvalue = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).getText();
			
			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 

			//fetchedvalue = driver.findElement(LocatorValues.communityLink_EdurekaStudentMainPage).getText();
			
			//System.out.println(fetchedvalue);

		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("Value retrieved.");

		return fetchedvalue;
	}
	
	public static void handling_click(String locatorvalue) {
		try {
			
			//WebElement joinNowButton = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
		
			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 
			//WebElement joinNowButton = driver.findElement(LocatorValues.communityLink_EdurekaStudentMainPage);
			
			//joinNowButton.click();
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("Click performed.");

	}
	
	public static void handling_textbox(String locatorvalue, String testdata) {
		try {
			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 
			//WebElement enterfirstName = driver.findElement(LocatorValues.communityLink_EdurekaStudentMainPage);
			
			//enterfirstName.sendKeys(testdata);
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("Value entered in input.");

	}
	
	public static void handling_Dropdown(String locatorvalue, String testdata) {
		try {

			//WebElement enterCountry = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));

			//THIS IS AN EXAMPLE OF HOW YOU ARE GOING TO DO IT: JUST SEND IN THE 'BY' LOCATOR; 
			//DON'T WORRY ABOUT SPITTING THIS TIME AROUND = MAYBE ASK ABOUT THIS IN CLASS: 
			//WebElement enterCountry = driver.findElement(LocatorValues.communityLink_EdurekaStudentMainPage);
			
			//Select selcountry = new Select(enterCountry);
			//selcountry.selectByVisibleText(testdata);
			
			
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}
		
		//Log.info("Option selected in drop down.");

	}
	
	public static void closebrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			//Driverscript.bvalue = false;
			e.printStackTrace();
		}	
		
		//Log.info("Browser closed.");

	}

	public static void enterSearchTextMainPage(String textToEnter, WebDriver driver) {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement searchTextBox = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(Locators.searchTextBox_CTWMainPage));
		
		searchTextBox.clear();
		
		searchTextBox.sendKeys(textToEnter);

	}
	
	public static void clickSearchToolMainPage(WebDriver driver){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement searchTool = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(Locators.searchToolIcon_CTWMainPage));

		//searchTool.click();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", searchTool);
		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(searchTool).click().build().perform();


	}


//	public static WebDriver openBrowser() {
//	
//		System.out.println("OPENING A BROWSER SESSION.");
//			
//		String browser = "chrome";
//		
//		if(browser.equalsIgnoreCase("chrome")){
//			
//			System.setProperty(ConstantsGlobalValues.getChromeWebDriverSystemProperty(), ConstantsGlobalValues.getChromeWebDriverPath());
//			driver =  new ChromeDriver();
//				
//		}else if(browser.equalsIgnoreCase("firefox")){
//				
//			System.setProperty(ConstantsGlobalValues.getGeckoDriverSystemProperty(), ConstantsGlobalValues.getGeckoWebDriverPath());
//
//			driver = new FirefoxDriver();
//
//		}else{
//				
//			throw new IllegalStateException("Browser name is not expected value: Chrome or FireFox.");
//		}
//			
//		return driver;
//		
//	}
}