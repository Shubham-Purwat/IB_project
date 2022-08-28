package pageobjectmodelpractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass_POM {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
POM_Class obj=new POM_Class(driver);
obj.LogIn();
Thread.sleep(3000);
TakeScreen_Shot S1=new TakeScreen_Shot ();
S1.capture(driver, "LoginPage101");
driver.get("https://www.facebook.com/");
NewAccount Su=new NewAccount (driver);
Su.SingUp();
Thread.sleep(3000);
TakeScreen_Shot S2=new TakeScreen_Shot ();
S2.capture(driver, "Sighuppage");
Thread.sleep(5000);
driver.close();

	}

}
