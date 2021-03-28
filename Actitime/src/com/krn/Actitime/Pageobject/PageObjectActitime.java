package com.krn.Actitime.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectActitime {
	
	public WebDriver driver;
	
	
	public PageObjectActitime(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txtuser;
	
	@FindBy(name="pwd")
	@CacheLookup
	WebElement txtpwd;
	
	@FindBy(id="loginButton")
	@CacheLookup
	WebElement Btnlogin;
	
	public  void setUser(String user) {
		txtuser.clear();
		txtuser.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		txtpwd.clear();
		txtpwd.sendKeys(pass);
	}
	
	public void clickBtn() {
		Btnlogin.click();
	}
	
}
