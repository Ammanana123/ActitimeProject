package com.Actitime.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.krn.Actitime.Pageobject.PageObjectActitime;
import com.krn.Actitime.Pageobject.PageTask;
import com.krn.Actitime.base.BaseClass;

public class TC_CreateTask_003 extends BaseClass {

	@Test(priority=1)
	public void createTask() throws InterruptedException {
		
		logger.info("****Starting TC_CreateTask_003 successfuly******");
		driver.get(configProp.getProperty("BaseURL"));
		PageObjectActitime poa= new PageObjectActitime(driver);
		logger.info("***** Validating login details of TC_CreateTask_003******");
		poa.setUser(configProp.getProperty("userLogin"));
		poa.setPassword(configProp.getProperty("userpass"));
		poa.clickBtn();
	
		Thread.sleep(3000);
	}
	
	
	@Test(priority=2)
		public void getText() throws InterruptedException {
			logger.info("**** Validating Title*****");
				String actualtext=driver.findElement(By.xpath("(//div[text()='Switch to actiPLANS'])[1]")).getText();
				logger.warn("***** gettext method is uncsuccessful*****");
				Assert.assertEquals(actualtext,"Switch to actiPLANS");
		
		logger.info("**** Creating a new customer Task****");
		PageTask pt= new PageTask(driver);
		pt.setTasks();
		pt.setAddNew();
		pt.setAddcustomer();
		pt.typeCustomer();
		pt.typeDescription();
		pt.setDropdown();
		Thread.sleep(2000);
		pt.setCompany();
		pt.setCustomer();
	}

}
