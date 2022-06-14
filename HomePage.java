package com.vstl.PageFactory;

import org.openqa.selenium.By;

import com.vstl.Generic.Pojo;

public class HomePage {

	private Pojo objPojo;

	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By loc_txtHome = By.xpath("//div[text()='Home']");
	
	public String getHomeTextOnHomePage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtHome).getText().trim();
		return strReturnValue;
	}

	public void verifyHomeTextisDisplayed() {

		if (this.getHomeTextOnHomePage().equals("Home")) {
			System.out.println("Text HOME is Displayed");
		} else {
			System.out.println("Text HOME is Not Displayed");
		}

	}

	
}
