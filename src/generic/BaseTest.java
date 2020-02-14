package generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	@BeforeMethod
	public void launchApp(String browser)
	{
	// switch(browser)
	// {

	// case "CHROME":
		 System.setProperty(CHROME_KEY,CHROME_VALUE);
		 driver=new ChromeDriver();
		 wait=new WebDriverWait(driver,10);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get(APP_URL);
	    // break;
	     
	// case "FIREFOX":
	//	 System.setProperty(GECKO_KEY,GECKO_VALUE);
	//	 driver=new ChromeDriver();
	//	 wait=new WebDriverWait(driver,10);
	//	 driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
	    // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   //  driver.get(APP_URL);
	     
	    // default:
		// System.out.println("Invalid browser");
	// }
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
	}


