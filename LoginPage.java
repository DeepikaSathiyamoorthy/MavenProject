package com.vstl.PageFactory;

import org.openqa.selenium.By;

import com.vstl.Generic.Pojo;

public class LoginPage {

	private Pojo objPojo;
	
	public LoginPage(Pojo pojo) {
		this.objPojo=pojo;
	}
	
	By inpUsername = By.xpath("//input[@id='UserName']");
	By inpPassWord = By.xpath("//input[@id='Password']");
	By btnGetStarted = By.xpath("//button[text()='Get Started']");

	public void setUserName(String strUserName) {

		objPojo.getDriver().findElement(inpUsername).sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {

		objPojo.getDriver().findElement(inpPassWord).sendKeys(strPassword);
	}

	public void clickGetStarted() {

		objPojo.getDriver().findElement(btnGetStarted).click();
	}

}
