package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPomPages {

	// Declaration
	@FindBy(xpath = "//h")
	private WebElement header;

	@FindBy(id = "email")
	private WebElement un;

	@FindBy(id = "pass")
	private WebElement psw;

	@FindBy(name = "login")
	private WebElement loginbtn;

	// Initialization
	public FBLoginPomPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getHeader() {
		return header;
	}

	public WebElement getUn() {
		return un;
	}

	public WebElement getPsw() {
		return psw;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}