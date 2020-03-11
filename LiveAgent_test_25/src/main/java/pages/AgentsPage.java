package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class AgentsPage extends PageObject {

	private static String info1 = "TestNO - couldn't create agent";
	private static String info2 = "TestNO - couldn't verify that agent is created";
	private static String info3 = "TestNO - couldn't delete agent";
	private static String info4 = "TestNO - couldn't verify that agent is deleted";
	private static String info5 = "TestNO - couldn't click on 'Add all' button";
	private static String info6 = "TestNO - couldn't click on 'Department' item";
	private static String info7 = "TestNO - couldn't uncheck 'Allow change status'";
	private static String info8 = "TestNO - couldn't click on 'Save' button'";
	private static String info9 = "TestNO - couldn't click on 'Personal details' item";
	private static String info10 = "TestNO - couldn't select 'Admin' button";
	private static String info11 = "TestNO - couldn't close window";
	private static String info12 = "TestNO - couldn't click on 'Clone' button";
	private static String info13 = "TestNO - couldn't type Agent name";
	private static String info14 = "TestNO - couldn't type Agent email";
	private static String info15 = "TestNO - ticket service checkbox status is not as required";
	private static String info16 = "TestNO - chats service checkbox status is not as required";
	private static String info17 = "TestNO - calls service checkbox status is not as required";
	private static String info18 = "TestNO - couldn't uncheck chat service checkbox";
	private static String info19 = "TestNO - couldn't click on 'Edit' button";
	private static String info20 = "TestNO - couldn't locate 'Agents' table";
	private static String info21 = "TestNO - couldn't select 'Confirm' button";
	private static String info22 = "TestNO - couldn't click on 'Email notification' item";
	private static String info23 = "TestNO - couldn't click on required 'Email notification' option";
	private static String info24 = "TestNO - couldn't click on 'Remove all' button";
	private static String info25 = "TestNO - couldn't click on 'Assign to' string";
	private static String info26 = "TestNO - couldn't click on 'Delete agent' button";

	@FindBy(xpath = "//div[@class='g-DisplayingLabel FloatLeft']")
	private WebElement strWithNumOfAgents;

	@FindBy(xpath = "//span[contains(text(),'Create agent')]")
	private WebElement createAgntBttn;

	@FindBy(xpath = "//div[@class='ImLeButton ImLeButtonMainOut GreenButton']//span[@class='buttonText'][contains(text(),'Create')]")
	private WebElement createBttn;

	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement agentNameStr;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement agentEmailStr;

	@FindBy(xpath = "//div[@class='gwt-Label CloseLabel']")
	private WebElement closeWndwBttn;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Odd']//div[@class='ImLeButton ImLeButtonMainOut ActionButton ActionDelete']//div[@class='buttonIcon']")
	private WebElement dltAgent1;

	@FindAll({@FindBy(xpath = "//span[contains(text(),'Delete agent')]"), 
		@FindBy(xpath = "//span[contains(text(),'Yes')]")})
	private WebElement yesBttn;

	@FindAll({ @FindBy(xpath = "//div[@class='RowBoxesWithImage Agents VerticalLayoutPanel']"),
			@FindBy(xpath = "//body[@class='Lang-en-US']/div[@id='body']/div[@class='LayoutPanel VerticalLayoutPanel']/div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']/div[@class='Content FloatLeft']/div[@class='BasePanelViewImpl']/div[@class='LayoutPanel HorizontalLayoutPanel']/div[@class='ContentWrapper FloatLeft']/div[@class='ContentWrapperIn']/div[@class='DecoratedContentWidget']/div[@class='LayoutPanel VerticalLayoutPanel']/div[@class='LayoutPanel VerticalLayoutPanel GridWithSearch Rows39 AgentsGrid']/div[@class='TablePanel']/div[@class='g-TablePanel']/div[@class='g-Table']/div[2]") })
	private WebElement agentsList;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Even FloatLeft g-TableRow-focused']//span[@class='buttonText'][contains(text(),'Delete')]")
	private WebElement dltAgent2;

	@FindBy(css = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.RowBoxesWithImage.Agents.VerticalLayoutPanel div.LayoutPanel.VerticalLayoutPanel.GridWithSearch.SimpleColumnTable.RowH96 div.TablePanel div.g-TablePanel div.TableBodyPanel:nth-child(2) div.g-Table:nth-child(1) div.g-TableRow.g-TableRow-Even.FloatLeft.g-TableRow-focused:nth-child(1) div.g-TableCell div.HiddenDiv div.AgentCellPanel div.AgentViewWidget.AgentsGridItem.AgentWidget div.UserInfo > div.gwt-Label.UserName:nth-child(1)")
	private WebElement agent1name;

	@FindBy(xpath = "//div[@class='MenuItemView']//div[@class='SmallIcon DepartmentsSI']")
	private WebElement dptmntItem;

	@FindBy(xpath = "//div[@class='SmallIcon AgentSI']")
	private WebElement prsnlDtlsItem;

	@FindBy(xpath = "//div[@class='CheckBox CheckBox-checked']")
	private WebElement changeStatusChckbx;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement saveBttn;

	@FindBy(xpath = "//span[contains(text(),'Clone')]")
	private WebElement cloneBttn;

	@FindBy(xpath = "//div[@class='RadioButtonGroup RadioButtonGroup-vertical RadioButtonGroup-mandatory']//div[@class='RadioButton']//div//div[@class='RadioButtonIcon']")
	private WebElement adminRdbttn;

	@FindBy(xpath = "//div[@class='SmallIcon TicketsSI']")
	private WebElement tcktsItem;

	@FindBy(css = "div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.LayoutPanel.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContentScrolled div.FormFieldset div.SimpleAgentDepartmentsForm div.DeviceWidgetsPanel div.DeviceWidget div.DeviceHeader:nth-child(1) div.DeviceHeaderInfo div.CheckBoxContainer.DeviceStatusCheckBox > div.CheckBox.CheckBox-checked")
	private WebElement tcktsSrvcChckbx;

	@FindBy(xpath = "//div[@class='MenuItemView']//div[@class='SmallIcon ChatSI']")
	private WebElement chtsItem;

	@FindBy(css = "div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.LayoutPanel.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContentScrolled div.FormFieldset div.SimpleAgentDepartmentsForm div.DeviceWidgetsPanel div.DeviceWidget div.DeviceHeader:nth-child(1) div.DeviceHeaderInfo div.CheckBoxContainer.DeviceStatusCheckBox > div.CheckBox.CheckBox-checked")
	private WebElement chtsSrvcChckbx;

	@FindBy(xpath = "//div[@class='MenuItemView']//div[@class='SmallIcon CallSI']")
	private WebElement cllsItem;

	@FindBy(css = "div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.LayoutPanel.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContentScrolled div.FormFieldset div.SimpleAgentDepartmentsForm div.DeviceWidgetsPanel div.DeviceWidget div.DeviceHeader:nth-child(1) div.DeviceHeaderInfo div.CheckBoxContainer.DeviceStatusCheckBox > div.CheckBox.CheckBox-checked")
	private WebElement cllsSrvcChckbx;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Odd']//div[@class='ImLeButton ImLeButtonMainOut ActionButton ActionEdit']//div[@class='buttonIcon']")
	private WebElement secondAgntEditBttn;

	@FindBy(xpath = "//div[@class='g-TableDataPanel DataPanel']/div")
	private List<WebElement> agentsTbl;
	
	@FindBy(css = "tbody")
	private List<WebElement> agentsTbl2;

	@FindBy(css = "div.DialogPanel.ConfirmDialog")
	private WebElement undltAgentConfDlg;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement confirmBttn;

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private List<WebElement> editBttnList;

	@FindBy(css = "div.gwt-Label.UserName")
	private List<WebElement> agentsList2;
	
	@FindBy(xpath = "//div[contains(text(),'Add all')]")
	private WebElement addAll;
	
	@FindBy(xpath = "//div[contains(text(),'Remove all')]")
	private WebElement removeAll;
	
	@FindBy(xpath = "//div[contains(text(),'Notifications')]")
	private WebElement emailNotificationItem;
	
	@FindBy(css = "div.CheckBox")
	private List<WebElement> emailNotificationOptions;
	
	@FindBy(css = "div.AddActionIcon")
	private List<WebElement> addIconList;
	
	@FindBy(css = "div.gwt-Label.DepartmentNameLabel")
	private List<WebElement> dprtmntsList;
	
	@FindBy(css = "div.g-MenuIcon")
	private List<WebElement> clmnsList;

	@FindBy(css = "tr")
	private List<WebElement> agentsRows;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	private List<WebElement> dltAgentsBttn;
	
	@FindBy(xpath = "//span[contains(text(),'Delete agent')]")
	private WebElement deleteAgentsBttn;
	
	@FindBy(xpath = "//input[@class='g-ListBoxInput']")
	private WebElement assignToStr;
	
	public AgentsPage(WebDriver dr) {
		super(dr);
	}
	
	public void reassignRuleToSpecificAgent(String aName) {
		waitTryClick(20, assignToStr, info25);
		Actions action = new Actions(pageObjectDriver);
		action.sendKeys(aName);
		action.build().perform();
		pause(300);
		action.sendKeys(Keys.RIGHT);
		action.build().perform();
		pause(300);
		action.sendKeys(Keys.DOWN);
		action.build().perform();
		pause(300);
		action.sendKeys(Keys.UP);
		action.build().perform();
		pause(300);
		action.sendKeys(Keys.UP);
		action.build().perform();
		pause(300);
		action.sendKeys(Keys.ENTER);
		action.build().perform();		
	}
	
	public void deleteAgentAfterReassign() {
		waitTryClick(20, deleteAgentsBttn, info26);
	}
	
	public void clickOnDeleteSpecificAgent(String rName) {
		pause(1000);
		for(int i = 0; i < agentsRows.size(); i++) {
			if(agentsRows.get(i).getText().contains(rName)) {
				dltAgentsBttn.get(i).click();
				break;
			}
		}
	}
	
	public void addAgentToRequiredDepartment(String vDprt) {		
		pause(800);
		for(int i = 0; i < dprtmntsList.size(); i++) {
			if(dprtmntsList.get(i).getText().trim().equals(vDprt)) {
				addIconList.get(i+1).click();
			}
		}				
	}

	public void dissallowAgentChangeStatusInDprtmns() {
		
		///waitTryClick(20, secondAgntEditBttn, info19);
		waitTryClick(20, dptmntItem, info6);
		waitTryClick(20, changeStatusChckbx, info7);
		waitTryClick(20, saveBttn, info8);
		waitTryClick(20, closeWndwBttn, info11);
	}

	public void selectEmailNotificationItem() {
		waitTryClick(20, emailNotificationItem, info22);
	}
	
	public void checkRequiredEmailNotificationOption( int i) {
		waitTryClick(20, emailNotificationOptions.get(i), info23);
		waitTryClick(20, saveBttn, info8);
	}
	
	public void unCheckChatService() {
		try {
			pause(600);
			chtsSrvcChckbx.click();
		} catch (Exception e) {
			errorInfo(info18);
		}
	}

	public void verifyCallsServiceStatus() {
		try {
			pause(1000);
			cllsItem.click();
			if (!cllsSrvcChckbx.getAttribute("aria-checked").equals("true")) {
				errorInfo(info17);
			}
		} catch (Exception e) {
			errorInfo(info17);
		}
	}

	public void verifyTicketServiceStatus() {
		try {
			pause(1500);
			tcktsItem.click();
			if (!tcktsSrvcChckbx.getAttribute("aria-checked").equals("true")) {
				errorInfo(info15);
			}
		} catch (Exception e) {
			errorInfo(info15);
		}
	}

	public void verifyChatsServiceStatus() {
		try {
			pause(1000);
			chtsItem.click();
			if (!chtsSrvcChckbx.getAttribute("aria-checked").equals("true")) {
				errorInfo(info16);
			}
		} catch (Exception e) {
			errorInfo(info16);
		}
	}

	public void verifyChatsServiceStatusUncheck() {
		try {
			pause(1000);
			if (!chtsSrvcChckbx.getAttribute("aria-checked").equals("false")) {
				errorInfo(info16);
			}
		} catch (Exception e) {
			errorInfo(info16);
		}
	}

	public void saveCreatedAgent() {
		try {
			pause(600);
			createBttn.click();
		} catch (Exception e) {
			errorInfo(info1);
		}
	}

	public void clickOncloneButton() {
		try {
			pause(600);
			cloneBttn.click();
		} catch (Exception e) {
			errorInfo(info12);
		}
	}

	public void typeAgentName(String vName) {
		try {
			pause(600);
			agentNameStr.clear();
			pause(150);
			agentNameStr.sendKeys(vName);
		} catch (Exception e) {
			errorInfo(info13);
		}
	}

	public void typeEmail(String vEmail) {
		try {
			pause(600);
			agentEmailStr.clear();
			pause(150);
			agentEmailStr.sendKeys(vEmail);
		} catch (Exception e) {
			errorInfo(info14);
		}

	}

	public void clickOnSaveButton() {
		try {
			pause(600);
			saveBttn.click();
		} catch (Exception e) {
			errorInfo(info8);
		}
	}

	public void closeWindow() {
		try {
			pause(600);
			closeWndwBttn.click();
			pause(1000);
		} catch (Exception e) {
			errorInfo(info11);
		}
	}

	public void selectAdmin() {

		waitTryClick(20, adminRdbttn, info10);
	}

	public void clickOnPersonalDetails() {
		try {
			pause(600);
			prsnlDtlsItem.click();
		} catch (Exception e) {
			errorInfo(info9);
		}
	}

	public void uncheckAllowChangeStatusCheckbox() {
		waitTryClick(20, changeStatusChckbx, info7);

	}

	public void createNewAgent(String agentName) {
		try {
			pause(800);
			try {
				waitTryClick(200, createAgntBttn, info1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				waitTryClick(200, closeWndwBttn, info1);
				waitTryClick(200, createAgntBttn, info1);
			}
			pause(800);
			waitTryType(200, agentNameStr, agentName, info1);
			waitTryType(200, agentEmailStr, agentName + "@ml.im", info1);
			waitTryClick(200, createBttn, info1);
			
			pause(1800);
		//pageObjectDriver.navigate().refresh();
			waitTryClick(200, closeWndwBttn, info1);
			pause(800);
		} catch (Exception e) {
			errorInfo(info1);
		}
	}

	public void createNewAgent(String agentName, String agentEmail) {

		try {
			waitTryClick(20, createAgntBttn, info1);
		} catch (Exception e) {
			waitTryClick(20, closeWndwBttn, info1);
			waitTryClick(20, createAgntBttn, info1);
		}
		waitTryType(20, agentNameStr, agentName, info1);
		waitTryType(20, agentEmailStr, agentEmail, info1);
		selectAdmin();
		waitTryClick(20, createBttn, info1);
		try {
			pause(800);
			if (undltAgentConfDlg.isDisplayed()) {
				waitTryClick(20, confirmBttn, info21);
			}
		} catch (Exception e) {
		}
		waitTryClick(200, closeWndwBttn, info1);
	}

	public void clickOnCreatedAgent(String vAgent) {
		pause(1200);
		List<WebElement> listWe = pageObjectDriver
				.findElements(By.cssSelector("div.ImLeButtonMain.buttonBorderColor.buttonBgColor"));
		listWe.get(3).click();
	}

	public void clickOnSpecificAgent(String vAgent) {

		int num = agentsList2.size();
		for (int i = 0; i < num; i++) {
			if (agentsList2.get(i).getText().contains(vAgent)) {
				editBttnList.get(i).click();
				break;
			}
		}
	}

	public void addAgentToAllDepartments() {
		
		waitTryClick(20, addAll, info5);
	}
	
	public void removeAgentsFromAllDepartments() {
		waitTryClick(20, removeAll, info24);
	}

	public void clickOnDepartmentItem() {
		waitTryClick(20, dptmntItem, info6);
	}

	public void verifyCreatedAgentIsInAgentsList(String agentName) {
		pageObjectDriver.navigate().refresh();
		pause(1500);
		if (!agentsList.getText().contains(agentName)) {
			errorInfo(info2);
		}

	}

	public void verifyAgentAbsenceAgentsList(String agentName) {
		pageObjectDriver.navigate().refresh();
		pause(1500);
		if (agentsList.getText().contains(agentName)) {
			errorInfo(info4);
		}
	}

	public void deleteCreatedAgent2() {
		pause(1200);
		List<WebElement> listWe = pageObjectDriver
				.findElements(By.cssSelector("div.ImLeButtonMain.buttonBgColor.buttonBorderColor"));
		listWe.get(5).click();
		pause(500);
		yesBttn.click();
		pause(1500);

	}

	public void deleteCreatedAgent() {
		try {
			pause(1500);
			clickViaJavaScript(dltAgent1);
			pause(500);
			yesBttn.click();
		} catch (Exception e) {
			errorInfo(info3);
		}
		pause(1500);
	}
	
	public void approveDeleteAgentAction() {
		
		waitTryClick(20, yesBttn, info20);

	}

	public void deleteCreatedAgent(String vAgent) {
		pause(1500);
		int i = agentsTbl2.size();
		if (i > 0) {
			for (int y = 1; y < i; y++) {
				if (agentsTbl2.get(y).getText().contains(vAgent)) {
					dltAgentsBttn.get(y).click();
					pause(500);
					yesBttn.click();
					break;
				}
			}
		} else {
			errorInfo(info20);
		}
	}
}
