package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ConfigPage extends PageObject {

	private static String info1 = "TestNO - couldn't navigate to 'Settings' section";
	private static String info2 = "TestNO - couldn't navigate to 'Mail outbox' section";
	private static String info3 = "TestNO - couldn't click on 'SLA' item";
	private static String info4 = "TestNO - couldn't click on 'Rules' item";
	private static String info5 = "TestNO - couldn't click on 'Rules' item";
	private static String info6 = "TestNO - couldn't click on 'Mail outbox' item";
	private static String info7 = "TestNO - couldn't click on first row fom 'Mail outbox'";
	private static String info8 = "TestNO - couldn't close window";
	private static String info9 = "TestNO - couldn't click on 'Audit log' item";
	private static String info10 = "TestNO - couldn't find 'IP' column";
	private static String info11 = "TestNO - couldn't click on 'Automation' button";
	private static String info12 = "TestNO - couldn't click on 'Time rules' button";
	private static String info13 = "TestNO - couldn't click on 'Tags' button";
	private static String info14 = "TestNO - couldn't click on 'Create' button";
	private static String info15 = "TestNO - couldn't type in 'Name' string";
	private static String info16 = "TestNO - couldn't click on 'System' item";
	private static String info17 = "TestNO - couldn't click on 'API' item";
	private static String info18 = "TestNO - couldn't click on 'Regenerate' button";
	private static String info19 = "TestNO - couldn't regenerate API key";
	private static String info20 = "TestNO -'Mail outbox' preview is not as required";
	private static String info21 = "TestNO - couldn't type tagValue in 'Search' string";
	private static String info22 = "TestNO - couldn't click on 'Search' button";
	private static String info23 = "TestNO - couldn't find required TAG";
	private static String info24 = "TestNO - couldn't click on 'Delete' button";
	private static String info25 = "TestNO - couldn't click on 'Yes' button";
	private static String info26 = "TestNO - couldn't click on 'Calls' item";
	private static String info27 = "TestNO - couldn't click on 'Canned message' item";
	private static String info28 = "TestNO - couldn't click on 'Agents' item";
	private static String info29 = "TestNO - couldn't click on 'General' item";
	private static String info30 = "TestNO - couldn't click on 'Save' button";
	private static String info31 = "TestNO - couldn't get actual theme";
	private static String info32 = "TestNO - couldn't click on public preset button";
	private static String info33 = "TestNO - couldn't click on 'modify' item";
	private static String info34 = "TestNO - filter is not preset";
	private static String info35 = "TestNO - is not checked required checkbox";
	private static String info36 = "TestNO - contact name is not updated";
	private static String info37 = "TestNO - contact name is not updated 2 ";
	private static String info38 = "TestNO - couldn't click on 'Email' item ";
	private static String info39 = "TestNO - couldn't click on 'Customer templates' item ";

	@FindBy(xpath = "//div[@class='gwt-Label MenuItemTitle'][contains(text(),'Departments')]")
	private WebElement dprtmntBttn;

	@FindBy(xpath = "//div[@class='gwt-Label MenuItemTitle'][contains(text(),'Call')]")
	private WebElement callItem;

	@FindBy(xpath = "//div[@class='SmallIcon AutomationSI']")
	private WebElement automationItm;

	@FindBy(xpath = "//div[@class='SmallIcon AgentsSI']")
	private WebElement agentsItm;

	@FindBy(xpath = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Canned messages')]")
	private WebElement cannedMssgItm;

	@FindBy(xpath = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Predefined answers')]")
	private WebElement predefndAnswrItm;

	@FindBy(xpath = "//div[@class='SmallIcon ProtectionSI']")
	private WebElement protectionItm;
	
	@FindBy(css = "div[title='Customer Templates']")
	private WebElement customerTemplatesItm;

	@FindBy(xpath = "//div[contains(text(),'System')]")
	private WebElement systemItm;

	@FindBy(xpath = "//div[contains(text(),'General')]")
	private WebElement generalItm;

	@FindBy(css = "div.SmallIcon.ProtectionConfigurationSI")
	private WebElement settingsItm;

	@FindBy(xpath = "//div[@class='SmallIcon ToolsSI']")
	private WebElement toolsItm;

	@FindBy(xpath = "//div[contains(text(),'Mail outbox')]")
	private WebElement mailOutboxItm;

	@FindBy(xpath = "//div[contains(text(),'SLA')]")
	private WebElement slaItm;

	@FindBy(xpath = "//div[@title='Rules']//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Rules')]")
	private WebElement rulesItm;
	
	@FindBy(css = ".MenuItemIcon.Email-Configuration")
	private WebElement emailItem;

	@FindBy(xpath = "//div[@title='View']//div[@class='buttonIcon']")
	private WebElement row1;

	@FindBy(xpath = "//div[@class='gwt-Label CloseLabel']")
	private WebElement closeBtn;

	@FindBy(xpath = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Audit log')]")
	private WebElement auditLogItm;

	@FindBy(xpath = "//div[@class='g-TableHeader dragdrop-dropTarget dragdrop-boundary']")
	private WebElement tblClmns;

	@FindBy(xpath = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Time Rules')]")
	private WebElement timeRulesBttn;

	@FindBy(xpath = "//div[contains(text(),'Tags')]")
	private WebElement tagsItem;

	@FindBy(xpath = "//span[contains(text(),'Create')]")
	private WebElement createBttn;

	@FindBy(name = "name")
	private WebElement nameStr;

	@FindBy(xpath = "//div[contains(text(),'API')]")
	private WebElement apiItem;

	@FindBy(xpath = "//div[2]/div/div/div/div[4]/div/div/div/div/div[2]/span")
	private WebElement fCreate;

	@FindBy(xpath = "//div[@class='ImLeButton ImLeButtonMainOut ActionButton ActionRegenerate']//div[@class='buttonIcon']")
	private WebElement regenerateBttn;

	@FindBy(css = "div[class='g-TableCell']")
	private List<WebElement> apiKey;

	@FindBy(xpath = "//body[@class='Lang-en-US']/div[@id='body']/div[@class='LayoutPanel VerticalLayoutPanel']/div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']/div[@class='Content FloatLeft']/div[@class='BasePanelViewImpl']/div[@class='LayoutPanel HorizontalLayoutPanel']/div[@class='ContentWrapper FloatLeft']/div[@class='ContentWrapperIn']/div[@class='DecoratedContentWidget']/div[@class='MailOutboxGrid Rows34']/div[@class='LayoutPanel VerticalLayoutPanel GridWithSearch']/div[@class='TablePanel']/div[@class='g-TablePanel']/div[@class='g-Table']/div/div[@class='g-TableBody ScrollPanel']/div/div[@class='g-TableContentPanel ContentPanel RowH35']/div[@class='g-TableDataPanel DataPanel']/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[1]/div[1]")
	private WebElement firstStrFromOutbox;

	@FindBy(xpath = "//div[@class='SearchBoxInputPanel']//input[@class='gwt-TextBox']")
	private WebElement searchTagsStr;

	@FindBy(xpath = "//span[contains(text(),'Search')]")
	private WebElement searchBttn;

	@FindBy(xpath = "//div[@class='g-Table']")
	private WebElement foundTagsTable;

	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private WebElement dltBttn;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yesBttn;

	@FindBy(xpath = "//div[@title ='Settings']")
	private List<WebElement> settingsList;

	@FindBy(css = "div[class='RadioButton2-Content']")
	private List<WebElement> themesList;

	@FindBy(css = "div[class='RadioButton2 RadioButton2-down']")
	private WebElement actualTheme;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement saveBttn;

	@FindBy(xpath = "//div[@class='PresetsPanel']//div[2]//div[2]")
	private WebElement firstPresetIcon;
	
	@FindBy(xpath = "//div[@class='PresetsPanel']//div[3]//div[2]")
	private WebElement secondPresetIcon;

	@FindBy(css = ".Icon16-modify")
	private WebElement modifyItem;

	@FindBy(css = "div[class*='optionSelected']")
	private List<WebElement> optionChckbxes;

	@FindBy(xpath = "//div[@class='PresetsPanel']/div/div")
	private List<WebElement> defaultFilers;
	
	@FindBy(xpath = "//div[@class='TemplateRow EmailTemplateSectionRow NotificationDisallowed']")
	private WebElement disableTemplate;
	
	@FindBy(xpath = "//div[@class='TemplateRow EmailTemplateSectionRow NotificationDisallowed']/div[1]/div/div[1]/div[2]/div[2]")
	private WebElement disableTemplateEnableButton;
	


	public ConfigPage(WebDriver dr) {
		super(dr);
	}

	public void verifyFilterIsConfigured() {

		String filter1 = defaultFilers.get(1).getText();
		clickOnFirstPresetOptions();
		clickOnModifyItem();
		verifyFilterPresetOptions(filter1);		
		closeWindow();		
		String filter2 = defaultFilers.get(2).getText();
		clickOnSecondPresetOptions();
		clickOnModifyItem();
		verifyFilterPresetOptions(filter2);		
		closeWindow();
	}

	public void verifyFilterPresetOptions(String filterName) {

		if (optionChckbxes.size() != 1) {
			errorInfo(info34);
		}
		
		if(!optionChckbxes.get(0).getText().equals(filterName)) {
			errorInfo(info35);
		}

	}

	public void clickOnFirstPresetOptions() {
		waitTryClick(20, firstPresetIcon, info32);
	}
	
	public void clickOnSecondPresetOptions() {
		waitTryClick(20, secondPresetIcon, info32);
	}

	public void clickOnModifyItem() {
		waitTryClick(20, modifyItem, info33);
	}

	public void setRequiredTheme(String reqTheme) {
		waitForDisplay(20, actualTheme, info31);
		if (!actualTheme.getText().equals(reqTheme)) {
			for (int i = 0; i < themesList.size(); i++) {
				String themeVal = themesList.get(i).getText();
				if (themeVal.equals(reqTheme)) {
					themesList.get(i).click();
					i = themesList.size();
				}
			}
			pause(500);
			scrollUpToWebelementViaJavaScript(saveBttn);
			waitTryClick(40, saveBttn, info30);
		} else {
			refreshWebPage();
		}
	}

	public void verifyTagIsFound(String vTag) {
		pause(1500);
		if (!foundTagsTable.getText().contains(vTag)) {
			errorInfo(info23);
		}
	}

	public void deleteTag(String vTag) {
		waitTryType(20, searchTagsStr, vTag, info21);
		waitTryClick(20, searchBttn, info22);
		verifyTagIsFound(vTag);
		waitTryClick(20, dltBttn, info24);
		waitTryClick(20, yesBttn, info25);
		pause(1500);
	}

	public void verifyPreviewInfo(String vMain, String vCc, String vBcc) {
		pause(1500);
		String actV = firstStrFromOutbox.getText();
		if (!actV.contains(vMain)) {
			errorInfo(info20);
		}
		if (!actV.contains(vCc)) {
			errorInfo(info20);
		}
		if (!actV.contains(vBcc)) {
			errorInfo(info20);
		}
	}

	public void verifyApiKeyIsRegerated(String vOLdApi, String regApiKey) {
		pause(4000);
		if (regApiKey.equals(vOLdApi)) {
			errorInfo(info19);
		}
	}

	public void regenerateApiKey() {
		waitTryClick(20, regenerateBttn, info18);
	}

	public String getApiKey() {
		pause(4000);
		return apiKey.get(2).getText().trim();
	}

	public void createTag(String vTag) {
		try {
			waitTryClick(200, createBttn, info14);
		} catch (Exception e) {
			waitTryClick(200, createBttn, info14);
		}
		waitTryType(200, nameStr, vTag, info15);
		Actions action = new Actions(pageObjectDriver);
		for (int i = 0; i < 6; i++) {
			action.sendKeys(Keys.TAB);
		}
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		pause(800);
	}

	public void createPublicTag(String vTag) {
		try {
			waitTryClick(200, createBttn, info14);
		} catch (Exception e) {
			waitTryClick(200, createBttn, info14);
		}
		waitTryType(200, nameStr, vTag, info15);
		Actions action = new Actions(pageObjectDriver);
		for (int i = 0; i < 5; i++) {
			action.sendKeys(Keys.TAB);
			pause(150);
		}
		action.sendKeys(Keys.ENTER);
		pause(150);
		action.sendKeys(Keys.TAB);
		pause(150);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}

	public void selectTimeRules() {
		waitTryClick(20, timeRulesBttn, info12);
	}

	public void selectTags() {
		waitTryClick(20, tagsItem, info13);
	}

	public void verifyPresenceOfIPcolumn(String vIP) {
		try {
			pause(600);
			if (!tblClmns.getText().contains(vIP)) {
				errorInfo(info10);
			}
		} catch (Exception e) {
			errorInfo(info10);
		}
	}

	public void closeWindow() {
		try {
			pause(600);
			clickViaJavaScript(closeBtn);

		} catch (Exception e) {
			errorInfo(info8);
		}
	}

	public void clickOnRowWithLink() {
		try {
			pause(2600);
			row1.click();
			pause(2600);
		} catch (Exception e) {
			errorInfo(info7);
		}
	}
	
	public void verifyCustomersNameIsUpdated(String transcriptContent,String oldName, String newName) {
		
		pause(800);
		if(transcriptContent.contains(oldName)) {
			errorInfo(info36);
		}
		if(!transcriptContent.contains(newName)) {
			errorInfo(info37);
		}
	}

	public void clickOnRulesItem() {

		waitTryClick(20, rulesItm, info4);
	}

	public void clickOnAuditLogItem() {
		try {
			pause(600);
			auditLogItm.click();
		} catch (Exception e) {
			errorInfo(info9);
		}
	}

	public void clickOnToolsItem() {
		try {
			pause(600);
			toolsItm.click();
		} catch (Exception e) {
			errorInfo(info5);
		}
	}

	public void clickOnMailOutboxItem() {
		try {
			pause(600);
			mailOutboxItm.click();
		} catch (Exception e) {
			errorInfo(info6);
		}
	}

	public ConfigPage clickDprtmntBttn() {
		pause(800);
		dprtmntBttn.click();
		return new ConfigPage(pageObjectDriver);
	}

	public void clickOnSLAitem() {
		try {
			pause(600);
			slaItm.click();
		} catch (Exception e) {
			errorInfo(info3);
		}
	}

	public void navigateToMailOutbox() {
		try {
			pause(400);
			toolsItm.click();
			pause(400);
			mailOutboxItm.click();
		} catch (Exception e) {
			errorInfo(info2);
		}

	}

	public void navigateToSettingsSection() {
		pause(400);
		try {
			protectionItm.click();
			pause(1000);
			settingsList.get(1).click();
		} catch (Exception e) {

			errorInfo(info1);
		}
	}

	public void clickCallItem() {
		waitTryClick(20, callItem, info26);
	}

	public void clickGeneralItem() {
		waitTryClick(20, generalItm, info29);
	}

	public void clickAgentsItem() {
		waitTryClick(20, agentsItm, info28);
	}

	public void clickSystemItem() {
		waitTryClick(20, systemItm, info16);
	}

	public void clickApiItem() {
		waitTryClick(20, apiItem, info17);
	}

	public void navigateToApiItem() {
		clickSystemItem();
		clickApiItem();
	}

	public void clickAutomationItem() {
		waitTryClick(20, automationItm, info11);
	}

	public void clickCannedMessagesItem() {
		waitTryClick(20, cannedMssgItm, info27);
	}

	public void clickPredefinedAnswerItem() {
		pause(800);
		try {
			predefndAnswrItm.click();
		} catch (Exception e) {

		}
	}

	public void clickOnEmailItem() {
		waitTryClick(20, emailItem,info38);
	}
	
	public void clickOnCustomerTemplatesItem() {
		waitTryClick(20, customerTemplatesItm,info39);
	}
	
	public void verifyResolveTemplateIsEnabled() {
		pause(800);
		try {
			if(disableTemplate.isEnabled()) {
				disableTemplateEnableButton.click();
			}
		} catch (Exception e) {
			
		}
		
	}
	
	
	
	
	
	
	
	
}
