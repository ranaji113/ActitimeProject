package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescTbx;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomerFld;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectNameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement newSelectCustomerDD;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")
	private WebElement selectBigBangCompany;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProjectFld;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	public WebElement getEnterCustomerDescTbx() {
		return enterCustomerDescTbx;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerFld() {
		return actualCustomerFld;
	}

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}

	public WebElement getEnterProjectNameTbx() {
		return enterProjectNameTbx;
	}

	public WebElement getNewSelectCustomerDD() {
		return newSelectCustomerDD;
	}

	public WebElement getSelectBigBangCompany() {
		return selectBigBangCompany;
	}

	public WebElement getAddProjectDescTbx() {
		return addProjectDescTbx;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getActualProjectFld() {
		return actualProjectFld;
	}
	

}







