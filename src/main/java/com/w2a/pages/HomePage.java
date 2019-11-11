package com.w2a.pages;

import com.w2a.base.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Actions {


    WebDriver webDriver;

    public HomePage(WebDriver driver) {
        this.webDriver = driver;
        setWebDriver(this.webDriver);
    }


    public void goToCustomers() {

        webDriver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();

    }

	public void goToSupport(){

    }

    public void goToContactSales() {

    }

	public LoginPage goToLogin(){

        click_XPATH("//a[@class='zh-login']");

        return new LoginPage(webDriver);
    }

    public void goToFreeSignUp() {

    }

    public void goToEnglish() {

    }

	public void validateFooterLinks(){


    }
}

