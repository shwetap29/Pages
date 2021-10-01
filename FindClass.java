package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindClass {
	WebDriver driver;

	@FindBy(xpath="//span[contains(text(),'Find Friends')]")
	WebElement findFriend;
	@FindBy(xpath = "//span[contains(text(),'Birthdays')]")
	WebElement birthdays;
	@FindBy(xpath = "//span[contains(text(),'प्रो डिजिटल')]")
	WebElement magazine;

	public FindClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterFindFriend() {
		findFriend.click();		
	}

	public void enterBirthdays() {
		birthdays.click();
	}

	public void enterMagazine() {
		magazine.click();
	}

	public void waitExplBirthday() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Birthdays')]")));
		boolean status = element.isDisplayed();
		System.out.println("Birthday is it Visible: "+status);	
	}

	public void waitExplMagazine() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'प्रो डिजिटल')]")));
		boolean status = element.isDisplayed();
		System.out.println("Pro Magazine is it Visible: "+status);
	}
}
	

