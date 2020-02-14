package testscript;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import pompages.Home;

public class LoginScripts extends BaseTest
{
	
	Home home = null;
	
	
	@Test
	public void TC_01_Login()
	{
		home = new Home(driver);
		
		
		try
		{
		 String[][]	credentials = ReadExcel.getData(FILE_PATH, "sheet1");
		 for(int i = 1; i<credentials.length;i++)
		 {
			 String email = credentials[i][0];
			 String password = credentials[i][1];
			 
			 home.clickOnLogin();
			 home.enterEmailId(email);
			 home.enterPassword(password);
			 home. loginButton();
			 home.enterBlog();
			 home.enterSeleniumQuestion();
			 
			 System.out.println("TC_01_Login executed successfully") ;
		}
		}
		catch(Exception e)
		{
		    System.out.println("TC_01_Login fail"+e) ;
}
}
	}