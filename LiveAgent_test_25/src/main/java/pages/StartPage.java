package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import general.Help;

public class StartPage extends PageObject {

	protected int gotItMark = 0;

	private static String info1 = "TestNO - couldn't delete tickets";
	private static String info2 = "TestNO";
	private static String info3 = "TestNO - couldn't logout";
	private static String info4 = "TestNO - no new tickets";
	private static String info5 = "TestNO - ticket status is not as required";
	private static String info6 = "TestNO - Slovenian lang is not approved";
	private static String info7 = "TestNO - couldn't click on 'Answer' button to start chat dialog";
	private static String info8 = "TestNO - couldn't get ticket table content";
	private static String info9 = "TestNO - couldn't delete ticket via more button";
	private static String info10 = "TestNO - not all windows are closed";
	private static String info11 = "TestNO - couldn't click on 'Reports' item";
	private static String info12 = "TestNO - couldn't check all tickets";
	private static String info13 = "TestNO - couldn't click on drop down arrow to see list mass actions";
	private static String info14 = "TestNO - couldn't select 'Resolve' item from list of mass actions";
	private static String info15 = "TestNO - couldn't get email OR email is not as required OR incorrect columns' order in ticketView";
	private static String info16 = "TestNO - couldn't click on ticket from 'Submit ticket' source";
	private static String info17 = "TestNO - couldn't click on 'Custom filter' button";
	private static String info18 = "TestNO - couldn't click on 'Add filter' button";
	private static String info19 = "TestNO - couldn't set 'Message added by' item";
	private static String info20 = "TestNO - couldn't set 'Me' value";
	private static String info21 = "TestNO - couldn't set 'Message added' item";
	private static String info22 = "TestNO - couldn't click on 'Apply' button";
	private static String info23 = "TestNO - couldn't click on found ticket OR ticket is not found";
	private static String info24 = "TestNO - couldn't click on 'Tickets' icon";
	private static String info25 = "TestNO - couldn't verify empty ticketbox";
	private static String info26 = "TestNO - couldn't click on call icon near Agent name";
	private static String info27 = "TestNO - couldn't get value from popUp smallWindow";
	private static String info28 = "TestNO - couldn't verify that Agent is Admin";
	private static String info29 = "TestNO - checkbox is not as required";
	private static String info30 = "TestNO - couldn't find checkbox";
	private static String info31 = "TestNO - couldn't select 'Merge' item";
	private static String info32 = "TestNO - couldn't find 'Merge into' string OR type in it";
	private static String info33 = "TestNO - couldn't check 'Merge recipients' checkbox";
	private static String info34 = "TestNO - couldn't click on merged in ticket";
	private static String info35 = "TestNO - couldn't find OR type alias value in 'Alias' string";
	private static String info36 = "TestNO - couldn't click on 'Save' button OR close window";
	private static String info37 = "TestNO - couldn't click on Agent's name in right-upper corner in AP";
	private static String info38 = "TestNO - couldn't click on just sent mail";
	private static String info39 = "TestNO - couldn't verify agent's name";
	private static String info40 = "TestNO - couldn't check 'All' statuse in status cell";
	private static String info41 = "TestNO - couldn't type in 'Search' string";
	private static String info42 = "TestNO - ticket is not purged";
	private static String info43 = "TestNO - couldn't check first ticket";
	private static String info44 = "TestNO - couldn't check second ticket";
	private static String info45 = "TestNO - couldn't check 'Merge tags' checkbox";
	private static String info46 = "TestNO - couldn't click to open ticketView menu";
	private static String info47 = "TestNO - couldn't select 'Views' item";
	private static String info48 = "TestNO - couldn't select 'Manage views' item";
	private static String info49 = "TestNO - couldn't click on 'Add view' button";
	private static String info50 = "TestNO - couldn't type in 'Name' string for ticketView";
	private static String info51 = "TestNO - ticketView is not created";
	private static String info52 = "TestNO - couldn't click on 'Delete' button";
	private static String info53 = "TestNO - couldn't click on 'Yes' button";
	private static String info54 = "TestNO - couldn't click on 'Search' button";
	private static String info55 = "TestNO - couldn't click on 'Customers' button";
	private static String info56 = "TestNO - couldn't find 'Mass action' button";
	private static String info57 = "TestNO - couldn't select 'change ticket priority'";
	private static String info58 = "TestNO - couldn't select required priority";
	private static String info59 = "TestNO - couldn't select 'Undelete' item";
	private static String info60 = "TestNO - number of found tickets is not as required";
	private static String info61 = "TestNO - couldn't click on '+create' link";
	private static String info62 = "TestNO - couldn't click on 'Ceate' button";
	private static String info63 = "TestNO - couldn't name for ticket filter";
	private static String info64 = "TestNO - couldn't select required ticket filter";
	private static String info65 = "TestNO - search string is not empty";
	private static String info66 = "TestNO - couldn't click on ticket filter options";
	private static String info67 = "TestNO - couldn't click on 'Delete' item";
	private static String info68 = "TestNO - couldn't hover over required ticket filter";
	private static String info69 = "TestNO - couldn't click on 'Departments' item";
	private static String info70 = "TestNO - 'Add all' button is visible";
	private static String info71 = "TestNO - 'Remove all' button is visible";
	private static String info72 = "TestNO - couldn't type in 'Subject' string";
	private static String info73 = "TestNO - couldn't type in 'Message' string";
	private static String info74 = "TestNO - couldn't confirm mass action";
	private static String info75 = "TestNO - couldn't click on '+new' button";
	private static String info76 = "TestNO - couldn't click on 'Logout' button";
	private static String info77 = "TestNO - couldn't click on 'Refresh' icon";
	private static String info78 = "TestNO - couldn't find ticket status";
	private static String info79 = "TestNO - couldn't click on 'Chats' icon";
	private static String info80 = "TestNO - couldn't click on 'Customer portal' icon";
	private static String info81 = "TestNO - couldn't click on 'Configuration' icon";
	private static String info82 = "TestNO - couldn't click on required ticket";
	private static String info83 = "TestNO - couldn't locate value of new tickets";
	private static String info84 = "TestNO - couldn't click on value of new tickets";
	private static String info85 = "TestNO - created ticket filter is not visible";
	private static String info86 = "TestNO - couldn't click on 'Edit' button";
	private static String info87 = "TestNO - couldn't load LA AP";
	private static String info88 = "TestNO - couldn't click on 'Settings' item";
	private static String info89 = "TestNO - couldn't click on 'Dashboard' icon";

	@FindAll({ @FindBy(css = "div#body div.gwt-Label.LoggedUserName"), @FindBy(css = "div[class *= 'UserAvatarPanel']"),
			@FindBy(xpath = "//div[@class='ImLeButton ImLeButtonMainOut LoggedUserExpandButton ButtonLikeIcon']"),
			@FindBy(css = ".LoggedUserExpandButton") })
	private WebElement username;

	@FindBy(xpath = "//div/div/div/div/div[4]/div[2]/div")
	private WebElement logoutBttn;

	@FindBy(css = ".SelectableItemWidget:nth-child(2) .gwt-Label")
	private WebElement editBttn;

	@FindBy(css = "div[class='gwt-Label ServiceStatusCount FloatLeft']")
	private WebElement valueOfNewTckt;

	@FindBy(tagName = "body")
	private WebElement fBody;

	@FindBy(xpath = "//div[@class='TicketFilterLink CreateFilter']")
	private WebElement slovenianLngMark;

	@FindBy(css = "div.NDContent")
	private WebElement emptyMssg;

	@FindBy(tagName = "err")
	private WebElement error;

	@FindBy(xpath = "//div[@class='g-TableHeaderCellPanel']//div[@class='CheckBox']")
	private WebElement chckAllChckbx;

	@FindBy(xpath = "//div[@class='buttonIcon Icon16 Icon16-delete']")
	private WebElement dltBttn;

	@FindBy(xpath = "//div[@class='ConversationStatus']")
	private WebElement tcktStts;

	@FindBy(xpath = "//span[contains(text(),'Run now')]")
	private WebElement runNowBttn;

	@FindBy(css = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.HeaderPanel:nth-child(1) div.MyStatus.MyStatusMainPanel.FloatLeft div.ImLeButton.ImLeButtonMainOut.LoggedUserExpandButton.ButtonLikeIcon:nth-child(5) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > div.buttonIcon")
	private WebElement usernameAn;

	@FindBy(css = "div[class *= 'menuItem Tickets TicketsMenuItem']")
	private WebElement ticketsIcon;

	@FindBy(xpath = "//div[@class='menuItem Tickets TicketsMenuItem']//div[@class='IconPanel']")
	private WebElement ticketsIcon2;

	@FindBy(css = "div[class *='menuItem Configuration']")
	private WebElement configIcon;

	@FindBy(css = "div[class *= 'menuItem Chats TicketsMenuItem']")
	private WebElement chatIcon;

	@FindBy(xpath = "//div[@class='menuItem Calls TicketsMenuItem']//div[@class='IconPanel']")
	private WebElement callIcon;

	@FindBy(css = "div[class *= 'menuItem Knowledgebase']")
	private WebElement customerPortalIcon;

	@FindBy(css = "div.TaskIn")
	private WebElement newBttn;

	@FindBy(xpath = "//span[contains(text(),'Answer')]")
	private WebElement answerBttn;

	@FindBy(xpath = "//div[contains(text(),'ConversationId')]")
	private WebElement oneIDinTcktBx;

	@FindBy(xpath = "//div[@class='g-TableBody ScrollPanel']")
	private WebElement fullTicketbox;

	@FindBy(xpath = "//div[@class='menuItem Reports']//div[@class='IconPanel']")
	private WebElement rprtsItem;

	@FindBy(xpath = "//span[contains(text(),'Resolve')]")
	private WebElement rslvBttn;

	@FindBy(xpath = "//span[contains(text(),'Mass action')]")
	private WebElement massActnBttn;

	@FindBy(xpath = "//div[@class='ImLeButton ImLeButtonMainOut']//div[@class='ImLeButtonMainInner']")
	private WebElement massActnBttn_2;

	@FindBy(xpath = "//img[@class='g-ListBoxButton']")
	private WebElement massActnDDA;

	@FindBy(xpath = "//div[@class='gwt-Label InfoHtml']")
	private WebElement emailFromFirstItemInTicketbox;

	@FindBy(xpath = "//div[@class='PresetLabel']")
	private WebElement cstmFltrBttn;

	@FindBy(xpath = "//span[contains(text(),'Add filter')]")
	private WebElement addFltrBttn;

	@FindBy(xpath = "//img[@class='g-ListBoxButton']")
	private WebElement mssgeAddedByDDl;

	@FindBy(xpath = "//div[@class='DateRangeFilterField']//img[@class='g-ListBoxButton']")
	private WebElement mssgeAddedDDl;

	@FindBy(xpath = "//span[contains(text(),'Apply')]")
	private WebElement applyBttn;

	@FindBy(xpath = "//div[@id='body']/div/div/div[4]/div[2]/div[3]/div")
	private WebElement callIconNearAgentName;

	@FindBy(css = ".FakeTableHead")
	private WebElement reqValue;

	@FindBy(xpath = "//div[@class='ChatsService ServiceStatusWidget ServiceStatusButton ServiceStatusWidget-Offline ChatsService-Offline']//div[@class='ServiceStatusButtonIcon']")
	private WebElement ChatDisableIcon;

	@FindBy(xpath = "//div[6]/div/div/div/div[4]/div/div[2]/div/div/div")
	private WebElement chckBxInChatDisableIcon;

	@FindBy(xpath = "//div[@class='SmallIcon ChatSI']")
	private WebElement chatsItem;

	@FindBy(xpath = "//div[@class='CheckBoxContainer DeviceStatusCheckBox']//div[@class='CheckBox']")
	private WebElement chatsStatusChckBx;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Even ConversationRow ConversationRowA']//div[@class='CheckBox']")
	private WebElement firstTcketChckBx;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Odd ConversationRow ConversationRowA']//div[@class='CheckBox']")
	private WebElement secondTcketChckBx;

	@FindBy(xpath = "//div[@class='TextBoxContainer SearchBoxEmpty']//input[@type='text']")
	private WebElement mergeIntoStr;

	@FindBy(css = "div.RuleValue div.MergeIntoAction.MergeIntoActionRule div.MergeIntoInputWidget div.MergeIntoOptionsPanel div.CheckBoxContainer:nth-child(2) > div.CheckBox")
	private WebElement mergeRcpntsChckbx;

	@FindBy(xpath = "//div[@class='gwt-HTML PreviewLabel']")
	private WebElement mergeInTicket;

	@FindBy(xpath = "//input[@name='system_name']")
	private WebElement aliasStr;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement saveBttn;

	@FindBy(xpath = "//div[@class='ImLeButton ImLeButtonMainOut GreenButton']")
	private WebElement saveBttn2;

	@FindBy(xpath = "//div[@class='gwt-Label CloseLabel']")
	private WebElement closeWndwBttn;

	@FindBy(xpath = "//div[@class='FilterOptionWidget FilterOptionType-rstatus']//div[@class='ImLeButton ImLeButtonMainOut OptionsSelectButton OptionsSelectAll ButtonLikeLink']//div[@class='ImLeButtonMainContent']")
	private WebElement allStatusChckbx;

	@FindBy(xpath = "//div[@class='SearchBoxInputPanel']//input[@type='text']")
	private WebElement searchStr;

	@FindBy(xpath = "//div[@class='MergeIntoOptionsPanel']//div[1]//div[1]")
	private WebElement mergedTagsChckbx;

	@FindBy(xpath = "//div[@id='body']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[4]/div/div[2]/div/div[2]/div[2]/div[3]")
	private WebElement tViewMenu;

	@FindBy(css = ".ViewsIcon .g-MenuItemIcon")
	private WebElement viewsItem;

	@FindBy(css = ".g-MenuItem-Over .g-MenuItemLabel")
	private WebElement mngViewsItem;

	@FindBy(xpath = "//div[@class='AddViewTable']//div[@class='g-TablePanel']//div[@class='g-Table']//div//div[@class='g-TableBody ScrollPanel']")
	private WebElement tViewsTable;

	@FindBy(xpath = "//span[contains(text(),'Add view')]")
	private WebElement addTcktViewBttn;

	@FindBy(xpath = "//input[@class='TextBox']")
	private WebElement strForTcktViwName;

	@FindBy(xpath = "//div[@class='g-TableRow g-TableRow-Even']//span[@class='buttonText'][contains(text(),'Delete')]")
	private WebElement dltTcktView;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yesBttn;

	@FindBy(xpath = "//span[contains(text(),'Search')]")
	private WebElement searchBttn;

	@FindBy(xpath = "//div[@class='menuItem Customers']//div[@class='IconPanel']")
	private WebElement cstmrsIcon;

	@FindBy(xpath = "//div[@class='gwt-Label UserName']")
	private WebElement mailFromSubmitTicket;

	@FindBy(xpath = "//div[6]//div[1]//div[1]")
	private WebElement tickPrio_2;

	@FindBy(xpath = "//div[@class='DisplayingRangeCount']")
	private WebElement fullTcktsNum;

	@FindBy(xpath = "//div[@class='TicketFilterLink CreateFilter']//div[@class='LinkIcon']")
	private WebElement createTcktFltr;

	@FindBy(xpath = "//input[@class='TextBox']")
	private WebElement strFltrName;

	@FindBy(xpath = "//span[contains(text(),'Create')]")
	private WebElement fCreateTcktFltr;

	@FindBy(xpath = "//div[@class='SearchBoxViewWithButton g-SearchWidget SearchBoxEmpty']")
	private WebElement emptySearchBox;

	@FindBy(xpath = "//div[@id='body']/div/div[2]/div[2]/div/div/div/div/div[3]/div/div/div/div[3]/div/div/div[2]/div")
	private WebElement tcktFltrOptions;

	@FindBy(css = ".SelectableItemWidget:nth-child(6) .gwt-Label")
	private WebElement deleteItem;

	@FindBy(xpath = "//div[@class='SmallIcon DepartmentsSI']")
	private WebElement dprtmntItem;

	@FindBy(xpath = "//div[@class='SmallIcon AgentSettingsSI']")
	private WebElement settingsItem;

	@FindBy(xpath = "//div[@class='FloatLeft ContentScrolled']")
	private WebElement dprtmntItemContent;

	@FindBy(xpath = "//div[@class='gwt-Label AddActionLabel']")
	private WebElement addAll;

	@FindBy(xpath = "//div[@class='gwt-Label RemoveActionLabel']")
	private WebElement removeAll;

	@FindBy(xpath = "//div[@class='TextBoxContainer SubjectText']//input[@class='TextBox']")
	private WebElement sbjctStrForSendAnswr;

	@FindBy(xpath = "//textarea[@class='gwt-TextArea']")
	private WebElement mssgStrForSendAnswr;

	@FindBy(css = "div.Filters")
	private WebElement filtersList;

	@FindBy(css = "div.g-TableRefreshIcon.IconButton.FloatLeft")
	private WebElement refreshTcktbx;

	@FindBy(xpath = "//div[@class='g-TableDataPanel DataPanel']/div")
	private List<WebElement> ticketBxl;

	@FindBy(css = "div.gwt-Label.InfoHtml")
	private List<WebElement> ticketsList;

	@FindBy(css = "div.CheckBox")
	private List<WebElement> ticketsChckbx;

	@FindBy(xpath = "//div[@class='ServiceStatusButtonIcon']")
	private List<WebElement> serviceIcons;

	@FindBy(xpath = "//div[@class='g-FormField2']//input[@class='g-ListBoxInput']")
	private WebElement massActionList;

	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement agentFullname;

	@FindBy(css = "div[class='RadioButton2-Content']")
	private List<WebElement> themesList;

	@FindBy(css = "div[class='RadioButton2 RadioButton2-down']")
	private WebElement actualTheme;

	@FindBy(xpath = "//div[@class='menuItem Dashboard']//div[@class='IconPanel']")
	private WebElement dashboardIcon;
	
	@FindBy(css = "input[class='g-ListBoxInput']")
	private List<WebElement> ddl;
	

	public StartPage(WebDriver dr) {
		super(dr);
	}

	public void clickOnDashboardIcon() {
		waitTryClick(20, dashboardIcon, info89);
	}

	public void verifyCreatedTicketFilterIsVisible(String vName) {
		if (!getFilters().contains(vName)) {
			errorInfo(info85);
		}
	}

	public String getFilters() {
		pause(1500);
		return filtersList.getText();
	}

	public void checkRequiredTicket(String st) {
		for (int i = 0; i < ticketsList.size(); i++) {
			if (ticketsList.get(i).getText().equals(st)) {
				ticketsChckbx.get(i + 1).click();
				pause(1000);
			}
		}
	}

	public void openRequiredTicket_2(String st) {
		pause(2000);
		for (int i = 0; i < ticketsList.size(); i++) {
			if (ticketsList.get(i).getText().equals(st)) {
				clickViaJavaScript(ticketsList.get(i));
				// ticketsList.get(i).click();
				pause(1000);
			}
		}
	}

	public void verifyAbsenceOfAddallRemoveButtons() {
		waitTryClick(20, username, info37);
		waitTryClick(20, dprtmntItem, info69);
		pause(400);
		if (waitForDisplaying(5, addAll)) {
			errorInfo(info70);
		}
		if (waitForDisplaying(5, removeAll)) {
			errorInfo(info71);
		}
	}

	public void hoverOverRequiredTicketFilter(String vContact) {
		pause(1000);
		try {
			Actions action2 = new Actions(pageObjectDriver);
			WebElement wE = pageObjectDriver.findElement(By.xpath("//div[contains(text(),'" + vContact + "')]"));
			action2.moveToElement(wE).perform();
		} catch (Exception e) {
			errorInfo(info68);
		}
	}

	public void deleteCreatedTicketFilter(String vFilter) {

		hoverOverRequiredTicketFilter(vFilter);
		waitTryClick(20, tcktFltrOptions, info66);
		waitTryClick(20, deleteItem, info67);
		waitTryClick(20, yesBttn, info53);
	}

	public void verifyEmptySearchString() {
		pause(2000);
		if (!emptySearchBox.isDisplayed()) {
			errorInfo(info65);
		}
	}

	public void selectRequiredFilter(String vContact) {
		pause(1500);
		try {
			WebElement wE = pageObjectDriver.findElement(By.xpath("//div[contains(text(),'" + vContact + "')]"));
			clickViaJavaScript(wE);
		} catch (Exception e) {
			errorInfo(info64);
		}
	}

	public void createTicketFilter(String vName) {
		waitTryClick(20, createTcktFltr, info61);
		waitTryType(20, strFltrName, vName, info63);
		waitTryClick(20, fCreateTcktFltr, info62);
	}

	public void verifyNumberOfFoundTickets(int vNum) {
		waitForDisplay(20, fullTcktsNum, info60);
		int ticketsNum = Integer.valueOf(fullTcktsNum.getText().trim());
		if (ticketsNum != vNum) {
			errorInfo(info60);
		}
	}

	public void verifyMassActionButtonIsEnable() {
		pause(1000);
		try {
			if (massActnBttn_2.isEnabled()) {
				setDefaultView();
			}
		} catch (Exception e) {
			setDefaultView();
			errorInfo(info56);
		}
	}

	public void setDefaultView() {
		openTicketViewMenu();
		Actions action = new Actions(pageObjectDriver);
		pause(500);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);
		pause(500);
		action.sendKeys(Keys.ARROW_RIGHT);
		pause(500);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		pause(2500);
		pageObjectDriver.navigate().refresh();
		pause(2500);
	}

	public void navigateToCustomersPage() {
		waitTryClick(20, cstmrsIcon, info55);
	}

	public void verifyTicketViewIsCreated(String tVname) {
		openTicketViewMenu();
		clickOnViewsItem();
		clickOnManageViewsItem();
		String s1 = tViewsTable.getText();
		if (!s1.contains(tVname)) {
			errorInfo(info51);
		}
	}

	public void deleteTicketView() {
		waitTryClick(20, dltTcktView, info52);
		waitTryClick(20, yesBttn, info53);
		waitTryClick(20, closeWndwBttn, info49);
	}

	public void verifyTicketViewIsDeleted(String tVname) {
		openTicketViewMenu();
		clickOnViewsItem();
		clickOnManageViewsItem();
		String s1 = tViewsTable.getText();
		if (s1.contains(tVname)) {
			errorInfo(info51);
		}
		waitTryClick(20, closeWndwBttn, info49);
	}

	public void createNewTicketView(String tVname) {
		openTicketViewMenu();
		clickOnViewsItem();
		clickOnManageViewsItem();
		waitTryType(20, strForTcktViwName, tVname, info50);
		waitTryClick(20, addTcktViewBttn, info49);
		waitTryClick(20, closeWndwBttn, info49);
	}

	public void deleteUserColumn() {
		openTicketViewMenu();
		pause(600);
		Actions action = new Actions(pageObjectDriver);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		action.sendKeys(Keys.ARROW_RIGHT);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
	}

	public int getNumOfTcktViews() {
		pause(800);
		String s1 = tViewsTable.getText();
		String[] parts = s1.split("delete");
		return parts.length;
	}

	public void openTicketViewMenu() {
		waitTryClick(20, tViewMenu, info46);
	}

	public void clickOnViewsItem() {
		waitTryClick(20, viewsItem, info47);
	}

	public void clickOnManageViewsItem() {
		pause(600);
		try {
			Actions action = new Actions(pageObjectDriver);
			pause(250);
			action.sendKeys(Keys.ARROW_UP);
			action.sendKeys(Keys.ENTER);
			action.build().perform();
		} catch (Exception e) {
			errorInfo(info48);
		}
	}

	public void typeTicketIDInSearchString(String tID) {
		waitTryType(20, searchStr, tID, info41);
	}

	public void findTicketViaSearchStr(String tID) {
		pause(1500);
		waitTryType(20, searchStr, tID, info41);
		pause(3000);
		waitTryClick(20, searchBttn, info54);
	}

	public void checkMergeTagsCheckbox() {
		waitTryClick(20, mergedTagsChckbx, info45);
	}

	public void typeAgentAlias(String vAlias) {
		try {
			pause(600);
			aliasStr.clear();
			pause(600);
			aliasStr.sendKeys(vAlias);
		} catch (Exception e) {
			errorInfo(info35);
		}
	}

	public void clickOnSaveButton() {
		try {
			pause(600);
			saveBttn.click();
			pause(800);
			closeWndwBttn.click();
		} catch (Exception e) {
			errorInfo(info36);
		}
	}

	public void clickOnMergedInTicket() {
		waitTryClick(20, refreshTcktbx, info77);
		try {
			pause(3000);
			mergeInTicket.click();
		} catch (Exception e) {
			errorInfo(info34);
		}
	}

	public void checkMergeRecipientsCheckbox() {
		try {
			pause(600);
			mergeRcpntsChckbx.click();
		} catch (Exception e) {
			errorInfo(info33);
		}
	}

	public void typeTicketIDinString(String vTid) {

		try {
			pause(600);
			mergeIntoStr.clear();
			Actions action = new Actions(pageObjectDriver);
			action.sendKeys(vTid);
			action.build().perform();
		} catch (Exception e) {
			errorInfo(info32);
		}
	}

	public void checkFirstTicketChckbx() {
		pageObjectDriver.navigate().refresh();
		waitTryClick(20, firstTcketChckBx, info43);

	}

	public void checkSecondTicketChckbx() {
		waitTryClick(20, secondTcketChckBx, info44);
	}

	public void verifyChatServiceIsDisable() {
		try {
			pause(800);
			username.click();
			pause(800);
			chatsItem.click();
			pause(600);
			if (chatsStatusChckBx.getAttribute("aria-checked").equals("true")) {
				errorInfo(info29);
			}
		} catch (Exception e) {
			errorInfo(info30);
		}
	}

	public void clickOnCallIconNearAgentName() {
		try {
			pause(600);
			clickViaJavaScript(callIconNearAgentName);///
		} catch (Exception e) {
			errorInfo(info26);
		}
	}

	public void getResult(int i) {
		pause(1000);
		wPL(i);
	}

	public void setRequiredTheme(String agentName, String reqTheme) {
		waitPageLoadWithRefresh(5, 20, info87, configIcon);
		waitTryClick(40, serviceIcons.get(1), info26);
		Actions action = new Actions(pageObjectDriver);
		action.sendKeys(Keys.TAB);
		action.build().perform();
		pause(500);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		pause(500);
		waitTryClick(40, editBttn, info86);
		pause(1500);
		if (!agentFullname.getAttribute("value").equals(agentName)) {
			errorInfo(info2);
		}
		waitTryClick(40, settingsItem, info88);
		pause(1500);
		if (!actualTheme.getText().equals(reqTheme)) {
			for (int i = 0; i < themesList.size(); i++) {
				String themeVal = themesList.get(i).getText();
				if (themeVal.equals(reqTheme)) {
					themesList.get(i).click();
					i = themesList.size();
				}
			}
			pause(500);
			action.sendKeys(Keys.TAB);
			action.sendKeys(Keys.TAB);
			action.build().perform();
			pause(500);
			action.sendKeys(Keys.ENTER);
			action.build().perform();
			waitTryClick(40, yesBttn, info53);
			waitPageLoadWithRefresh(5, 20, info87, configIcon);
		} else {
			refreshWebPage();
			waitPageLoadWithRefresh(5, 20, info87, configIcon);
		}
	}

	public String getCallOptions() {
		try {
			pause(600);
			return reqValue.getText();
		} catch (Exception e) {
			errorInfo(info27);
			return null;
		}
	}

	public void verifyAgentIsAdmin(String s, String s2) {
		try {
			clickOnCallIconNearAgentName();
			if (!getCallOptions().contains(s) && !getCallOptions().contains(s2)) {
				errorInfo(info28);
			}
		} catch (Exception e) {
			errorInfo(info28);
		}
	}

	public void clickOnFoundTicket() {
		try {
			pause(600);
			emailFromFirstItemInTicketbox.click();
		} catch (Exception e) {
			errorInfo(info23);
		}
	}

	public void checkAllStatuses() {
		waitTryClick(20, allStatusChckbx, info40);
	}

	public void clickOnApplyButton() {
		waitTryClick(20, applyBttn, info22);
	}
	
	public void waitAction() {
		pause(45000);
		pageObjectDriver.navigate().refresh();
	}


	public void clickOnAddFilter() {
		try {
			pause(600);
			addFltrBttn.click();
		} catch (Exception e) {
			errorInfo(info18);
		}
	}

	public void set_Today_Value() {
		try {
			pause(600);
			ddl.get(2).click();
			pause(600);
			//mssgeAddedDDl.clear();
			Actions actions4 = new Actions(pageObjectDriver);
			actions4.sendKeys(Keys.BACK_SPACE);
			actions4.build().perform();
			actions4.sendKeys(Keys.ARROW_DOWN);
			actions4.build().perform();
			pause(150);
			for (int i = 0; i < 14; i++) {
				actions4.sendKeys(Keys.ARROW_UP);
				pause(150);
			}
			actions4.build().perform();
			actions4.sendKeys(Keys.ARROW_DOWN);
			actions4.sendKeys(Keys.ENTER);
			actions4.build().perform();
		} catch (Exception e) {
			errorInfo(info20);
		}
	}

	public void set_Me_Value() {
		try {
			pause(600);
			ddl.get(1).click();// click on ddl in 'messageAddedBy' cell
			Actions actions = new Actions(pageObjectDriver);
			actions.sendKeys(Keys.ARROW_DOWN);
			pause(1000);
			actions.sendKeys(Keys.ARROW_UP);
			pause(100);
			actions.sendKeys(Keys.ARROW_UP);
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
		} catch (Exception e) {
			errorInfo(info20);
		}
	}

	public void setMessageAdded() {
		try {
			pause(600);
			Actions actions3 = new Actions(pageObjectDriver);
			actions3.sendKeys(Keys.ARROW_DOWN);
			pause(150);
			for (int i = 0; i < 20; i++) {
				actions3.sendKeys(Keys.ARROW_UP);
				pause(150);
			}
			for (int i = 0; i < 7; i++) {
				actions3.sendKeys(Keys.ARROW_DOWN);
				pause(150);
			}
			actions3.sendKeys(Keys.ENTER);
			actions3.build().perform();
		} catch (Exception e) {
			errorInfo(info21);
		}
	}

	public void setMessageAddedBy() {
		try {
			pause(600);
			Actions actions = new Actions(pageObjectDriver);
			actions.sendKeys(Keys.ARROW_DOWN);
			pause(150);
			for (int i = 0; i < 20; i++) {
				actions.sendKeys(Keys.ARROW_UP);
				pause(150);
			}
			for (int i = 0; i < 6; i++) {
				actions.sendKeys(Keys.ARROW_DOWN);
				pause(150);
			}
			actions.sendKeys(Keys.ENTER);
			actions.build().perform();
		} catch (Exception e) {
			errorInfo(info19);
		}
	}

	public void clickOnCustomFilter() {

		waitTryClick(20, cstmFltrBttn, info17);
	}

	public void clickOnEmailFromSubmitTicket() {
		try {
			pause(600);
			emailFromFirstItemInTicketbox.click();
		} catch (Exception e) {
			errorInfo(info16);
		}
	}

	public void verifyEmail(String vEmail) {
		try {
			pause(600);
			if (!emailFromFirstItemInTicketbox.getText().equals(vEmail)) {
				errorInfo(info15);
			}
		} catch (Exception e) {
			errorInfo(info15);
		}
	}

	public void checkAllTicketsInTicketbox() {
		try {
			pause(400);
			chckAllChckbx.click();
		} catch (Exception e) {
			errorInfo(info11);
		}
	}

	

	public void selectFromMassActionDDL(String val) {

		waitTryClick(20, massActionList, info13);
		pause(250);
		if (!massActionList.getAttribute("value").trim().equals(val)) {
			Actions action = new Actions(pageObjectDriver);
			do {
				massActionList.clear();
				pause(500);
				action.sendKeys(Keys.ARROW_DOWN);
				action.build().perform();
				action.sendKeys(Keys.ENTER);
				action.build().perform();
			} while (!massActionList.getAttribute("value").trim().equals(val));
		}
	}

	public void undeleteViaMassAction() {

		waitTryClick(20, chckAllChckbx, info11);
		waitTryClick(20, massActnBttn, info11);
		selectUndeleteItemFromDropDownList();
		clickOnRunNowBttn();
	}

	public void sendAnswerViaMassAction(String vSubject, String vMssg) {

		waitTryClick(20, chckAllChckbx, info11);
		waitTryClick(20, massActnBttn, info11);
		selectSendAnswerFromDropDownList(vSubject, vMssg);
	}

	public void clickOnReportsItem() {
		waitTryClick(20, rprtsItem, info11);
	}

	public void selectResolveItemFromDropDownList() {
		try {
			selectFromMassActionDDL(Help.massActionList_En[19]);
		} catch (Exception e) {
			errorInfo(info14);
		}

	}

	public void selectUndeleteItemFromDropDownList() {
		try {
			selectFromMassActionDDL(Help.massActionList_En[25]);
		} catch (Exception e) {
			errorInfo(info59);
		}
	}


	public void selectMergeItemFromDropDownList() {

		try {
			selectFromMassActionDDL(Help.massActionList_En[13]);
		} catch (Exception e) {
			errorInfo(info31);
		}
	}

	public void selectSendAnswerFromDropDownList(String vSubject, String vMssg) {
		try {
			selectFromMassActionDDL(Help.massActionList_En[20]);
			waitTryType(20, sbjctStrForSendAnswr, vSubject, info72);
			waitTryType(20, mssgStrForSendAnswr, vMssg, info73);
			clickOnRunNowBttn();
		} catch (Exception e) {
			errorInfo(info31);
		}
	}

	public void setTicketPriority(String vPrior) {
		clickOnMassActionButton();
		try {
			selectFromMassActionDDL(Help.massActionList_En[5]);
			switch (vPrior) {
			case "2":
				waitTryClick(20, tickPrio_2, info58);
				break;
			}
			clickOnRunNowBttn();
		} catch (Exception e) {
			errorInfo(info57);
		}
	}

	public void clickOnMassActionButton() {
		try {
			pause(400);
			massActnBttn.click();
		} catch (Exception e) {
		}
	}

	public void openTicketViaClickOnItsID(String tcktID) {
		pause(1500);
		try {
			WebElement wE = pageObjectDriver.findElement(By.xpath("//div[contains(text(),'" + tcktID + "')]"));
			clickViaJavaScript(wE);
		} catch (Exception e) {
			clickViaJavaScript(oneIDinTcktBx);
		}
	}

	public void openTicketViaClickOnItsMail(String tcktMail) {
		pause(10000);
		pageObjectDriver.navigate().refresh();
		waitTryClick(20, refreshTcktbx, info77);
		pause(2000);
		try {
			WebElement wE = pageObjectDriver.findElement(By
					.xpath("//div[@class='gwt-Label UserName'][contains(text(),'" + tcktMail + "@" + tcktMail + "')]"));
			clickViaJavaScript(wE);
		} catch (Exception e) {
			errorInfo(info38);
		}
	}

	public void openTicketViaClickOnItsMail_2(String tcktMail) {
		pause(1500);
		waitTryClick(20, refreshTcktbx, info77);
		pause(1500);
		pause(2000);
		try {
			WebElement wE = pageObjectDriver.findElement(By
					.xpath("//div[@class='gwt-Label UserName'][contains(text(),'" + tcktMail + "@" + tcktMail + "')]"));
			clickViaJavaScript(wE);
		} catch (Exception e) {
			errorInfo(info38);
		}
	}

	public void openRequiredTicket(String vEmail) {
		pause(1500);
		waitTryClick(20, refreshTcktbx, info77);
		pause(1500);
		pause(2000);
		int i = ticketBxl.size();
		if (i > 0) {
			for (int y = 1; y <= i; y++) {
				if (pageObjectDriver.findElement(By.xpath("//div[@class='g-TableDataPanel DataPanel']/div[" + y + "]"))
						.getText().contains(vEmail)) {
					pageObjectDriver.findElement(By.xpath("//div[@class='g-TableDataPanel DataPanel']/div[" + y + "]"))
							.click();
					break;
				}
			}
		} else {
			errorInfo(info82);
		}
	}

	public void openTicketViaClickOnItsMail() {
		pause(1500);
		pageObjectDriver.navigate().refresh();
		waitTryClick(20, refreshTcktbx, info77);
		waitTryClick(20, mailFromSubmitTicket, info38);
	}

	public String getFullTableTicketContent() {
		try {
			pause(2000);
			return fullTicketbox.getText();
		} catch (Exception e) {
			errorInfo(info8);
		}
		return null;
	}

	public void verifyTicketIsPurged(String fValue) {
		if (getFullTableTicketContent().contains(fValue)) {
			errorInfo(info42);
		}

	}

	public String getActualUsername() {
		pause(1500);
		return waitTry(20, username, info39);
	}

	public void clickAnswerButtonToStartChatDialog() {
		pause(800);
		try {
			answerBttn.click();
		} catch (Exception e) {
			errorInfo(info7);
		}
	}

	public void clickChatsIcon() {
		waitTryClick(20, chatIcon, info79);
	}

	public void clickCallIcon() {
		pause(400);
		try {
			callIcon.click();
		} catch (Exception e) {
		}
	}

	public void clickCustomerPortalIcon() {
		waitTryClick(20, customerPortalIcon, info80);
	}

	public void clickUsernameAn() {
		usernameAn.click();
	}

	public void clickUsernameAn2() {
		username.click();
	}

	public void approveStatus(String st) {
		waitTryClick(20, refreshTcktbx, info77);
		waitForDisplay(20, tcktStts, info78);
		if (!tcktStts.getText().equals(st)) {
			errorInfo(info5);
		}
	}

	public void verifyAbsenceOfTicketWithSpecificID(String stID) {
		pause(800);
		if (getFullTableTicketContent().contains(stID)) {
			errorInfo(info9);
		}
	}

	public void tryClickNewBttn() {
		waitTryClick(20, newBttn, info75);
	}

	public ConfigPage clickConfigIcon() {
		waitTryClick(20, configIcon, info81);
		return new ConfigPage(pageObjectDriver);
	}

	public void clickConfigurationIcon() {
		waitTryClick(20, configIcon, info81);
	}

	public void clickLogoutBttn() {
		waitTryClick(20, logoutBttn, info76);
	}

	public String getURL() {
		String currentURL = pageObjectDriver.getCurrentUrl();
		return currentURL;
	}

	public void tryClickTicketsIcon() {
		waitTryClick(20, ticketsIcon, info24);
	}

	public void tryClickTicketsIcon_2() {
		try {
			pause(400);
			ticketsIcon2.click();
		} catch (Exception e) {
			errorInfo(info24);
		}

	}

	public ConfigPage tryClickConfigIcon() {
		try {
			pause(500);
			configIcon.click();
		} catch (Exception e) {
		}
		return new ConfigPage(pageObjectDriver);
	}

	public void findUserName() {
		while (gotItMark == 0) {
			try {
				username.isDisplayed();
				gotItMark = 1;
			} catch (Exception e) {
				pageObjectDriver.navigate().refresh();
			}
		}
		gotItMark = 0;
	}

	public void clickOnAgentName() {
		pause(40000);
		waitTryClick(20, username, info37);
	}

	public String getBody() {
		String body = fBody.getText();
		return body;
	}

	public void close() {
		pageObjectDriver.close();
		error.clear();
	}

	public void logout() {
		try {
			tryClickTicketsIcon();
			findUserName();
			clickUsernameAn();
			clickLogoutBttn();
			pause(1000);
		} catch (Exception e) {
			errorInfo(info3);
		}
	}

	public void help() {
		System.out.println(username.getAttribute("value"));
	}

	public void approveLogin2(int i, String st) {
		while (i == 0) {
			try {
				System.out.println(getActualUsername());
				System.out.println("***********");
				help();
				System.out.println("***--------***");
				i = 1;
			} catch (Exception e) {
				pageObjectDriver.navigate().refresh();
			}
		}
		i = 0;
	}

	public void approveLogin(int i, String st) {
		while (i == 0) {
			try {
				getActualUsername();
				i = 1;
			} catch (Exception e) {
				pageObjectDriver.navigate().refresh();
			}
		}
		i = 0;
		// compare requireName and actualName
		if (!getActualUsername().equals(st)) {

			errorInfo(info39);
		}
	}

	public void approveNewTicket() {
		waitForDisplay(20, valueOfNewTckt, info83);
		if (Integer.valueOf(valueOfNewTckt.getText()) < 0) {
			errorInfo(info4);
		}
	}

	public void clickOnValueOfNewTickets() {
		waitTryClick(20, valueOfNewTckt, info84);
	}

	public void dltAllViaDltBttn() {
		pageObjectDriver.navigate().refresh();
		waitTryClick(20, chckAllChckbx, info12);
		waitTryClick(20, dltBttn, info52);
		clickOnRunNowBttn();
		if (!waitForDisplaying(40, emptyMssg)) {
			pageObjectDriver.navigate().refresh();
			if (!waitForDisplaying(40, emptyMssg)) {
				errorInfo(info1);
			}
		}
	}

	public void checkAllTickets() {
		try {
			pause(500);
			chckAllChckbx.click();
		} catch (Exception e) {
			errorInfo(info12);
		}

	}

	public void clickOnDeleteBttn() {
		try {
			pause(500);
			dltBttn.click();
		} catch (Exception e) {

		}
	}

	public void clickOnResolveButton() {
		try {
			pause(500);
			rslvBttn.click();
		} catch (Exception e) {

		}
	}

	public void clickOnRunNowBttn() {
		waitTryClick(20, runNowBttn, info11);
		waitTryClick(20, yesBttn, info74);
		pause(2000);
	}

	public void verifyAllWindowsAreClosed(int r, int a) {
		if (r != a) {
			errorInfo(info10);
		}
	}

	public void approveEmptyTicketbox() {

		if (!emptyMssg.isDisplayed()) {
			dltAllViaDltBttn();
		}
	}

	public void setPause(int i) {
		pause(i);
	}

	public void approveEmptyTicketbox_2() {
		try {
			pause(3000);
			emptyMssg.getText();
		} catch (Exception e) {
			errorInfo(info25);
		}
	}

	public void approveSlovenianLanguage(String st) {

		String st2 = slovenianLngMark.getText();
		try {
			if (!st2.substring(0, st2.length() - 1).equals(st)) {
				errorInfo(info6);
			}
		} catch (Exception e) {
			errorInfo(info2);
		}
	}

}
