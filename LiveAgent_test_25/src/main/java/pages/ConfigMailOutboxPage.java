package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ConfigMailOutboxPage extends PageObject {
	
	
	private static String info1 = "TestNO - template content is not as required";

	private static String splitMark = "browser:";

	@FindBy(xpath = "//div[@title='View']//div[@class='buttonIcon']")
	private WebElement firstItmInTable;

	@FindAll({ @FindBy(tagName = "iframe") })
	private List<WebElement> iFrames;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]")
	private WebElement fullMailContent;

	@FindBy(xpath = "//div[@class='gwt-Label CloseLabel']")
	private WebElement closeWndw;
	
	@FindBy(xpath = "//body")
	private WebElement mailTextContent;


	public ConfigMailOutboxPage(WebDriver dr) {
		super(dr);
	}

	public String getLinkToCreatePassword() {

		pause(1000);
		firstItmInTable.click();
		pause(3000);
		String d2 = iFrames.get(5).getAttribute("name");
		pageObjectDriver.switchTo().frame(d2);
		String s1 = fullMailContent.getText();
		String[] parts = s1.split(splitMark);
		String st2 = parts[1];
		return st2;
	}
	
	public void verifyMailContent(String val) {
		pause(1000);
		firstItmInTable.click();
		pause(3000);
		String d2 = iFrames.get(5).getAttribute("name");
		pageObjectDriver.switchTo().frame(d2);
		String s1 = mailTextContent.getText().trim();
		if(!s1.equalsIgnoreCase(val)) {
			errorInfo(info1);
		}
		
		
	}
	
	public void closeDialogWindow() {
		
		closeWndw.click();
	}

}
