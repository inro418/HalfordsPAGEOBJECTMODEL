package com.qa.halfords.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.halfords.base.Testbase;


public class LoginPage extends Testbase{  
	
	    //Page Factory - OR
		
	    @FindBy(xpath = "(//a[@title='Halfords'])[1]") 
	    WebElement HalfordslogoImage; 
	    
	    @FindBy(xpath = "//a[@title='Account']")
	    WebElement ClickAccountLink; 
	    
		@FindBy(name = "loginEmail")
		WebElement EnterEmailaddress; 
		
		@FindBy(name = "loginPassword")
		WebElement EnterPassword; 
		
		@FindBy(name = "login")
		WebElement ClickLoginBtn;  
		
		//create constructor of this and initialised the page objects
		public LoginPage(){
			PageFactory.initElements(driver, this);  
		}
		
		//Actions   
		public String validateLoginPageTitle(){  
			return driver.getTitle();  
			
		}
		
		public boolean validateHalfordslogoImage(){
			return HalfordslogoImage.isDisplayed();   
		}
		
		public HomePage login(String username, String password){   
			ClickAccountLink.click();
			EnterEmailaddress.sendKeys(username);   
			EnterPassword.sendKeys(password); 
			ClickLoginBtn.click();
			return new HomePage();   
			
		}
}