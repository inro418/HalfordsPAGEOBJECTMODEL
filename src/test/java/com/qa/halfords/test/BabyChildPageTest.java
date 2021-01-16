package com.qa.halfords.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.halfords.base.Testbase;
import com.qa.halfords.pages.BabyChildPage;
import com.qa.halfords.pages.HomePage;
import com.qa.halfords.pages.LoginPage;


public class BabyChildPageTest extends Testbase{
 LoginPage loginPage;  
 HomePage  homePage; 
 BabyChildPage babyChildPage;
 
	//create constructor of SignInPageTest
	public BabyChildPageTest(){
		
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		//create objects of SignInPage
		loginPage = new LoginPage();  
		homePage = new HomePage();
		babyChildPage = new BabyChildPage();
	}
	
	@Test(priority = 1)
	public void BabyChildTest(){
		babyChildPage.clickOnBabyChildPage();
	}
	
	@Test(priority = 2)    
	public void loginPageTest(){
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));  
		
	}
	
	@AfterMethod
	public void tearDown(){ 
		driver.quit(); 
	}
	
}