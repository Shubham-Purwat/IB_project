package pageobjectmodelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insta_Login {
	@FindBy(xpath = "//input[@type='text']")
	private WebElement username ;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passward ;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button ;
	
	
	public void Login_instapage()
	{
		username.sendKeys("Shubham");
		passward.sendKeys("S143p143");
		login_button.click();
		
	}
	public Insta_Login (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

}
