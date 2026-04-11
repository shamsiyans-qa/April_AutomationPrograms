package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends BaseClass{
		

@Test
public void correctUsernameCorrectPassword()
{
driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");

WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
userName.sendKeys("admin");

WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys("admin");

WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
signIn.click();
}	



@Test
public void correctUsernameIncorrectPassword()
{
	driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
	
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("admin");

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("adm");

	WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signIn.click();
	}	


	@Test
	public void incorrectUsernamecorrectPassword()
	{
	
    driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
	
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("admi");

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("admin");

	WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signIn.click();
	}	
	
	
	
	@Test
	public void incorrectUsernameIncorrectPassword()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("adm");

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("adm");

		WebElement signIn = driver.findElement(By.xpath("//button[text()='Sign In']"));
		signIn.click();
		}	
	}








