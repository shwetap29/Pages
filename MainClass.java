package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainClass {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Shweta/eclipse-workspace/TestNg/Driver1/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
	}

	@Test(priority = 1)
	public void enter_RegisterDetails() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(5000);
		//******************
		RegisterClass RC = new RegisterClass(driver);
		RC.enterFirstname("Mangesh");
		RC.enterLastname("Kolhe");
		RC.enterReg_email__("TestUser@gmail.com");
		RC.enterReg_passwd__("Nagesh");
		RC.enterBirthday_day("16");
		RC.enterBirthday_month("May");
		RC.enterBirthday_year("1999");
		RC.enterGender();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(4000);
		driver.navigate().to("https://en-gb.facebook.com/");
		//******************
		//		driver.findElement(By.xpath("//a[contains(text(),\"let us\")]")).click();
		//		Thread.sleep(4000);
		//		driver.findElement(By.xpath("//a[contains(text(),\"Sign up\")]")).click();
		//		Thread.sleep(4000);
		//		driver.switchTo().activeElement().sendKeys("kolhenageh");
	}

	@Test(priority = 2)
	private void enterLoginDetails() {
		driver.navigate().to("https://en-gb.facebook.com/");
		LoginClass LC = new LoginClass(driver);
		LC.enterEmail("promagazine2020@gmail.com");
		LC.enterPassword("N@ge$h2019");
		LC.enterLogin();
		LC.waitExpl();
	}

	@Test(priority = 3)
	private void friends() {
		FindClass FF = new FindClass(driver);
		FF.enterFindFriend();
		FF.waitExplBirthday();
		FF.enterBirthdays();
		FF.waitExplMagazine();
		FF.enterMagazine();
	}

	@Test(priority = 4)
	private void magazine() {
		MagazineClass MC = new MagazineClass(driver);
		MC.waitExplProfile();
		MC.enterProfile();
		MC.waitExplEdit();
		MC.enterEdit();
		MC.waitExplWorkplace();
		MC.enterWorkplace();
		//		MC.waitExplAdd();
		//		MC.enterAdd("Pro Magazine pvt. ltd");

	}

	@AfterTest
	public void closeConnection() {
		driver.close();
		driver.quit();
	}
}

