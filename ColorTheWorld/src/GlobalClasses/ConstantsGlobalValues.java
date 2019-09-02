package GlobalClasses;

public class ConstantsGlobalValues {
	
	final static String chromeBrowserType = "chrome";
	
	final static String urlEdureka = "http://www.edureka.co";

	final static String urlColorTheWorld = "http://www.colortheworldlipsticks.com";
	
	final static String urlGoogle = "http://www.google.com";
	
	public final static String chromeWebDriverSystemProperty = "webdriver.chrome.driver";
	
	private final static String chromeWebDriverPath = "C:\\Automation\\ChromeWebDriver\\chromedriver.exe";

	public static String geckoDriverPathSystemProperty = "webdriver.gecko.driver";
	
	public static String geckoWebDriverPath = "C:\\GeckoDriver\\geckodriver.exe";

	public static String geckoDriverSystemProperty;
	
	public final static String getGoogleUrl(){
		
		return urlGoogle;
	}
	
	public final static String getColorTheWorldUrl(){
		
		return urlColorTheWorld;
	}
	
	public final static String getChromeWebDriverSystemProperty(){
		
		return chromeWebDriverSystemProperty;
	}
	
	public final static String getChromeWebDriverPath(){
		
		return chromeWebDriverPath;
	}
	
	public final static String getGeckoWebDriverPath(){
		
		return geckoWebDriverPath;
	}

	public static String getGeckoDriverSystemProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getChromeBrowserType() {
		return chromeBrowserType;
	}
}
