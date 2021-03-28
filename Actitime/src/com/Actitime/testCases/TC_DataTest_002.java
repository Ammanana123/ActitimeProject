package com.Actitime.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.krn.Actitime.Pageobject.PageObjectActitime;
import com.krn.Actitime.base.BaseClass;
import com.krn.Actitime.base.XLUtils;

public class TC_DataTest_002 extends BaseClass {
	@Test(dataProvider="Logindata")
	public void getCellData(String user, String pass,String exp) throws InterruptedException{
		logger.info("****TC_DataTest_002 successfuly******");
		driver.get(configProp.getProperty("BaseURL"));
		PageObjectActitime poa= new PageObjectActitime(driver);
		poa.setUser(user);
		poa.setPassword(pass);
		poa.clickBtn();
		Thread.sleep(3000);
	}
	@Test
		public void getText() {
			logger.info("**** Validating Title*****");
				String actualtext=driver.findElement(By.xpath("(//div[text()='Switch to actiPLANS'])[1]")).getText();
				logger.warn("***** gettext method is uncsuccessful*****");
				Assert.assertEquals(actualtext,"Switch to actiPLANS");
	}
	
	@Test
	public void logout() {
		logger.info("**** clicks on logout*****");
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

@DataProvider(name="Logindata")
public String [][]testData() throws IOException{
	
	String path=System.getProperty("user.dir")+".\\testdata\\utilititytesting.xlsx";
	int totalrows=XLUtils.getRowCount(path, "Sheet1");
	int totalcells=XLUtils.getCellCount(path, "Sheet1", 1);
	String Logindata[][] =new String[totalrows][totalcells];
	for(int i=1; i<=totalrows;i++) {
		for(int j=0;j<totalcells;j++){
			Logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			
		}
	}
	return Logindata;
}

}

