package com.HyUpr.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.HyUpr.Generic.WebDriverUtility;

public class HomePageRepo {

	@FindBy(linkText = "Sign Out")
	private WebElement Signout;
	@FindBy(xpath="//span[@class='userName']/../../td[2]" )
	private WebElement adminImg;
	@FindBy(linkText="Organizations" )
	private WebElement organizationLink;
	@FindBy(linkText="Contacts" )
	private WebElement contactsLink;

	
	
	public WebElement getSignout() {
		return Signout;
	}
	public WebElement getAdminImg() {
		return adminImg;
	}
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	public WebElement getContactsLink() {
		return contactsLink;
	}
	public HomePageRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Logout(WebDriver driver) {
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.mouseHover(driver, adminImg);
		Signout.click();
	}
	public void Organization() {
		organizationLink.click();
	}
	public void Contacts() {
		contactsLink.click();
	}
}
