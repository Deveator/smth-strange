package passwordCases;

import general.Help;
import pages.ConfigPage;
import pages.ConfigSettingsPage;
import pages.LoginPage;
import pages.StartPage;

public class MinLengthPasswordString_1 extends Help {

//	public static void main(String[] args) {

	public static void mMinLengthPasswordString_1() {

		System.out.println("Starting test --> " + new Object() {
		}.getClass().getEnclosingMethod().getName() + " - TEST");

		Help.setGCD();
		driver.get(testedUrl_loginPage);

		LoginPage loginPage = new LoginPage(driver);
		StartPage startPage = new StartPage(driver);
		ConfigPage configPage = new ConfigPage(driver);
		ConfigSettingsPage configSettingsPage = new ConfigSettingsPage(driver);

		loginPage.login(loginEmail, loginPassword, englishLang, englishNum);	
		startPage.approveLogin(gotItMark, requiredNameOfUser);
		startPage.clickConfigIcon();
		configPage.navigateToSettingsSection();
		configSettingsPage.scrollDown();
		configSettingsPage.set_0_inMinLngthPsswrdStr();
		configSettingsPage.clickSaveButton();
		configSettingsPage.verifyErrorMessagePresence();
		configSettingsPage.verifyErrorMessageContent();

		checkResult(1);
		driver.close();
	}
}
