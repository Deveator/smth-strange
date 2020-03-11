package general;

import pages.LoginPage;
import pages.StartPage;

public class LoginLogout extends Help{

	public static void mLoginLogout() {
		
		//public static void main(String[] args) {
		
		System.out.println("Starting test --> " + new Object() {
		}.getClass().getEnclosingMethod().getName() + " - TEST");

		// Set GoogleChrome Driver
		Help.setGCD();

		driver.get(testedUrl_loginPage);

		LoginPage loginPage = new LoginPage(driver);		
		StartPage startPage = new StartPage(driver);
		
		loginPage.login(loginEmail, loginPassword, englishLang, englishNum);	
		startPage.approveLogin(gotItMark, requiredNameOfUser);
		startPage.logout();
		loginPage.approveLogout(requiredNameOfUser);		

		checkResult(1);
		driver.close();
		

	}

}
