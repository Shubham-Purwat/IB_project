package pageobjectmodelpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_MainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(3000);
	Insta_Login obj=new Insta_Login (driver);
	obj.Login_instapage();
	Thread.sleep(3000);
	driver.close();
	
	

	}

}
