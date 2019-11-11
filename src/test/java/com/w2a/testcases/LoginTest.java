package com.w2a.testcases;

import java.util.Hashtable;

import com.w2a.base.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends Page {



	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException {

		HomePage home = new HomePage(driver);
		LoginPage lp = home.goToLogin();

		lp.doLogin(data.get("username"), data.get("password"));


		//Assert.fail("Login test failed");


	}

}

