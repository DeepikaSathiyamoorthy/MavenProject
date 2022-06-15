package com.vstl.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vstl.Generic.Pojo;

public class DesignPage {
	private Pojo objPojo;

	public DesignPage(Pojo pojo) {
		this.objPojo = pojo;
	}

	By loc_lnkDesignSHC = By.xpath("//a[@id='design']");
	By loc_drpDesignType = By.id("documentDesignTypeDDL");
	By loc_lnkFolder = By.xpath("//a[text()='Folder']");
	By loc_txtDesign = By.xpath("//div[text()='Design']");

	public void clickDesignSHC() {

		objPojo.getDriver().findElement(loc_lnkDesignSHC).click();
	}

	public void selectDesignTypeAnchor() {

		Select designType = new Select(objPojo.getDriver().findElement(loc_drpDesignType));
		designType.selectByVisibleText("Anchor");
	}

	public void selectDesignTypeMasterList() {

		Select designType = new Select(objPojo.getDriver().findElement(loc_drpDesignType));
		designType.selectByVisibleText("MasterList");
	}

	public void selectDesignTypeCollateral() {

		Select designType = new Select(objPojo.getDriver().findElement(loc_drpDesignType));
		designType.selectByVisibleText("Collateral");
	}

	public void selectDesignTypeView() {

		Select designType = new Select(objPojo.getDriver().findElement(loc_drpDesignType));
		designType.selectByVisibleText("View");
	}

	public void clickFolderonDesign() {
		objPojo.getDriver().findElement(loc_lnkFolder).click();
	}

	public String getDesignTextOnDesignPage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtDesign).getText().trim();
		return strReturnValue;
	}

	public void verifyDesignTextisDisplayedOnDesignPage() {

		/* if (this.getDesignTextOnDesignPage().equals("Design")) {
			System.out.println("Text Design is Displayed");
		} else {
			System.out.println("Text Design is Not Displayed");
		} */
		Assert.assertTrue(this.getDesignTextOnDesignPage().equals("Design"));

	}
}
