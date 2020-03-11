package autotestsSet;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import general.ChangeLanguage;
import general.LoginLogout;

public class CriticalPath {
	
	@Test(priority = 0)
	public void LoginLogout_Test() {
	//	LoginLogout.mLoginLogout();
		System.out.println("Critical path 1");
	}
	
	@Parameters({"userPsswrd"})
	@Test(priority = 2,groups= {"smoke"})
	public void ChangeLanguage_Test(String uPsswrd) {
	//	ChangeLanguage.mChangeLanguage();
		System.out.println("Critical path 2");
		System.out.println(uPsswrd);
	}
	
	@Test(priority = 4)
	public void ChangeLanguage_1_Test() {
	//	ChangeLanguage.mChangeLanguage();
		System.out.println("Critical path 3");
	}
	@Test(priority = 5,groups= {"smoke"})
	public void ChangeLanguage_2_Test() {
	//	ChangeLanguage.mChangeLanguage();
		System.out.println("Critical path 4");
	}

}
