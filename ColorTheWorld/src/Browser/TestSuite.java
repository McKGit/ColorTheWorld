package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GlobalClasses.ConstantsGlobalValues;

public class TestSuite {
	
	WebDriver driver;
	
	String browserType;
	
	/**
	 * Constructor for TestSuite class.	
	 */
	public TestSuite(){
		
	}

	/** 
	 * Return a browser at the home page URL to the test.
	 * @param browserType
	 * @return
	 */
	public WebDriver getWebDriver(String browserType){
		
		if(browserType.equalsIgnoreCase("chrome")){
			
			System.setProperty(ConstantsGlobalValues.getChromeWebDriverSystemProperty(), ConstantsGlobalValues.getChromeWebDriverPath());
			driver =  new ChromeDriver();
				
		}else if(browserType.equalsIgnoreCase("firefox")){
				
			System.setProperty(ConstantsGlobalValues.getGeckoDriverSystemProperty(), ConstantsGlobalValues.getGeckoWebDriverPath());

			driver = new FirefoxDriver();

		}else{
				
			throw new IllegalStateException("Browser name is not expected value: Chrome or FireFox.");
		}
			
		return driver;
		
	}
	
	
}
