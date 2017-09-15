package com.acc.test.SimpleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Base {
    public static WebDriver driver = null;
    
	public WebDriver getDriver(){
    	System.setProperty("webdriver.chrome.driver", "C:/Users/BICWS0202/Desktop/chromedriver.exe");
    	driver = new ChromeDriver();
    	return driver;
    }
}
