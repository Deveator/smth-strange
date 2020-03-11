package passwordCases;

import general.Help;
import pages.ConfigPage;
import pages.ConfigSettingsPage;
import pages.LoginPage;
import pages.StartPage;

public class PasswordReqsPresence extends Help {

	// public static void main(String[] args) {

	public static void mPasswordReqsPresence() {

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
		configSettingsPage.verifyPresenceOfMinLengthString();
		configSettingsPage.verifyPresenceOfMaxLengthString();
		configSettingsPage.verifyPresenceOfLettersCheckbox();
		configSettingsPage.verifyPresenceOfDigitsCheckbox();
		configSettingsPage.verifyPresenceOfSpecialCharsCheckbox();
		configSettingsPage.verifyPresenceOfPasswordExpirationDDL();

		checkResult(1);
		driver.close();
	}
}
