package general;

import pages.LoginPage;
import pages.StartPage;

public class ChangeLanguage extends Help{

//	public static void main(String[] args) {
		
		public static void mChangeLanguage() {
		
		System.out.println("Starting test --> " + new Object() {
		}.getClass().getEnclosingMethod().getName() + " - TEST");

		// Set GoogleChrome Driver
		Help.setGCD();		
		
		driver.get(testedUrl_loginPage);
		
		LoginPage loginPage = new LoginPage(driver);
		StartPage startPage = new StartPage(driver);
		
		loginPage.typeUsername(loginEmail).typePassword(loginPassword).setLang("Slovak").clickLoginBttn();			
		startPage.approveLogin(gotItMark, requiredNameOfUser);
		startPage.approveSlovenianLanguage(slvenMark);
		
		checkResult(1);
		driver.close();	

	}

}
