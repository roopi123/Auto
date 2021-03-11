package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public LoginPage(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement name;
@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
public WebElement gender;
@AndroidFindBy(id="android:id/text1")
public WebElement country;
@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
public WebElement shop;
}
