package com.vstl.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.vstl.Generic.Pojo;

public class LoginPage {

	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	By loc_inpUsername = By.xpath("//input[@id='UserName']");
	By loc_inpPassWord = By.xpath("//input[@id='Password']");
	By loc_btnGetStarted = By.xpath("//button[text()='Get Started']");

	public void setUserName(String strUserName) {

		//objPojo.getDriver().findElement(inpUsername).sendKeys(strUserName);
		//objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpUsername, strUserName);
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpUsername, strUserName));	
	}

	public void setPassword(String strPassword) {

		//objPojo.getDriver().findElement(loc_inpPassWord).sendKeys(strPassword);
		//objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpPassWord, strPassword);
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpPassWord, strPassword));
	}

	public void clickGetStarted() {

		objPojo.getDriver().findElement(loc_btnGetStarted).click();
	}

	public void randomname() {
		System.out.println(objPojo.getObjUtilities().getRandomName(6));
	}
	
}
