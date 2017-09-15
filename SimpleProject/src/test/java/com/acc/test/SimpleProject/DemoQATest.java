package com.acc.test.SimpleProject;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acc.test.pages.DemoQAHomePage;
import com.acc.test.pages.RegistrationPage;

public class DemoQATest extends Base{
	DemoQAHomePage dqa;
	RegistrationPage rPage;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver = getDriver();
		driver.get("http://www.demoqa.com");
		Thread.sleep(5000);
		dqa = PageFactory.initElements(driver,DemoQAHomePage.class);
		rPage = PageFactory.initElements(driver,RegistrationPage.class);
		driver.manage().window().maximize();
	/*	driver = new ChromeDriver();
		driver.get("http://www.store.demoqa.com");*/
	}
	
	@Test
	public void testRegistrationForm() {
		dqa.clickRegistrationLink();
		rPage.fillRegistrationForm();
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}
