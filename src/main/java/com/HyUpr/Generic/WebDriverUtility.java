package com.HyUpr.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void mouseHover(WebDriver driver, WebElement Element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(Element).perform();
	}
	public void selectByValue(WebElement Element,String value) {
		Select select=new Select(Element);
		select.selectByValue(value);
	}
	
}
