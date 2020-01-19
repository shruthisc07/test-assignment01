package com.testassignment.driverscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.testassignment.objectrepository.ObjectRepository;
import com.testassignment.tests.Scenarios;
import com.testassignment.tests.TestScripts;

public class DriverScript {

	public static WebDriver oBrowser=null;
	public static ObjectRepository oPage=null;
	static TestScripts testscript=null;
	static Scenarios scenario=null;
	public static String stramountflipkart=null;
	public static String stramount=null;
	
	@BeforeSuite
	public void startAutomationSuite()
	{
		try
		{
		 
		//oPage=new ObjectRepository(oBrowser);
		 testscript=new TestScripts();
		 scenario=new Scenarios();
	}catch(Exception e)
		{
		System.out.println(e);
		}}
	
	@Test
	public void executeTestScenarios()
	{
		
	try
	{
		oPage=new ObjectRepository(oBrowser);
		scenario.scenrio1();
		scenario.scenrio2();
		scenario.compareToPrices();
		
		TestScripts.closeApp();
		
	}catch(Exception e)
	{
		System.out.println(e); 
		
	}
	}
		
}
