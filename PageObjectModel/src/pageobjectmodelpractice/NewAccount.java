package pageobjectmodelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
	@FindBy(xpath="//a[text()='Create New Account']")
private 	WebElement Createbutton;
	//@FindBy(name = "firstname")
	//private WebElement Fristname;


public void SingUp() {
	Createbutton.click();
	//Fristname.sendKeys("Shubham");
}
public  NewAccount(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

}


