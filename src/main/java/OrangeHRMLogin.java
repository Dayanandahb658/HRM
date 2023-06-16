import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMLogin 
{
	@Test( dataProvider  = "DataExcel")
public void demo() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell i7 16\\eclipse-workspace\\lab\\Drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.quit();
}
	@DataProvider(parallel = true)
	public Object[][]  DataExcel()
	
	{
		Object[][] data=new Object[4][4];
		data[0][0]="Admin";
		data[0][1]="Admin123";
		
		data[1][0]="Admin";
		data[1][1]="Test123";
		
		data[2][0]="Admin";
		data[2][1]="Test123";
		
		data[3][0]="Admin";
		data[3][1]="Test123";
		
		
		return data;
	}
}
