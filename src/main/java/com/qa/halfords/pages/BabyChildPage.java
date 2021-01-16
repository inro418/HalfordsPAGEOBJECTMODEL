package com.qa.halfords.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.halfords.base.Testbase;

public class BabyChildPage extends Testbase{

	
	    @FindBy(xpath = "(//a[@title='Baby & Child'])[1]")
	    WebElement BabyChild; 
	    
	    @FindBy(xpath = "//a[@title='Kids bikes']")
	    WebElement Kidsbikes; 
	    
	    @FindBy(xpath = "//a[@title='Refine by Age: 4-6 years']")
	    WebElement Age4to6; 
	    
	    @FindBy(xpath = "//*[@id='item-gender']/div/ul/li[2]/a")
	    WebElement Boys; 
	    
	    @FindBy(xpath = "//*[@id='product-search-results']/div[2]/section/div[3]/div/div[9]/div/div/a/picture/img")
	    WebElement viewSpiderManKidsBike14Wheel; 
	    
	    @FindBy(xpath = "//button[@class='js-carousel-button js-click-to-zoom b-product-image__button-zoom b-zoom--in']")
	    WebElement Zoom; 
	    
		//create constructor of this and initialised the page objects
		public BabyChildPage(){
			PageFactory.initElements(driver, this);
		}
		
		public String verifyBabyChildPageTitle(){
			return driver.getTitle();  
			
		}
		
		public BabyChildPage ClickOnBabyChildPage(){
			return new BabyChildPage();  
		}
		
		//Actions   
		public BabyChildPage clickOnBabyChildPage(){
			   BabyChild.click();
			   Kidsbikes.click();
			   Age4to6.click();
			   Boys.click();
			   viewSpiderManKidsBike14Wheel.click();
			   Zoom.click();
	          return new BabyChildPage();
		}
}
