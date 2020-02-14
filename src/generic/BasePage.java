package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;



public class BasePage
{
public WebDriver driver = null;
public Logger log = Logger.getLogger(BasePage.class);
public BasePage(WebDriver driver)
{
	this.driver = driver;
}
public void verifyTitle(String exp_title)
{
	String act_title=null;
	try
	{
	 WebDriverWait w=new WebDriverWait(driver,10);
	 w.until(ExpectedConditions.titleIs(exp_title));
	 act_title= driver.getTitle();
	 Assert.assertEquals(act_title,exp_title);
	 log.info("Validated the"+act_title+"and the"+exp_title+"successfully");
	}
	catch(Exception e)
	{
		log.error(act_title+"and the"+exp_title+"didnot match"+e);
	}
  }
  
public void verifyElementPresent(WebElement ele)
{
	try
	{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(ele));
		log.info("WebElement"+ele+"is found");
	}
	catch(Exception e)
	{
	  log.error("Webelement"+ele+"was not found"+e);
	}
}
public void mouseOver(WebElement ele)
{
	try
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		log.info("Mouseovered"+ele);
	}
	catch(Exception e)
	{
		log.error("Unble to mouse hover on"+ele);
	}
}
	
}

