package com.Actitime.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.krn.Actitime.Pageobject.PageObjectActitime;
import com.krn.Actitime.base.BaseClass;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test(priority=1)
	public void testLogin() throws InterruptedException  {
	logger.info("****TC_LoginTest_001 successfuly******");
		driver.get(configProp.getProperty("BaseURL"));
		PageObjectActitime poa= new PageObjectActitime(driver);
		logger.info("***** Starting TC_LoginTest_001******");
		poa.setUser(configProp.getProperty("userLogin"));
		poa.setPassword(configProp.getProperty("userpass"));
		poa.clickBtn();
			}
	
@Test(priority=2)
	public void getText() throws InterruptedException, IOException {
	logger.info("**** Validating Title*****");
		String actualtext=driver.findElement(By.xpath("(//div[text()='Switch to actiPLANS'])[1]")).getText();
		logger.warn("***** gettext method is uncsuccessful*****");
		captureScreen(driver,"testLogin");
		Assert.assertEquals(actualtext, "Switch to actiPLANS");
	}
@Test(priority=3)
public void logout() {
	logger.info("**** clicks on logout*****");
	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
}
}
