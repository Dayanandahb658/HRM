package bag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browserlaunch{

   //public static void main(String[] args)
   @Test
	public  void Browser()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell i7 16\\eclipse-workspace\\lab\\Drive\\chromedriver.exe");
	   //System.setProperty("webdriver.chrome.driver", "")
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
}
}
