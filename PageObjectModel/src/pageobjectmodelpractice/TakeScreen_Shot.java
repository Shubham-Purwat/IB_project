package pageobjectmodelpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreen_Shot {
public void capture(WebDriver driver, String Name) throws IOException {
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\VELOCITY NOTE\\ScreenShot\\"+Name+".jpg");
	FileHandler.copy(Source, dest);
}
public static void main(String[]args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	TakeScreen_Shot obj=new TakeScreen_Shot();
	obj.capture(driver, "Login Page");
	
}
}


