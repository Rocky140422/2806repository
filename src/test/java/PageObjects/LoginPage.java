package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	@FindBy(xpath="//input[@id='Email']") private WebElement EmailTextBox;
	@FindBy(xpath="//input[@id='Password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement logInBtn;
	@FindBy(xpath="(//a[@class='nav-link'])[2]") private WebElement logoutBtn;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void setUserName(String uName) {
		EmailTextBox.clear();
		EmailTextBox.sendKeys(uName);
	}
	
	public void setPassword(String pwd) {
		EmailTextBox.clear();
		EmailTextBox.sendKeys(pwd);
	}
	
	public void clickLogin() {
		logInBtn.click();
	}
	
	public void clickLogout() {
		logoutBtn.click();
	}
}
