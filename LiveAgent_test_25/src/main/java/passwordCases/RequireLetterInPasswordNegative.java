package passwordCases;

import general.Help;
import pages.AgentsPage;
import pages.ConfigMailOutboxPage;
import pages.ConfigPage;
import pages.ConfigSettingsPage;
import pages.LoginPage;
import pages.SetNewPassword4NewAgentPage;
import pages.StartPage;

public class RequireLetterInPasswordNegative extends Help{
	
	private static String agentName = "JJ" + generateString(5);
	private static String agentEmail = agentName + "@ml.im";
	private static String setPasswdLink;
	private static String negativePsswrd = "12345";

	//public static void main(String[] args) {
	public static void mRequireLetterInPasswordNegative() {

		System.out.println("Starting test --> " + new Object() {
		}.getClass().getEnclosingMethod().getName() + " - TEST");

		Help.setGCD();
		driver.get(testedUrl_loginPage);

		LoginPage loginPage = new LoginPage(driver);
		StartPage startPage = new StartPage(driver);
		ConfigPage configPage = new ConfigPage(driver);
		ConfigSettingsPage configSettingsPage = new ConfigSettingsPage(driver);
		AgentsPage agentsPage = new AgentsPage(driver);
		ConfigMailOutboxPage configMailOutboxPage = new ConfigMailOutboxPage(driver);
		SetNewPassword4NewAgentPage setNewPassword4NewAgentPage = new SetNewPassword4NewAgentPage(driver);

		loginPage.login(loginEmail, loginPassword, englishLang, englishNum);	
		startPage.approveLogin(gotItMark, requiredNameOfUser);
		startPage.clickConfigIcon();
		configPage.navigateToSettingsSection();
		configSettingsPage.scrollDown();
		configSettingsPage.setRequireLetterInPassword();
		configSettingsPage.clickSaveButton();
		configPage.clickAgentsItem();
		agentsPage.createNewAgent(agentName);
		agentsPage.verifyCreatedAgentIsInAgentsList(agentName);
		configPage.navigateToMailOutbox();
		setPasswdLink = configMailOutboxPage.getLinkToCreatePassword();
		driver.navigate().refresh();// need to refresh for switch to general frame
		startPage.logout();
		loginPage.approveLogout(requiredNameOfUser);
		driver.get(setPasswdLink);
		setNewPassword4NewAgentPage.createPassword4NewAgent(negativePsswrd);
		setNewPassword4NewAgentPage.verifyPresenceOfErrorMessage();
		driver.get(testedUrl_loginPage);
		loginPage.login(loginEmail, loginPassword, englishLang, englishNum);	
		startPage.approveLogin(gotItMark, requiredNameOfUser);
		startPage.clickConfigIcon();
		configPage.clickAgentsItem();
		agentsPage.deleteCreatedAgent(agentEmail);
		agentsPage.verifyAgentAbsenceAgentsList(agentName);

		checkResult(1);
		driver.close();
	}
}

