package Test_Case;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Config_Class.Driver;
import Page_Elements.Home_Page;

public class Add_New_Weight extends Driver
{
	
	@Test(priority=2)
	public void Add_Your_Weight() throws MalformedURLException, InterruptedException
	{
		Valid_User_Login Login=new Valid_User_Login(Weight_App);
		Login.Valid_user();
		Thread.sleep(5000);
		Home_Page home=new Home_Page(Weight_App);
		home.Add_New_Weight.click();
		home.Save.click();
	}
}
