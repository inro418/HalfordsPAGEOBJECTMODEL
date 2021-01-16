package com.qa.halfords.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.halfords.util.TestUtil;


public class Testbase {
	
	//Initialised WebDriver
	public static WebDriver driver; 
	public static Properties prop;  
	
	// create constructor 
	public Testbase(){
		
		//Initialised Properties
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\user\\workspace\\HalfordsPageObjectModel\\src\\main\\java\\com\\qa\\halfords\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e){
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();   
		}
	}

	//create Initialisation method 
	public static void initialisation(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe"); 
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\user\\Downloads\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
			
		}
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS); 
		driver.get(prop.getProperty("url"));   
	}
}