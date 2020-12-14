package Config_Class;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class App_Configuration extends Driver
{

	public App_Configuration(WebDriver driver)
	{
		App_Configuration.Weight_App=driver;
	}

	public void setUp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "10.0.0"); 
		capabilities.setCapability("deviceName","RZ8M22XKRLM");
		capabilities.setCapability("platformName","Android");
	 
	   
	   capabilities.setCapability("appPackage", "com.example.stack_finance_assignment");
		capabilities.setCapability("appActivity","com.example.stack_finance_assignment.MainActivity"); 
	   Weight_App = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
}
