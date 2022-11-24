package com.HyUpr.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.HyUpr.ObjectRepo.HomePageRepo;
import com.HyUpr.ObjectRepo.LoginPageRepo;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();
	
@BeforeSuite(groups = {"smoke","regression"})
public void ConnToDB() {
	System.out.println("Connecting to database");
}

//@Parameters("Browser")
@BeforeTest(groups = {"smoke","regression"})

public void CrossBrowser() {
System.out.println("multiple browsers");
}
@BeforeClass(groups = {"smoke","regression"})
public void OpenBrowser() throws Throwable {
	String url=fLib.GetDataFromProperties("url");
	driver=new ChromeDriver();
	driver.get(url);
}
@BeforeMethod(groups = {"smoke","regression"})
public void Login() throws Throwable {
	String userName= fLib.GetDataFromProperties("username");
	String passWord= fLib.GetDataFromProperties("password");
	LoginPageRepo lp=new LoginPageRepo(driver);
	lp.loginPage(userName, passWord);
}
@AfterMethod(groups = {"smoke","regression"})
public void logout() {
	HomePageRepo hp = new HomePageRepo(driver);
	hp.Logout(driver);
}
@AfterClass(groups = {"smoke","regression"})
public void closeBrowser() {
	driver.close();
}
@AfterTest(groups = {"smoke","regression"})
public void ClosingCrossBrowser() {
	driver.quit();
}
@AfterSuite(groups = {"smoke","regression"})
public void ClosingConnWithDb() {
	System.out.println("closing the connection with the database");
}
}
