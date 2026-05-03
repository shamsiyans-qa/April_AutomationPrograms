package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;



public class LoginPage {
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alert;
	
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //for initializing webelements
	}

	public LoginPage enterUserName(String userNameValue)
	{
		
		username.sendKeys(userNameValue);
		return this;
	}

	public LoginPage enterPassword(String passwordValue)
	{
		password.sendKeys(passwordValue);
		return this;
	}
	
	
	public HomePage clickOnSignIn()
	{
		/*WaitUtility waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, signin); */
		signin.click();
		return new HomePage(driver);
	}
	
	
	public boolean isHomePageDisplayed() //for verifying the validation
	{
		return dashboard.isDisplayed();    //validation : isDisplayed and assertion should applied
	//checking whether the dashboard is displaying while directing to HomePage
	}
	
	
	public boolean isAlertMessageDisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	/*public void countryDropdown()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectByVisibleTextMethod(country, "India");  //country : WebElement name ; India : text 
	}*/
}

