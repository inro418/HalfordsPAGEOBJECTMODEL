package com.qa.halfords.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.halfords.base.Testbase;


public class HomePage extends Testbase{  
	
	    //Page Factory - OR
	    @FindBy(xpath = "//a[@title='Hi, Peter']")  
	    WebElement HiPeter; 
	    
	    @FindBy(xpath = "(//a[@title='Halfords'])[1]")
	    WebElement HalfordslogoImage; 
	    
		//create constructor of this and initialised the page objects
		public HomePage(){
			PageFactory.initElements(driver, this);  
		}
		
		//Actions   
		public String verifyHomePagePageTitle(){
			return driver.getTitle();  
			
		}
		
		public boolean verifyHiPeter(){
			return HiPeter.isDisplayed();
		}
		
		public boolean verifyHalfordslogoImage(){
			return HalfordslogoImage.isDisplayed(); 
		}	
}