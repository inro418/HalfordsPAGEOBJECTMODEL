package com.qa.halfords.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.halfords.base.Testbase;
import com.qa.halfords.pages.BabyChildPage;
import com.qa.halfords.pages.HomePage;
import com.qa.halfords.pages.LoginPage;


public class LoginPageTest extends Testbase{
 LoginPage loginPage;  
 HomePage  homePage; 
 BabyChildPage babyChildPage;
 
 
	//create constructor of SignInPageTest
	public LoginPageTest(){
		
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
	public void LoginPageTitleTest(){  
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Halfords - Bikes, Cycling, Tyres, MOT's, Car Parts, Dash Cams and More");   
	}
	
	@Test(priority = 2)
	public void HalfordslogoImageTest(){
	 loginPage.validateHalfordslogoImage();
		Assert.assertTrue(true);   	
	}
	
	@Test(priority = 3)    
	public void signInPageTest(){
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));   
		
	}
	
	@AfterMethod
	public void tearDown(){ 
		driver.quit(); 
	}
	
}
