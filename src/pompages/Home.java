package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Home extends BasePage
{
	
 @FindBy(linkText="Log In")
 private WebElement lnk_logo;
 
 @FindBy(id="si_popup_email")
 private WebElement sendKey_email;

 @FindBy(id="si_popup_passwd")
 private WebElement sendKey_password; 
 
 @FindBy(linkText="Login")
 private WebElement login_button;
 
 @FindBy(linkText="Blog")
 private WebElement lnk_blog; 
 
 @FindBy(linkText="Top 50 Selenium Interview Questions And Answers You Mus...")
 private WebElement lnk_question;
 
 public Home(WebDriver driver)
 {
	 super(driver);
	 PageFactory.initElements(driver,this);
 }
 public void clickOnLogin()
 {
	 try
	 {
	    verifyElementPresent( lnk_logo); 
		lnk_logo.click();
		log.info("Clicked successfully on"+ lnk_logo);
	 }
	 catch(Exception e)
	 {
		log.error("Unable to click on"+ lnk_logo+e); 
	 }
	 
 }
 
 public void enterEmailId()
 {
	 try
	 {
		 verifyElementPresent(sendKey_email);
		 sendKey_email.sendKeys();
		 log.info("successfully"+sendKey_password);
		  }
	 catch(Exception e)
	 {
		log.error("Unable"+sendKey_email+e); 
	 
 }
 
}

 public void enterPassword()
 {
	 try
	 {
		 verifyElementPresent(sendKey_password);
		 sendKey_password.sendKeys();
		 log.info("successfully"+sendKey_password);
		  }
	 catch(Exception e)
	 {
		log.error("Unable"+sendKey_password+e); 
	 
 }
 
}
 public void loginButton()
 {
	 try
	 {
		 verifyElementPresent(login_button);
		 login_button.click();
		 log.info("successfully"+login_button);
		  }
	 catch(Exception e)
	 {
		log.error("Unable"+login_button+e); 
	 
 }
 
}
 public void enterBlog()
 {
	 try
	 {
		 verifyElementPresent( lnk_blog);
		 lnk_blog.click();
		 log.info("successfully"+ lnk_blog);
		  }
	 catch(Exception e)
	 {
		log.error("Unable"+ lnk_blog+e); 
	 
 }
 
}
 public void enterSeleniumQuestion()
 {
	 try
	 {
		 verifyElementPresent(lnk_question);
		 lnk_question.click();
		 log.info("successfully"+ lnk_question);
		  }
	 catch(Exception e)
	 {
		log.error("Unable"+ lnk_question+e); 
	 
 }
 
}


}