package Test_Case;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Config_Class.App_Configuration;
import Config_Class.Driver;
import Page_Elements.Login_Page;

public class Valid_User_Login extends Driver
{
	public Valid_User_Login(WebDriver driver)
	{
		App_Configuration.Weight_App=driver;
	}
	@Test(priority=1)
   public void Valid_user() throws MalformedURLException, InterruptedException
   {
		App_Configuration Config = new App_Configuration(Weight_App);
		Config.setUp();
		Login_Page Login=new Login_Page(Weight_App);
		Login.Email.sendKeys("test@test.com");
	    Login.Password.sendKeys("test1234");
	    Login.Login.click();
	    
   }
}
