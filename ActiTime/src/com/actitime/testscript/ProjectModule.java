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
public class ProjectModule extends BaseClass {
@Test
	public void testCreateProject() throws InterruptedException, EncryptedDocumentException, IOException {
	Reporter.log("Create Project",true);
	FileLib f = new FileLib();
	String projectName = f.getExcelData("CreateProject", 1, 3);
	String projectDesc = f.getExcelData("CreateProject", 1, 4);
	HomePage h = new HomePage(driver);
	h.setTasksTab();
	TaskListPage t = new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewProjectBtn().click();
	t.getEnterProjectNameTbx().sendKeys(projectName);
	t.getNewSelectCustomerDD().click();
	t.getSelectBigBangCompany().click();
	t.getAddProjectDescTbx().sendKeys(projectDesc);
	t.getCreateProjectBtn().click();
	Thread.sleep(3000);
	String actualProjectText = t.getActualProjectFld().getText();
	Assert.assertEquals(actualProjectText, projectName);
}
}
