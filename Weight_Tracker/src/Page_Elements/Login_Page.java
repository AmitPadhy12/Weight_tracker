package Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page 
{
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.view.View[@content-desc=\"User Login\"]/android.widget.EditText[1]\r\n" + 
			"") 
	public WebElement Email;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"User Login\"]/android.widget.EditText[2]\r\n" + 
			"")
	public WebElement Password;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"LOGIN\"]")
	public WebElement Login;
	

}
