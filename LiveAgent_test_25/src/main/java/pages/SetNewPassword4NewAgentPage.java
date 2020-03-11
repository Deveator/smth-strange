package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SetNewPassword4NewAgentPage extends PageObject{
	
	private String info1 = "TestNO - couldn't create new password";
	private String info2 = "TestNO - couldn't error message";
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement psswrdStr;
	
	@FindBy(xpath = "//div[@class='FormMessage FormMessage-error']")
	private WebElement errorMssg;
	
	@FindBy(xpath = "//input[@name='passwordAgain']")
	private WebElement retypePsswrdStr;
	
	@FindBy(xpath = "//span[@class='buttonText']")
	private WebElement loginBttn;
	
	@FindBy(css = "div.FormPanel.DecoratedContentWidget div.g-FormField2:nth-child(5) div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.g-ListBox > input.g-ListBoxInput")
	private WebElement langStr;
	
	public SetNewPassword4NewAgentPage(WebDriver dr) {
		super(dr);
	}
	
	public void createPassword4NewAgent(String psswrdVal) {
		
		try {
			pause(1000);
			psswrdStr.sendKeys(psswrdVal);
			pause(800);
			retypePsswrdStr.sendKeys(psswrdVal);
			pause(600);
			langStr.click();
			Actions actions = new Actions(pageObjectDriver);

			// set English in lang string
			for (int i = 0; i < 50; i++) {
				actions.sendKeys(Keys.ARROW_UP);
			}
			for (int i = 0; i < 7; i++) {
				actions.sendKeys(Keys.ARROW_DOWN);
				pause(100);
			}
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
			// end set "English" language
			pause(800);
			loginBttn.click();
		} catch (Exception e) {
			errorInfo(info1);
		}		
	}
	
	public void verifyPresenceOfErrorMessage() {
		pause(800);
		if(!errorMssg.isDisplayed()) {
			errorInfo(info2);
		}
	}
}
