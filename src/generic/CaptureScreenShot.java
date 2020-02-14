package generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CaptureScreenShot implements ITestListener
{
	
    public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}
	
    public void onTestFaliure(ITestResult result) 
    {
	  EventFiringWebDriver event = new EventFiringWebDriver(BaseTest.driver);
	  String methodName=result.getMethod().getMethodName();
	  try
	  {
		File src = event.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(".//ScreenShots//"+methodName+".png"));
	  }
	  catch(Exception e)
	  {
		  
	  }
	  }
   public void onTestFinish(ITestContext context){
		
	}

}
