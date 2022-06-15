package com.vstl.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vstl.Generic.BaseTest;
import com.vstl.PageFactory.HomePage;
import com.vstl.PageFactory.PortfolioPage;
import com.vstl.flows.DashboardFlow;
import com.vstl.flows.DesignFlow;
import com.vstl.flows.LoginLogoutFlow;

public class LoginLogoutTest extends BaseTest {

	
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;
	private DashboardFlow objDashboardFlow;
	private PortfolioPage objPortfolioPage;
	private DesignFlow objDesignFlow;

	public void initializeWebPages() {
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
		objDashboardFlow = new DashboardFlow(this);
		objPortfolioPage = new PortfolioPage(this);
		objDesignFlow = new DesignFlow(this);
	}

	@BeforeClass
	public void initializeWebEnvironment() {

		this.initializeWebPages();
		this.invokeApplication();
	}

	@AfterClass
	public void tearDownEnvironments() {
		this.tearDown();
	}

	@Test
	public void TCID_001_VerifyHomePageDisplayed() {

		objLoginLogoutFlow.doLogin(); 
		objHomePage.verifyHomeTextisDisplayed();
	}

	@Test
	public void TCID_002_VerifyPortfolioPageIsDisplayed() {

		objDashboardFlow.openeBSConfigportfolio();
		objPortfolioPage.verifyPortfolioTextisDisplayedOnDashBoardPage();
		this.goBackToPreviousPage(); 
		this.setImplicitWait(20000);
		objDashboardFlow.openPremeraProduct();
		objPortfolioPage.verifyPortfolioTextisDisplayedOnDashBoardPage();
		this.goBackToPreviousPage(); 

	}
	
	@Test
	public void TCID_003_VerifyDesignPageIsDisplayed() {
		
		this.setImplicitWait(5000);
		objDesignFlow.selectDesignType();
	}
}
