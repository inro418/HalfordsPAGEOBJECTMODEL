package com.qa.halfords.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.halfords.base.Testbase;
import com.qa.halfords.pages.HomePage;
import com.qa.halfords.pages.LoginPage;

public class HomePageTest extends Testbase{
 LoginPage loginPage;  
 HomePage homePage;
 
	//create constructor of SignInPageTest
	public HomePageTest(){
		
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		initialisation();
		//create objects of SignInPage

		loginPage = new LoginPage();  
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@Test (priority = 1)
	public void verifyHomePageTitle(){
		String Title =  homePage.verifyHomePagePageTitle();
		Assert.assertEquals(Title, "Login or Register | Halfords UK");   
	}
	
	@Test (priority = 2)
	public void verifyHiPeter(){
		homePage.verifyHiPeter();
		Assert.assertTrue(true);    
	}
	
	@Test(priority = 3)
	public void verifyHalfordslogoImage(){
		 homePage.verifyHalfordslogoImage();
		//Assert.assertTrue(true);
	}   
	
	@AfterMethod
	public void tearDown(){ 
		driver.quit(); 
	}
	
}