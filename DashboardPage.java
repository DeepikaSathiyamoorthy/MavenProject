package com.vstl.PageFactory;

import org.openqa.selenium.By;

import com.vstl.Generic.Pojo;

public class DashboardPage {

	private Pojo objPojo;

	public DashboardPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By loc_lnkeBsConfigPortfolio = By.xpath("//div[text()='eBS config Portfolio']");
	By loc_lnkPremeraProduct = By.xpath("//*[text()='Premera Product']");

	public void clickeBsConfigPortfolio() {

		objPojo.getDriver().findElement(loc_lnkeBsConfigPortfolio).click();

	}

	public void clickPremeraProduct() {
		objPojo.getDriver().findElement(loc_lnkPremeraProduct).click();
	}

}
