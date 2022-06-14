package com.vstl.flows;

import com.vstl.Generic.Pojo;
import com.vstl.PageFactory.LoginPage;

public class LoginLogoutFlow {

	private Pojo objPojo;
	private LoginPage objLoginPage;
	
	public LoginLogoutFlow(Pojo pojo) {
		this.objPojo=pojo;
		objLoginPage = new LoginPage(objPojo);
	}
	
	public void doLogin() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickGetStarted();
	}
}
