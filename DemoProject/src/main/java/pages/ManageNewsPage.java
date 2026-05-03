package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
//	@FindBy(xpath="//p[contains(text(),'Manage News')]/ancestor::div[contains(@class,'small-box')]//a")WebElement managenews;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement textarea;
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertsuccessmessage;
	
	
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}


/*	public void clickOnManageNewsMoreInfo()
	{
		managenews.click();
	} */
	
	
	public ManageNewsPage clickNewButton()
	{
		newbutton.click();
		return this;
	}
	
	public ManageNewsPage enterTheNews(String newsContent)
	{
		textarea.sendKeys(newsContent);
		return this;
	}
	
	
	public ManageNewsPage clickonSaveButton()
	{
		savebutton.click();
		return this;
	}
	
	public boolean successAlert()
	{
	return alertsuccessmessage.isDisplayed();
	
}}
