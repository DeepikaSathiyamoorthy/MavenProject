package com.vstl.flows;

import com.vstl.Generic.Pojo;
import com.vstl.PageFactory.DesignPage;

public class DesignFlow {

	private Pojo objPojo;
	private DesignPage objDesignPage;
	
	public DesignFlow(Pojo pojo) {
		this.objPojo=pojo;
		objDesignPage = new DesignPage(objPojo);
	}
	
	public void selectDesignType() {
		
		objDesignPage.clickDesignSHC();
		objDesignPage.verifyDesignTextisDisplayedOnDesignPage();
		objDesignPage.selectDesignTypeAnchor();
		objDesignPage.selectDesignTypeCollateral();
		objDesignPage.selectDesignTypeMasterList();
		objDesignPage.selectDesignTypeView();
	}
	
	
}
