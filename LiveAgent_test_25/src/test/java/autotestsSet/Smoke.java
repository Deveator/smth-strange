package autotestsSet;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import general.ChangeLanguage;
import general.LoginLogout;

public class Smoke {
	
		@Test(priority = 0,groups= {"smoke"})
		public void LoginLogout_Test() {
		//	LoginLogout.mLoginLogout();
			System.out.println("Smoke 1");
		}
		
		@Test(priority = 2)
		public void ChangeLanguage_Test() {
		//	ChangeLanguage.mChangeLanguage();
			System.out.println("Smoke 2");
		}
		
		@BeforeMethod
		public void Before_Test() {
		//	ChangeLanguage.mChangeLanguage();
			System.out.println("Set prerequisetes Before_Method");
		}
		
		@BeforeSuite
		public void Before_Test2() {
		//	ChangeLanguage.mChangeLanguage();
			System.out.println("BeforeSuite is set");
		}
		
		@AfterSuite
		public void After_Test2() {
		//	ChangeLanguage.mChangeLanguage();
			System.out.println("AfterSuite is set");
		}
		
		@DataProvider
		public void getData() {
			 
		}
		

}
