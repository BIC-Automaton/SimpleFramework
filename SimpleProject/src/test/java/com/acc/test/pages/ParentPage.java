package com.acc.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acc.test.SimpleProject.Base;

public class ParentPage extends Base{
	
	public void clickElement(WebElement element){
		try{
			element.click();
			Thread.sleep(5000);
		}catch(TimeoutException e){
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterText(WebElement element, String text){
		try{
			element.clear();
			element.sendKeys(text);
		}catch(TimeoutException e){
			
		}
	}
	
	public String getText(WebElement element){
		try{
			return element.getText();
		}catch(TimeoutException e){
			return null;
		}
	}
	
	/*public void waitForElement(WebElement element, long timeOutInSeconds){
		try{
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(TimeoutException e){
			
		}
	}*/
	
	public void selectItemFromDropDownByValue(WebElement dropDown, String item){
		List<WebElement> options = dropDown.findElements(By.tagName("option"));
		for(WebElement option:options){
			if(item.equals(option.getAttribute("value"))){
				option.click();
				break;
			}
		}
	}
	
	public void selectItemFromDropDownByText(WebElement dropDown, String item){
		List<WebElement> options = dropDown.findElements(By.tagName("option"));
		for(WebElement option:options){
			if(item.equals(option.getText())){
				option.click();
				break;
			}
		}
	}
}
