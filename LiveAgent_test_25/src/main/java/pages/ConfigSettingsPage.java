package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import general.Help;

public class ConfigSettingsPage extends PageObject {

	private static String erMssg = "There were errors, please check highlighted fields";

	private static String info1 = "TestNO - couldn't scroll down";
	private static String info2 = "TestNO - absence of MIN LEGTH OF PASSWORD string";
	private static String info3 = "TestNO - absence of MAX LEGTH OF PASSWORD string";
	private static String info4 = "TestNO - absence of LETTERS checkbox";
	private static String info5 = "TestNO - absence of DIGITS checkbox";
	private static String info6 = "TestNO - absence of SPECIAL CHARS checkbox";
	private static String info7 = "TestNO - absence of PASSWORD EXPIRATION dropdown list";
	private static String info8 = "TestNO - couldn't set '0' in MIN LEGTH OF PASSWORD string";
	private static String info9 = "TestNO - couldn't click on 'SAVE' button";
	private static String info10 = "TestNO - couldn't verify presence of error message";
	private static String info11 = "TestNO - couldn't verify content of error message";
	private static String info12 = "TestNO - couldn't set '1' in MAX LENGTH OF PASSWORD string";
	private static String info13 = "TestNO - couldn't set '61' in MAX LENGTH OF PASSWORD string";
	private static String info14 = "TestNO - couldn't set required options";
	private static String info15 = "TestNO - couldn't click on 'Ticket filters' item";
	private static String info16 = "TestNO - couldn't click on 'Add filter' button";
	private static String info17 = "TestNO - couldn't type in 'Name' string";
	private static String info18 = "TestNO - couldn't click on 'Create' button";
	private static String info19 = "TestNO - ticket filter is not created";
	private static String info20 = "TestNO - couldn't click on 'Yes' button";
	private static String info21 = "TestNO - ticket filter is not delted";
	private static String info22 = "TestNO - could uncheck 'Available for' checkbox";
	private static String info23 = "TestNO - could click on 'add' button in 'Agents' cell";
	private static String info24 = "TestNO - could click on 'Agents' inputString";
	private static String info25 = "TestNO - could click on 'edit' button";
	private static String info26 = "TestNO - could click on 'close' button";
	private static String info27 = "TestNO - could click on 'refresh' icon";
	
	private static int val0 = 0;
	private static int val1 = 1;
	private static int val5 = 5;
	private static int val8 = 8;
	private static int val20 = 20;
	private static int val21 = 21;
	private static int val61 = 61;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement saveBttn;

	@FindBy(xpath = "//input[@name='password_min_len']")
	private WebElement minPsswrdLngthStr;

	@FindBy(xpath = "//input[@name='password_max_len']")
	private WebElement maxPsswrdLngthStr;

	@FindBy(xpath = "//body[@class='Lang-en-US']//div[@id='body']//div[@class='LayoutPanel VerticalLayoutPanel']//div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']//div[@class='Content FloatLeft']//div[@class='BasePanelViewImpl']//div[@class='LayoutPanel HorizontalLayoutPanel']//div[@class='ContentWrapper FloatLeft']//div[@class='ContentWrapperIn']//div[@class='DecoratedContentWidget']//div[@class='FormFieldset ContentPadding']//div[@class='FormFieldSeparator']//div//div[@class='PasswordRequirementsPanel']//div[3]//div[2]//div[1]//div[1]//div[1]")
	private WebElement lettersChckbx;

	@FindBy(xpath = "//body[@class='Lang-en-US']//div[@id='body']//div[@class='LayoutPanel VerticalLayoutPanel']//div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']//div[@class='Content FloatLeft']//div[@class='BasePanelViewImpl']//div[@class='LayoutPanel HorizontalLayoutPanel']//div[@class='ContentWrapper FloatLeft']//div[@class='ContentWrapperIn']//div[@class='DecoratedContentWidget']//div[@class='FormFieldset ContentPadding']//div[@class='FormFieldSeparator']//div//div[@class='PasswordRequirementsPanel']//div[4]//div[2]//div[1]//div[1]//div[1]")
	private WebElement digitsChckbx;

	@FindBy(xpath = "//body[@class='Lang-en-US']//div[@id='body']//div[@class='LayoutPanel VerticalLayoutPanel']//div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']//div[@class='Content FloatLeft']//div[@class='BasePanelViewImpl']//div[@class='LayoutPanel HorizontalLayoutPanel']//div[@class='ContentWrapper FloatLeft']//div[@class='ContentWrapperIn']//div[@class='DecoratedContentWidget']//div[@class='FormFieldset ContentPadding']//div[@class='FormFieldSeparator']//div//div[@class='PasswordRequirementsPanel']//div[5]//div[2]//div[1]//div[1]//div[1]")
	private WebElement spCharsChckbx;

	@FindBy(xpath = "//div[@class='g-ListBox']//input[@type='text']")
	private WebElement psswrdExpirationDDL;

	@FindBy(xpath = "//span[@class='FormMessageText']")
	private WebElement errorMssage;
	
	@FindBy(xpath = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Ticket filters')]")
	private WebElement ticketFiltersItem;
	
	@FindBy(xpath = "//span[contains(text(),'Add filter')]")
	private WebElement addFilterBttn;
	
	@FindBy(xpath = "//input[@class='TextBox']")
	private WebElement nameStr;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")
	private WebElement createBttn;
	
	@FindBy(xpath = "//div[@class='RefreshButton IconButton RefreshButtonPanel']")
	private WebElement sectionRefreshButton;
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yesBttn;
	
	@FindBy(css = "div[class*='ActionEdit']")
	private WebElement editBttn;
	
	@FindBy(css = "div[class*='CheckBox-checked']")
	private WebElement availableForChckbx;	
	
	@FindBy(css = "div[class = 'AvailabilityViewAgents']")
	private WebElement agentsCell;	
	
	@FindBy(xpath = "//div[@class='gwt-Label CloseLabel']")
	private WebElement closeBttn;	
	
	@FindBy(css = "div[class *= 'g-TableRow']")
	private List<WebElement> ticketFiltersList;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private List<WebElement> dltBttnList;
	
	@FindBy(css = "div[class *= 'AddFieldLabel']")
	private List<WebElement> addButtons;
	
	@FindBy(css = "div[class='g-ListBox']")
	private List<WebElement> listBox;
	
	@FindBy(xpath = "//input[@class='g-ListBoxInput']")
	private List<WebElement> stringsWithData;

	public ConfigSettingsPage(WebDriver dr) {
		super(dr);
	}
	
	public void verifyAgentListIsLoaded(String agentName, String agentName2) {
		waitTryClick(20, editBttn, info25);
		pause(1500);
		String val = stringsWithData.get(0).getAttribute("value");
		String val2 = stringsWithData.get(1).getAttribute("value");
		if(val.equals(agentName)||val.equals(agentName2)) {
			Help.result = 1;
		}else {
			Help.result = 0;
		}
		if(val2.equals(agentName)||val2.equals(agentName2)) {
			Help.result = 1;
		}else {
			Help.result = 0;
		}	
		waitTryClick(20,closeBttn,info26);
	}
	
	public void deleteCreatedTicketFilter(String vName) {
		
		for(int i = 0 ; i < ticketFiltersList.size(); i++) {			
			if(ticketFiltersList.get(i).getText().contains(vName)) {
				dltBttnList.get(i).click();
				waitTryClick(20, yesBttn, info20);
				break;
			}
		}
		
	}
	
	public void verifyTicketFilterIsCreated(String vName) {
		pause(1500);
		int g = 0;
		for(int i = 0 ; i < ticketFiltersList.size(); i++) {			
			if(ticketFiltersList.get(i).getText().contains(vName)) {
				g=1;
				break;
			}
		}
		if(g == 0) {
			errorInfo(info19);
		}
	}
	
	public void verifyTicketFilterIsDeleted(String vName) {
		pause(1500);
		waitTryClick(20,sectionRefreshButton,info27);
		pause(500);
		int g = 0;
		for(int i = 0 ; i < ticketFiltersList.size(); i++) {			
			if(ticketFiltersList.get(i).getText().contains(vName)) {
				g=1;
				break;
			}
		}
		if(g == 1) {
			errorInfo(info21);
		}
	}
	
	public void clickOnAddFilterButton() {
		waitTryClick(20, addFilterBttn, info16);
	}
	
	public void typeTicketFilterName(String vName) {
		waitTryType(20, nameStr, vName, info17);
	}
	
	public void uncheckAvailableFor() {
		waitTryClick(20, availableForChckbx, info22);
	}
	
	public void setSpecificAgents(String [] agentsList) {
		waitTryClick(20, addButtons.get(0), info23);
		waitTryClick(20, listBox.get(0), info24);
		pause(800);
		Actions action= new Actions(pageObjectDriver);
		action.sendKeys(agentsList[0]);
		action.build().perform();
		pause(1500);
		action.sendKeys(Keys.ARROW_DOWN);
		action.build().perform();
		pause(1500);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		waitTryClick(20, addButtons.get(0), info23);
		waitTryClick(20, listBox.get(1), info24);
		pause(800);
		action.sendKeys(agentsList[1]);
		action.build().perform();
		pause(1500);
		action.sendKeys(Keys.ARROW_DOWN);
		action.build().perform();
		pause(1500);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		waitTryClick(20, createBttn, info18);		
	
	}
	
	public void createTicketFilter(String vName) {
		waitTryClick(20, addFilterBttn, info16);
		waitTryType(20, nameStr, vName, info17);
		waitTryClick(20, createBttn, info18);		
	}

	public void clickOnTicketFiltersItem() {
		waitTryClick(20, ticketFiltersItem, info15);
	}
	
	public void set_0_inMinLngthPsswrdStr() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val0));
		} catch (Exception e) {
			errorInfo(info8);
		}
	}

	public void setRequireLetterInPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(400);
			maxPsswrdLngthStr.clear();
			pause(400);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val20));
			pause(400);
			checkLetterCheckbox();
			pause(400);
			uncheckDigitCheckbox();
			pause(400);
			uncheckSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void setRequireDigitInPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(400);
			maxPsswrdLngthStr.clear();
			pause(400);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val20));
			pause(400);
			uncheckLetterCheckbox();
			pause(400);
			checkDigitCheckbox();
			pause(400);
			uncheckSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void setRequireSpecCharsInPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(400);
			maxPsswrdLngthStr.clear();
			pause(400);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val20));
			pause(400);
			uncheckLetterCheckbox();
			pause(400);
			uncheckDigitCheckbox();
			pause(400);
			checkSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void set_8_InMaxLengthPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(900);
			maxPsswrdLngthStr.clear();
			pause(900);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val8));
			pause(400);
			uncheckLetterCheckbox();
			pause(400);
			uncheckDigitCheckbox();
			pause(400);
			uncheckSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void set_5_InMinLengthPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(900);
			maxPsswrdLngthStr.clear();
			pause(900);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val20));
			pause(400);
			uncheckLetterCheckbox();
			pause(400);
			uncheckDigitCheckbox();
			pause(400);
			uncheckSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void set_8_InMaxLengthAndCheckDigitAndSpCharsPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(900);
			maxPsswrdLngthStr.clear();
			pause(900);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val8));
			pause(400);
			uncheckLetterCheckbox();
			pause(400);
			checkDigitCheckbox();
			pause(400);
			checkSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void set_8_InMaxLengthAndCheckLetterAndSpCharsPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(900);
			maxPsswrdLngthStr.clear();
			pause(900);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val8));
			pause(400);
			checkLetterCheckbox();
			pause(400);
			uncheckDigitCheckbox();
			pause(400);
			checkSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}
	
	public void set_5_InMinLengthAndCheckLetterAndDigitPassword() {
		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val5));
			pause(900);
			maxPsswrdLngthStr.clear();
			pause(900);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val8));
			pause(400);
			checkLetterCheckbox();
			pause(400);
			checkDigitCheckbox();
			pause(400);
			uncheckSpecCharsCheckbox();
		} catch (Exception e) {
			errorInfo(info14);
		}
	}

	public void checkLetterCheckbox() {

		String lettersChckbxVal = lettersChckbx.getAttribute("aria-checked");
		if (lettersChckbxVal.equals("false")) {
			lettersChckbx.click();
		}
	}
	
	public void checkDigitCheckbox() {

		String digitsChckbxVal = digitsChckbx.getAttribute("aria-checked");
		if (digitsChckbxVal.equals("false")) {
			digitsChckbx.click();
		}
	}
	
	public void checkSpecCharsCheckbox() {

		String ChckbxVal = spCharsChckbx.getAttribute("aria-checked");
		if (ChckbxVal.equals("false")) {
			spCharsChckbx.click();
		}
	}
	
	public void uncheckLetterCheckbox() {

		String lettersChckbxVal = lettersChckbx.getAttribute("aria-checked");
		if (lettersChckbxVal.equals("true")) {
			lettersChckbx.click();
		}
	}
	
	public void uncheckDigitCheckbox() {

		String ChckbxVal = digitsChckbx.getAttribute("aria-checked");
		if (ChckbxVal.equals("true")) {
			digitsChckbx.click();
		}
	}
	
	public void uncheckSpecCharsCheckbox() {

		String ChckbxVal = spCharsChckbx.getAttribute("aria-checked");
		if (ChckbxVal.equals("true")) {
			spCharsChckbx.click();
		}
	}

	public void set_21_inMinLngthPsswrdStr() {

		try {
			pause(400);
			minPsswrdLngthStr.clear();
			pause(400);
			minPsswrdLngthStr.sendKeys(String.valueOf(val21));
		} catch (Exception e) {
			errorInfo(info8);
		}
	}

	public void set_1_inMaxLngthPsswrdStr() {
		try {
			pause(400);
			maxPsswrdLngthStr.clear();
			pause(400);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val1));
		} catch (Exception e) {
			errorInfo(info12);
		}
	}

	public void set_61_inMaxLngthPsswrdStr() {
		try {
			pause(400);
			maxPsswrdLngthStr.clear();
			pause(400);
			maxPsswrdLngthStr.sendKeys(String.valueOf(val61));
		} catch (Exception e) {
			errorInfo(info13);
		}
	}

	public void clickSaveButton() {
		try {
			saveBttn.click();
		} catch (Exception e) {
			errorInfo(info9);
		}

	}

	public void verifyErrorMessagePresence() {
		pause(400);
		if (!errorMssage.isDisplayed()) {
			errorInfo(info10);
		}
	}

	public void verifyErrorMessageContent() {
		pause(400);
		if (!errorMssage.getText().equals(erMssg)) {
			errorInfo(info11);
		}
	}

	public void scrollDown() {
		try {
			pause(400);
			scrollUpToWebelementViaJavaScript(saveBttn);
		} catch (Exception e) {
			errorInfo(info1);
		}
	}

	public void verifyPresenceOfMinLengthString() {

		if (!minPsswrdLngthStr.isDisplayed()) {
			errorInfo(info2);
		}
	}

	public void verifyPresenceOfMaxLengthString() {

		if (!maxPsswrdLngthStr.isDisplayed()) {
			errorInfo(info3);
		}
	}

	public void verifyPresenceOfLettersCheckbox() {

		if (!lettersChckbx.isDisplayed()) {
			errorInfo(info4);
		}
	}

	public void verifyPresenceOfDigitsCheckbox() {

		if (!digitsChckbx.isDisplayed()) {
			errorInfo(info5);
		}
	}

	public void verifyPresenceOfSpecialCharsCheckbox() {

		if (!spCharsChckbx.isDisplayed()) {
			errorInfo(info6);
		}
	}

	public void verifyPresenceOfPasswordExpirationDDL() {

		if (!psswrdExpirationDDL.isDisplayed()) {
			errorInfo(info7);
		}
	}

}
