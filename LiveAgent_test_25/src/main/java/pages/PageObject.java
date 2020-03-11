package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	protected WebDriver pageObjectDriver;

	public PageObject(WebDriver dri) {
		this.pageObjectDriver = dri;
		PageFactory.initElements(dri, this);
	}

	public void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitTryClick(int l, WebElement we, String info) {
		pause(600);
		int i = 0;
		while (i < l) {
			try {
				pause(400);
				we.click();
				i = l + 1;
			} catch (Exception e) {
				i++;
				if (i == l) {
					errorInfo(info);
				}
			}
		}
	}

	public void waitTryClickViaJS(int l, WebElement we, String info) {
		pause(1600);
		int i = 0;
		while (i < l) {
			try {
				pause(400);
				clickViaJavaScript(we);
				i = l + 1;
			} catch (Exception e) {
				i++;
				if (i == l) {
					errorInfo(info);
				}
			}
		}
	}

	public void refreshWebPage() {
		pageObjectDriver.navigate().refresh();
	}

	public void waitTryType(int l, WebElement we, String vT, String info) {
		int i = 0;
		while (i < l) {
			try {
				pause(400);
				// we.click();
				we.sendKeys(vT);
				i = l + 1;
			} catch (Exception e) {
				i++;
				if (i == l) {
					errorInfo(info);
				}
			}
		}
	}

	public boolean waitForDisplaying(int t, WebElement wE) {
		boolean r = false;
		int i = 0;
		while (i < t) {
			try {
				pause(400);
				if (wE.isDisplayed()) {
					i = t + 1;
					r = true;
				} else {
					i++;
				}
			} catch (Exception e) {
				i++;
			}
		}
		return r;
	}

	public void waitForDisplay(int t, WebElement wE, String info) {
		int i = 0;
		int r = 0;
		while (i < t) {
			try {
				pause(400);
				if (wE.isDisplayed()) {
					i = t + 1;
					r = 1;
				}
			} catch (Exception e) {
				i++;
				if (i >= t) {
					r = 0;
				}
			}
		}
		if (r == 0) {
			errorInfo(info);
		}
	}

	public void hoverOverWebElement(WebElement we, String info) {
		pause(1000);
		Actions builder = new Actions(pageObjectDriver);
		builder.moveToElement(we).build().perform();
	}

	public String waitTry(int l, WebElement we, String info) {
		String res = "";
		int i = 0;
		while (i < l) {
			try {
				pause(500);
				res = we.getText();
				i = l + 1;
			} catch (Exception e) {
				i++;
				if (i == l) {
					errorInfo(info);
				}
			}
		}
		return res;
	}

	public void errorInfo(String info) {
		System.out.println(info);
		pageObjectDriver.close();
		WebElement we = pageObjectDriver.findElement(By.xpath("error"));
		we.click();
	}

	public void clickViaJavaScript(WebElement we) {
		JavascriptExecutor jse = (JavascriptExecutor) pageObjectDriver;
		jse.executeScript("arguments[0].click();", we);
	}

	public void hoverAndClick(WebElement wE) {

	}

	public void scrollDownViaJavaScript() {
		JavascriptExecutor js = (JavascriptExecutor) pageObjectDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollDownViaJavaScript2() {
		JavascriptExecutor js = (JavascriptExecutor) pageObjectDriver;
		js.executeScript("window.scrollTo(0, 1000)");
	}

	public void scrollUpToWebelementViaJavaScript(WebElement we) {
		JavascriptExecutor js = (JavascriptExecutor) pageObjectDriver;
		js.executeScript("arguments[0].scrollIntoView();", we);
	}
	
	public void wPL(int t) {
		JavascriptExecutor js = (JavascriptExecutor) pageObjectDriver;
		for(int i=0; i<t; i++) {
			pause(200);
			System.out.println(js.executeScript("return document.readyState;").toString());
			
		}
	}

	public void waitPageLoad(int t, String info) {
		JavascriptExecutor js = (JavascriptExecutor) pageObjectDriver;
		int i = 0;
		int r = 0;
		while (i < t) {
			try {
				pause(100);
				if (js.executeScript("return document.readyState").equals("complete")) {
					i = t + 1;
					r = 1;
				}
			} catch (Exception e) {
				i++;
				if (i >= t) {
					r = 0;
				}
			}
		}
		if (r == 0) {
			errorInfo(info);
		}
	}

	public void waitPageLoadWithRefresh(int t, int c, String info, WebElement we) {
		
		int i = 0;
		int r = 0;
		int k = 0;
		while (i < t) {
			try {
				pause(400);
				if (we.isDisplayed()) {
					i = t + 1;
					r = 1;
				}
			} catch (Exception e) {
				i++;
				if (i >= t) {
					// refresh
					refreshWebPage();
					k++;
					i = 0;
				}
				if (k >= c) {
					r = 0;
					i = t + 1;
				}
			}
		}
		if (r == 0) {
			errorInfo(info);
		}
	}

}
