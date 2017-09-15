package com.acc.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage{
	
	@FindBy(id="name_3_firstname")
	private WebElement firstName_textBox;
	
	@FindBy(id="name_3_lastname")
	private WebElement lastName_textBox;
	
	@FindBy(xpath="//input[@value = 'single']")
	private WebElement maritalStatus_single_radio;
	
	@FindBy(xpath="//input[@value = 'married']")
	private WebElement maritalStatus_married_radio;
	
	@FindBy(xpath="//input[@value = 'divorced']")
	private WebElement maritalStatus_divorced_radio;
	
	@FindBy(xpath="//input[@value = 'dance']")
	private WebElement hobby_dance_checkBox;
	
	@FindBy(xpath="//input[@value = 'reading']")
	private WebElement hobby_reading_checkBox;
	
	@FindBy(xpath="//input[@value = 'cricket ']")
	private WebElement hobby_cricket_checkBox;
	
	@FindBy(id="dropdown_7")
	private WebElement country_dropdown;
	
	@FindBy(id="mm_date_8")
	private WebElement dob_month_dropDown;
	
	@FindBy(id="dd_date_8")
	private WebElement dob_date_dropDown;
	
	@FindBy(id="yy_date_8")
	private WebElement dob_year_dropDown;
	
	@FindBy(id="phone_9")
	private WebElement phone_textBox;
	
	@FindBy(id="username")
	private WebElement username_textBox;
	
	@FindBy(id="email_1")
	private WebElement email_textBox;
	
	@FindBy(id="description")
	private WebElement description_textArea;
	
	@FindBy(id="password_2")
	private WebElement password_textBox;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement confirm_password_textBox;
	
	@FindBy(name="pie_submit")
	private WebElement submit_button;
	
	public void fillRegistrationForm(){
		System.out.println(firstName_textBox);
		enterText(firstName_textBox, "Test");
		enterText(lastName_textBox, "Test");
		selectItemFromDropDownByText(country_dropdown, "India");
		selectItemFromDropDownByText(dob_date_dropDown, "1");
		selectItemFromDropDownByText(dob_month_dropDown, "1");
		selectItemFromDropDownByText(dob_year_dropDown, "1990");
		clickElement(maritalStatus_single_radio);
		clickElement(hobby_cricket_checkBox);
		
		enterText(phone_textBox, "9999999999");
		enterText(username_textBox, "Test");
		enterText(email_textBox, "Test@Test.com");
		enterText(description_textArea, "Test");
		enterText(password_textBox, "TestTest@1wfnbiowefnkjwfn");
		enterText(confirm_password_textBox, "TestTest@1wfnbiowefnkjwfn");
		
		clickElement(submit_button);
	}
}
