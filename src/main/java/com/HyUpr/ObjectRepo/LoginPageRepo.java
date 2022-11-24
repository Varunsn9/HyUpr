package com.HyUpr.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo {

	@FindBy(name="user_name")
	private WebElement userNameTb;

	@FindBy(name="user_password")
	private WebElement passWordTb;

	@FindBy(id="submitButton")
	private WebElement submitButton;

	public WebElement getUserNameTb() {
		return userNameTb;
	}

	public WebElement getPassWordTb() {
		return passWordTb;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public LoginPageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginPage(String username, String password) {
		userNameTb.sendKeys(username);
		passWordTb.sendKeys(password);
		submitButton.click();
	}
	
	
}
