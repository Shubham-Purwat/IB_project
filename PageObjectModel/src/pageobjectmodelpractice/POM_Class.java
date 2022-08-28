package pageobjectmodelpractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class {
	@FindBy(xpath = "//input[@id='email'] ")
	private WebElement User_id;
	@FindBy(xpath = "//input[@id='pass'] ")
	private WebElement Password;
	@FindBy(xpath = "//button[@name='login'] ")
	private WebElement login_b;
	
	public void LogIn() throws IOException
	{
		User_id.sendKeys("Shubham");
		 Password.sendKeys("Purwat");
		 login_b.click();
		
	}
	public POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
