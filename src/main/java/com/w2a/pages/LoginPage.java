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

        type_XPATH("//*[@id='login_id']", username);
        clickOnNextBtn();
        type_XPATH("//*[@id='password']", password);
        clickOnNextBtn();

		return new ZohoAppPage();
	}


    private void clickOnNextBtn() throws InterruptedException {
        click_XPATH("//*[@id='nextbtn']");
        Thread.sleep(100);
    }



	public void gotoSalesandMarketing(){


	}

	public void gotoFinance(){


	}


}
