package com.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterClass {
	WebDriver driver;

	@FindBy(name = "firstname")
	WebElement firstname;
	@FindBy(name = "lastname")
	WebElement lastname;
	@FindBy(name = "reg_email__")
	WebElement reg_email__;
	@FindBy(name = "reg_passwd__")
	WebElement reg_passwd__;
	@FindBy(name = "birthday_day")
	WebElement birthday_day;
	@FindBy(name = "birthday_month")
	WebElement birthday_month;
	@FindBy(name = "birthday_year")
	WebElement birthday_year;
	@FindBy(xpath = "//input[@value='2']")
	WebElement gender;

	public RegisterClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterFirstname(String arg1) {
		firstname.sendKeys(arg1);
	}

	public void enterLastname(String arg2) {
		lastname.sendKeys(arg2);
	}

	public void enterReg_email__(String arg3) {
		reg_email__.sendKeys(arg3);
	}
	public void enterReg_passwd__(String arg4) {
		reg_passwd__.sendKeys(arg4);
	}

	public void enterBirthday_day(String arg1) {
		birthday_day.sendKeys(arg1);
	}

	public void enterBirthday_month(String arg1) {
		birthday_month.sendKeys(arg1);
	}

	public void enterBirthday_year(String arg1) {
		birthday_year.sendKeys(arg1);
	}

	public void enterGender(){
		gender.click();
	}
}

