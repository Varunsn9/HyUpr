package com.HyUpr.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HyUpr.Generic.BaseClass;

public class OrganizationRepo extends BaseClass{

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement Crtorg;
	@FindBy(name="accountname")
	private WebElement OrgName;
	@FindBy(name="industry")
	private WebElement industry;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOrg;
	
	
	public WebElement getOrgName() {
		return OrgName;
	}
	public WebElement getIndustry() {
		return industry;
	}
	public WebElement getSaveOrg() {
		return saveOrg;
	}
	public WebElement getCrtorg() {
		return Crtorg;
	}
	public OrganizationRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void CrtOrg() {
		Crtorg.click();
	}
	public void orgData(String OrganizationName,String Industry) {
		OrgName.sendKeys(OrganizationName);
		wLib.selectByValue(industry, Industry);
		
	}
	
}
