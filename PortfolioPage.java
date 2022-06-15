package com.vstl.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.vstl.Generic.Pojo;

public class PortfolioPage {

	private Pojo objPojo;

	public  PortfolioPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By loc_txtPortfolio = By.xpath("//div[text()='Portfolio']");
	
	public String getPortfolioTextOnDashBoardPortfolioPage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtPortfolio).getText().trim();
		return strReturnValue;
	}

	public void verifyPortfolioTextisDisplayedOnDashBoardPage() {

		/* if (this.getPortfolioTextOnDashBoardPortfolioPage().equals("Portfolio")) {
			System.out.println("Text Portfolio is Displayed");
		} else {
			System.out.println("Text Portfolio is Not Displayed");
		} */
		Assert.assertTrue(this.getPortfolioTextOnDashBoardPortfolioPage().equals("Portfolio"));

	}


}
