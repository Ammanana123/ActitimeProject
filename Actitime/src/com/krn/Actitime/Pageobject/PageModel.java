package com.krn.Actitime.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModel {
	
	WebDriver driver;
	
	PageModel(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	public void setUsername(String mail){
		email.sendKeys(mail);
	}
	
	public void setPassword(String word) {
		pass.sendKeys(word);
		
	}
	
	public void clickLogin() {
		login.click();
	}
}
