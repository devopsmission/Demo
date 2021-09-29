package org.eBanking.TestCase;


import org.testng.asserts.*;
import junit.framework.Assert;

import org.eBanjing.pageObject.LoginPage;
import org.testng.annotations.Test;

public class TS_Login_Test extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get(url);
		
		LoginPage lg=new LoginPage(driver);
		String title=lg.getTitle();
		if(title.equalsIgnoreCase("Gtpl Bank")) 
			Assert.assertTrue(true);		
		else 
			Assert.assertTrue(false);
				
		lg.setUserName(userName);
		lg.setPassword(password);
		lg.clickLogin();
		
		
	}

}
