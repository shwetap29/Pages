package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClass {
	WebDriver driver;

	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "pass")
	WebElement pass;
	@FindBy(name = "login")
	WebElement login;

	public LoginClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(CharSequence arg8) {
		email.sendKeys(arg8);		
	}

	public void enterPassword(CharSequence arg9) {
		pass.sendKeys(arg9);
	}

	public void enterLogin() {
		login.click();		
	}

	public void waitExpl() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Find Friends')]")));
		boolean status = element.isDisplayed();
		System.out.println("Find Friends is it Visible: "+status);
	}
}

