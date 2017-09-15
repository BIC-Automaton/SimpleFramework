package com.acc.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acc.test.SimpleProject.Base;
import com.acc.test.interfaces.DemoQAHomePageInterface;

public class DemoQAHomePage extends ParentPage implements DemoQAHomePageInterface{
	
	public DemoQAHomePage(){
		//PageFactory.initElements(driver,DemoQAHomePage.class);
	}
	
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	public void clickRegistrationLink(){
		System.out.println(registrationLink);
		//driver.findElement(By.id("menu-item-374")).click();
		clickElement(registrationLink);
	}
}
