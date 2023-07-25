package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer",true);
	FileLib f = new FileLib();
	String custName = f.getExcelData("CreateCustomer", 1, 3);
	String custDescription = f.getExcelData("CreateCustomer", 1, 4);
	HomePage h = new HomePage(driver);
	h.setTasksTab();
	TaskListPage t = new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomerBtn().click();
	t.getEnterCustomerNameTbx().sendKeys(custName);
	t.getEnterCustomerDescTbx().sendKeys(custDescription);
	t.getSelectCustomerDD().click();
	t.getBigBangCompany().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(3000);
	String actualText=t.getActualCustomerFld().getText();
	Assert.assertEquals(actualText, custName);
	}

}
