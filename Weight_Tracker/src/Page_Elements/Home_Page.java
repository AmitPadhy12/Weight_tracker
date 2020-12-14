package Page_Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config_Class.Driver;

public class Home_Page extends Driver
{
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Add New Weight\"]")
	public WebElement Add_New_Weight;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View")
	public WebElement Save;
	
	@FindBy(xpath="//*[@class='android.widget.Button']")
	public WebElement Previous;
}
