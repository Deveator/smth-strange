package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import general.Help;

public class LoginPage extends PageObject {

	private static String info1 = "TestNO - couldn't type in password string";
	private static String info2 = "TestNO - couldn't type again in password string";
	private static String info3 = "TestNO - couldn't login as new created agent";
	private static String info4 = "TestNO - couldn't find checkbox";
	private static String info5 = "TestNO - couldn't type in 'username' string";

	@FindBy(css = "div[class *= 'ImLeButton ImLeButtonMainOut LoginButton']")
	public WebElement logiBttn;

	@FindAll({@FindBy(name = "username"),@FindBy(css = "input[name='username']")})
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "passwordAgain")
	private WebElement passwordAgain;

	@FindBy(xpath = "//div[@class='CheckBoxContainer']/div[1]")
	private WebElement rememberChckbx;

	@FindBy(css = "input.g-ListBoxInput")
	private WebElement langString;

	@FindBy(tagName = "body")
	public WebElement fBody;

	@FindBy(tagName = "stub")
	public WebElement error;

	@FindBy(xpath = "//span[@class='buttonText']")
	public WebElement lgBttn;

	public LoginPage(WebDriver dr) {
		super(dr);
	}

	public void clickLoginBttn() {
		waitTryClick(20, logiBttn, info3);
	}

	public void clickToLogin() {
		try {
			pause(600);
			lgBttn.click();
		} catch (Exception e) {
			errorInfo(info3);
		}
	}

	public LoginPage typeUsername(String st) {
		waitTryType(20, username, st, info5);
		return this;
	}

	public LoginPage typePassword(String st) {
		waitTryType(20, password, st, info1);
		return this;
	}

	public void typePasswordForNewAgent(String st) {
		try {
			pause(600);
			password.sendKeys(st);
		} catch (Exception e) {
			errorInfo(info1);
		}
	}

	public void typePasswordForNewAgentAgain(String st) {
		try {
			pause(600);
			passwordAgain.sendKeys(st);
		} catch (Exception e) {
			errorInfo(info2);
		}
	}

	public LoginPage checkToRemember() {
		// get value from remember checkBox
		waitForDisplay(20, rememberChckbx, info4);
		String s = rememberChckbx.getAttribute("aria-checked");
		// if true uncheck remember checkBox
		if (s.equals("true")) {
			rememberChckbx.click();
		}
		return this;
	}

	public LoginPage setLang(int k) {

		langString.click();
		pause(800);
		Actions actions = new Actions(pageObjectDriver);

		// set English in lang string
		for (int i = 0; i < 50; i++) {
			actions.sendKeys(Keys.ARROW_UP);
		}
		for (int i = 0; i < k; i++) {
			actions.sendKeys(Keys.ARROW_DOWN);
			pause(100);
		}
		actions.sendKeys(Keys.ENTER);
		// end set "English" language
		actions.build().perform();
		pause(800);
		// click on LOGIN
		// langString.click();
		return this;
	}
	
	public LoginPage setLang(String lang) {

		String actValue = "";
		waitTryClick(20, langString, info1);
		pause(800);
		Actions actions = new Actions(pageObjectDriver);
		for (int i = 0; i < 50; i++) {
			actions.sendKeys(Keys.ARROW_UP);
			actions.build().perform();
		}
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
			do {
				waitTryClick(20, langString, info1);
				actions.sendKeys(Keys.ARROW_RIGHT);
				actions.sendKeys(Keys.ARROW_RIGHT);
				actions.sendKeys(Keys.ARROW_DOWN);
				actions.build().perform();
				actions.sendKeys(Keys.ENTER);
				actions.build().perform();
				actValue = langString.getAttribute("value");
			} while (!actValue.contains(lang) | Help.englishNum > 100);
		
		return this;
	}

	public LoginPage setLang(String lang, int num) {

		String actValue = "";
		waitTryClick(20, langString, info1);
		pause(800);
		Actions actions = new Actions(pageObjectDriver);
		for (int i = 0; i < 50; i++) {
			actions.sendKeys(Keys.ARROW_UP);
			actions.build().perform();
		}
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		if (Help.langIsFound) {
			for (int i = 0; i < num; i++) {
				actions.sendKeys(Keys.ARROW_DOWN);
				pause(100);
			}
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
		} else {
			do {
				waitTryClick(20, langString, info1);
				actions.sendKeys(Keys.ARROW_RIGHT);
				actions.sendKeys(Keys.ARROW_RIGHT);
				actions.sendKeys(Keys.ARROW_DOWN);
				actions.build().perform();
				Help.englishNum++;
				actions.sendKeys(Keys.ENTER);
				actions.build().perform();
				actValue = langString.getAttribute("value");
			} while (!actValue.contains(lang) | Help.englishNum > 100);
			if (actValue.contains(lang)) {
				Help.langIsFound = true;
			}
		}
		return this;
	}
	
	public void firstTimeLogin(String st, String st2, String lang, int num) {
		typeUsername(st);//
		typePassword(st2);//
		setLang(lang, num);
		checkToRemember();
		clickLoginBttn();
	}

	public void login(String st, String st2, String lang, int num) {
		typeUsername(st);
		typePassword(st2);
		setLang(lang, num);
		// pause(1000);
		checkToRemember();
		// pause(1000);
		clickLoginBttn();
	}

	public String getBody() {
		String body = fBody.getText();
		return body;
	}

	public void approveLogout(String st) {
		pause(2000);
		if (getBody().contains(st)) {
			pageObjectDriver.close();
			error.click();
		}
	}
}
