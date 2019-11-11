package com.w2a.pages;

import com.w2a.base.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Actions {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		// this initElements create all Webelements
		PageFactory.initElements(driver, this);

	}

	public ZohoAppPage doLogin(String username, String password) throws InterruptedException {

		type_XPATH("//input[@id='lid']", username);
		Thread.sleep(100);
		type_XPATH("//input[@id='pwd']", password);
		click_XPATH("//div[@id='signin_submit']");

		return new ZohoAppPage();
	}


	public void gotoSalesandMarketing(){


	}

	public void gotoFinance(){


	}


}
