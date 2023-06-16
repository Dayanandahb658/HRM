package Screenshot;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass
{
	WebDriver driver=new ChromeDriver();
	@BeforeClass
    public void Before() throws InterruptedException
    
    {
		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell i7 16\\Downloads\\chromedriver_win32\\chromedriver");
    	
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    }
	public void After()
	{
		driver.quit();
	}
}
