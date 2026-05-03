package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	

	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
    
	
	
	@FindBy(xpath="//p[contains(text(),'Manage News')]/ancestor::div[contains(@class,'small-box')]//a")WebElement managenews;
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	

	public ManageNewsPage clickOnManageNewsMoreInfo()
	{
		managenews.click();
		return new ManageNewsPage(driver);
	}
	
	

	
	
	
	
	public void clickOnAdmin()
	{
		admin.click();
	}
	
	public void clickOnLogout()
	{
		
		logout.click();
	}
	
	
}
