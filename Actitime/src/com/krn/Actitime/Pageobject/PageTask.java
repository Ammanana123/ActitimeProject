package com.krn.Actitime.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTask {
	public WebDriver driver;
	
	
	public PageTask(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks")
	@CacheLookup
	WebElement clktasks;
	
	@FindBy(xpath="//div[text()='Add New']")
	@CacheLookup
	WebElement clkAddNew;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	@CacheLookup
	WebElement clkcreateNewCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	@CacheLookup
	WebElement txtCustomer;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	@CacheLookup
	WebElement clkdropdown;
	
	@FindBy(xpath="(//div[text()='Big Bang Company'])[7]")
	@CacheLookup
	WebElement clkcompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	@CacheLookup
	WebElement clkcust;
	
	public void setTasks() {
		clktasks.click();
	}
	public void setAddNew() {
		clkAddNew.click();
	}
	public void setAddcustomer() {
		clkcreateNewCustomer.click();
	}
	
	public void typeCustomer() {
		txtCustomer.sendKeys(" This is to create new testcase");
	}
	
	public void typeDescription() {
		txtDescription.sendKeys("create new test");
	}
	
	public void setDropdown() {
		clkdropdown.click();
	}
	
	public void setCompany(){
		clkcompany.click();
	}
	
	public void setCustomer() {
		clkcust.click();
	}
	
}
