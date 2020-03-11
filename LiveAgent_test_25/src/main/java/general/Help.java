package general;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Help {

	public static WebDriver driver;
	public static WebDriver driver_2;

	public static WebDriverWait wait;
	public static WebDriverWait wait_2;

	public static String nameOfUser;
	public static String statusInTicketbody;
	public static String receivedMail;

	public static String requiredNameOfUser = "aTim";
	public static String successMessDelButt = "Mass action completed with 0 errors";
	public static String emptyMessage = "No results match your filter. Try broadening the search criteria.";
	public static String devicesSectionDescriptrion = "Devices listed on this screen represent your VoIP/hardware devices or your software phone applications. You need to create a device here in order to obtain the credentials which will allow you to connect your actual devices with LiveAgent.";

	public static int result = 0;
	public static int gotItMark = 0;
	public static int waitMark = 0;
	public static int endCount = 0;
	public static boolean multKB = false;
	public static boolean langIsFound = false;
	public static int englishNum = 1;
	public static String[] applyWhenList_En = { "agent left ticket", "agent opened ticket", "agent rated",
			"chat started", "incoming call started", "message added", "message group added",
			"outbox mail status changed", "queue length changed", "ticket created from email", "ticket created",
			"ticket relation created", "ticket status changed", "ticket tags changed", "ticket transfered" };

	public static String[] performActionList_En = { "add custom field value", "add note", "add tag",
			"change requester's groups", "change SLA level", "change ticket priority", "change ticket subject",
			"delete custom field values", "delete ticket", "HTTP request", "mark as answered", "mark as not spam",
			"mark as spam", "merge into", "modify ticket recipient", "postpone ticket",
			"purge ticket and stop rules execution", "remove tag", "reopen ticket", "resolve ticket", "send answer",
			"send mail", "send notification", "send Slack message", "stop other rules", "transfer ticket",
			"undelete ticket" };

	public static String[] conditionList_En = { "action initiator", "action initiator's role", "assigned agent status",
			"context variable", "created from contact widget", "current date", "current day", "current time",
			"custom field", "customer group", "IP of visitor", "last message", "requested by", "requester company is",
			"requester is from", "ticket assigned", "ticket changed", "ticket created", "ticket deleted",
			"ticket department", "ticket priority", "ticket SLA level", "ticket source", "ticket start referrer URL",
			"ticket status", "ticket subject", "ticket tags", "agent rating type", "ticket tag", "new status",
			"old status" };

	public static String[] massActionList_En = { "add custom field value", "add note", "add tag",
			"change requester's groups", "change SLA level", "change ticket priority", "change ticket subject",
			"delete custom field values", "delete ticket", "HTTP request", "mark as answered", "mark as not spam",
			"mark as spam", "merge into", "modify ticket recipient", "postpone ticket",
			"purge ticket and stop rules execution", "remove tag", "reopen ticket", "resolve ticket", "send answer",
			"send mail", "send notification", "send Slack message", "transfer ticket", "undelete ticket" };

	public static DesiredCapabilities capabilities;

	public static String accountName = "test-5-18-9";
	// public static String accountName = "test-5-16-32-2";
	public static String loginEmail = "atimoshenko@qualityunit.com";
	// public static String loginEmail = "andrejtimo6enko@gmail.com";
	public static String loginPassword = "123456z+";
	// public static String loginPassword = "OEcuxxvO";

	public static String supportLAemail = "support@mail." + accountName + ".ladesk.com";
	public static String testedUrl_loginPage = "https://" + accountName + ".ladesk.com/agent/index.php#login;";
	public static String testedUrl_KBPage = "https://" + accountName + ".ladesk.com/";
	public static String testedApiPage = testedUrl_KBPage + "docs/api/v3";

	public static String signinGmailPage3 = "https://www.google.com/intl/uk/gmail/about/";
	public static String signinGmailPage2 = "https://www.google.com/intl/us/gmail/about/";
	public static String signinGmailPage = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	public static String newStatus = "NEW";
	public static String resolvedStatus = "RESOLVED";
	public static String answeredStatus = "ANSWERED";
	public static String slvenMark = "vytvori";
	public static String chatHello = "Hello";
	public static String answerVal = "Answer";
	public static String englishLang = "English";

	public static String mainEmail = "draftcustomer@gmail.com";
	public static String bccEmail = "draftagent.1@gmail.com";
	public static String ccEmail = "draftagent.2@gmail.com";
	public static String strongPassword = "123z+456";
	public static String contentVal = "draftContent";
	public static String contentSubject = "draftsubject";
	public static String knowledgebase = "Knowledgebase";
	public static String keywords = "Keywords";
	public static String reply = "REPLY !!!!";
	public static String logError = "TestNO - Agent couldn't log in correctly";

	private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	private static final String DIGITS = "0123456789";
	private static final SecureRandom RANDOM = new SecureRandom();

	public static void setGCD() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/drivers/googledriver/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void setGCD_2() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/drivers/googledriver/chromedriver.exe");
		driver_2 = new ChromeDriver();
		wait_2 = new WebDriverWait(driver_2, 20);
		driver_2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver_2.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver_2.manage().window().maximize();

	}

	public static String generateString(int count) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < count; ++i) {
			sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		return sb.toString();
	}

	public static void checkResult(int i) {

		if (i == 1) {
			System.out.println("TestOK");
		} else {
			System.out.println("TestNO");
		}
	}

}
