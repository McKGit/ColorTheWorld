package GlobalClasses;

import org.openqa.selenium.By;


public class Locators {
	
	//<a href="https://colortheworldlipsticks.com" title="Color The World"> 
	//<img src="//cdn.shopify.com/s/files/1/0915/8598/files/colortheworldlipstickslogoblack_c224a301-99d8-4a24-913b-6ec0d1c9b54b_1_410x.png?v=1534417163" class="primary_logo" alt="Color The World"></a>

	//BEGIN EDUREKA WEBSITE LOCATORS

	//Edureka Main Page
	
	//<input type="text" name="q" placeholder="Search" value="" autocapitalize="off" autocomplete="off" autocorrect="off">
	//*[@id="shopify-section-header"]/header[2]/div/div[3]/div/div[3]/ul/li[1]/form/input[2]
	//public static By searchTextBox_CTWMainPage = By.xpath("//*[@id='shopify-section-header']/header[2]/div/div[3]/div/div[3]/ul/li[1]/form/input[2]");
	
	///<form action="/search" class="header_search_form"> <input type="hidden" name="type" value="product"> <span class="icon-search search-submit"></span> <input type="text" name="q" placeholder="Search" autocapitalize="off" autocomplete="off" autocorrect="off" class="search-terms"><div class="search__results-wrapper" style="display: none;"><ul class="search__results"></ul></div></form>
	//body.index.promo_banner-show:nth-child(2) div.shopify-section.header-section:nth-child(9) div.header.header-fixed--true.header-background--solid div.main_nav_wrapper div.main_nav.clearfix.menu-position--inline.logo-align--center div.nav:nth-child(3) ul.menu.center.clearfix li.search_container form.search_form > input:nth-child(3)
	
	//div[@class='main_nav_wrapper']//div[@class='nav']//input[@placeholder='Search']
	
	public static By searchTextBox_CTWMainPage = By.xpath("//div[@class='main_nav_wrapper']//div[@class='nav']//input[@placeholder='Search']");

	//public static By searchTextBox_CTWMainPage = By.cssSelector("form[action='/search'] input[name='q']");

	//<span class="icon-search search-submit"></span>
	///html[1]/body[1]/div[8]/header[2]/div[1]/div[3]/div[1]/div[3]/ul[1]/li[1]/form[1]/span[1]
	public static By searchToolIcon_CTWMainPage = By.xpath("/html[1]/body[1]/div[8]/header[2]/div[1]/div[3]/div[1]/div[3]/ul[1]/li[1]/form[1]/span[1]");
	
	public static By loginLink_EdurekaMainPage = By.cssSelector("a[title='Color The World']");

	public static By LogoLink_CTWMainPage = By.cssSelector("a[title='Color The World']");

//	public static By headerText_EdurekaMainPage = By.tagName("h1");
//	
//	//Edureka Log In Page
//
//	public static By enterEmail_LoginPage = By.id("inputName");
//	
//	public static By enterPassword_LoginPage = By.xpath("//*[@id='pwd1']");
//	
//	public static By loginButton_LoginPage = By.xpath("//button[@data-gaact='Login Click']");
//
//	//Edureka Student Main Page
//	
//	public static By searchInput_StudentMainPage = By.id("homeSearchBar");
//	
//	public static By searchIcon_EdurekaStudentMainPage = By.id("homeSearchBarIcon");
//	
//	public static By communityLink_EdurekaStudentMainPage = By.linkText("Community");
//	
//	public static By blogLink_EdurekaStudentMainPage = By.linkText("Blog");
//	
//	public static By browseLink_EdurekaStudentMainPage = By.linkText("Browse Courses");
//	
//	public static By userSpan_EdurekaStudentMainPage = By.xpath("//span[@class = 'user_name']");		
//	
//	public static By coursesLink_EdurekaStudentMainPage = By.linkText("Courses");
//
//	public static By allCoursesLink_EdurekaStudentMainPage = By.linkText("All Courses");
//
//	public static By myClassroomLink_EdurekaStudentMainPage = By.linkText("My Classroom");
//	
//	//public static By userDropDown_EdurekaStudentMainPage = By.xpath("//span[@class='user_name']");    
//	
//	public static By userDropDown_EdurekaStudentMainPage = By.xpath("//*[@id='header-II']/section/nav/div/ul[2]/li[1]/a/span");
//
//    public static By logOutLink_EdurekaStudentMainPage = By.linkText("Log Out");

}
