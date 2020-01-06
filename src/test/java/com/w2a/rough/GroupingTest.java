package com.w2a.rough;

import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"perfomance"})
    public void feature1(){
        System.out.println("Inside feature 1");
    }

    @Test(groups = {"regresion"})
    public void feature2(){
        System.out.println("Inside feature 2");
    }

    @Test(groups = {"perfomance,regresion"})
    public void feature3(){
        System.out.println("Inside feature 3");
    }
}
