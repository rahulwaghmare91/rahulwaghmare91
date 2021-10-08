package com.test;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ReadConfig;

public class Base 
{
	//Logger l;
	ReadConfig r=new ReadConfig();
public String url=r.m1();
public WebDriver driver;
@BeforeClass
public void m1()
{
	System.setProperty("webdriver.chrome.driver", r.getpath());
	WebDriver driver=new ChromeDriver();
	//l.info("browser is open");
	driver.get("https://www.facebook.com");

}

@AfterMethod()
public void tearDown()
{
	//driver=new ChromeDriver();
	

//driver.quit();	
}}

