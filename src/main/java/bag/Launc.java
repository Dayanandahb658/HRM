package bag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Launc
{
	WebDriver driver;
	String browser="chrome";
	
	@Test
 public void initilizeBrowser(String browser) {
	 if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
	 }else if(browser.equalsIgnoreCase("firefox")){
		 driver = new FirefoxDriver();
	 }else if(browser.equalsIgnoreCase("safari")) {
		 driver = new SafariDriver();
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.google.com/");
 }

}
