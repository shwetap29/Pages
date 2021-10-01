package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagazineClass {
	WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Edit Profile')]")
	WebElement profile;
	@FindBy(xpath = "//span[contains(text(),'Edit Your About Info')]")
	WebElement edit;
	@FindBy(xpath = "//span[contains(text(),'Add a workplace')]")
	WebElement worksplace;
	@FindBy(xpath = "//textarea[@id='jsc_c_21']")
	WebElement add;

	public MagazineClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterProfile() {
		profile.click();		
	}

	public void enterEdit() {
		edit.click();		
	}
	public void enterWorkplace() {
		worksplace.click();		
	}

	public void enterAdd(String arg234) {
		add.sendKeys(arg234);
	}

	public void waitExplProfile() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit Profile')]")));
		boolean status = element.isDisplayed();
		System.out.println("Edit Profile is it Visible: "+status);
	}
	public void waitExplEdit() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit Your About Info')]")));
		boolean status = element.isDisplayed();
		System.out.println("Edit Your About Info is it Visible: "+status);
	}
	public void waitExplWorkplace() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add a workplace')]")));
		boolean status = element.isDisplayed();
		System.out.println("Add a workplace is it Visible: "+status);
	}
	public void waitExplAdd() {
		WebDriverWait wait = new WebDriverWait(driver,86400000);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='jsc_c_21']")));
		boolean status = element.isDisplayed();
		System.out.println("Is it Visible: "+status);
	}
}

