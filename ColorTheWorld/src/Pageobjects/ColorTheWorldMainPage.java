package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GlobalClasses.ActionKeywords;
import GlobalClasses.Locators;

public class ColorTheWorldMainPage {
	
	WebDriver driver;
	
	public ColorTheWorldMainPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isCurrentPage()){
			
			throw new IllegalStateException("The Color the World Main page is not displayed.");
		}
	}
	
	/**
	 * Is the Color the World page displayed?
	 * @return
	 */
	private boolean isCurrentPage() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		try{
			
			webDriverWait.until(ExpectedConditions.presenceOfElementLocated(Locators.LogoLink_CTWMainPage));
			
		}catch(TimeoutException toe){
			
			return false;
		}
		
		return true;

	}

	public void enterSearchText(String searchText) {
		
	  	ActionKeywords.enterSearchTextMainPage(searchText, driver);
	}

	/** 
	 * Click Search Tool Icon on Color the World Main page.
	 */
	public void clickSearchToolIcon() {
		
		ActionKeywords.clickSearchToolMainPage(driver);
		
	}

}
