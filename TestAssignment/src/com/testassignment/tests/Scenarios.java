package com.testassignment.tests;



public class Scenarios {
	
	public void scenrio1()
	{
		
		TestScripts.launchApp("chrome");
		
		TestScripts.navigatetoAmazon();
		TestScripts.searchforamazon();
		TestScripts.getpriceinamazon();
		
	}
	public void scenrio2()
	{
		
		TestScripts.launchApp("chrome");
		
		TestScripts.navigatetoflipkart();
		TestScripts. searchforflipkart();
		TestScripts.getpriceinflipkart();
		
	
	}
	public void compareToPrices()
	{
		TestScripts.comparePrice();
	}
	
	
}
