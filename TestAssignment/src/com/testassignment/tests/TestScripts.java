package com.testassignment.tests;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testassignment.driverscript.DriverScript;
import com.testassignment.objectrepository.ObjectRepository;

public class TestScripts extends DriverScript {
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	static void launchApp(String strBrowser)
	{
		
		try {
			switch(strBrowser.toLowerCase())
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
					oBrowser = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
					oBrowser = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\drivers\\geckodriver.exe");
					oBrowser = new FirefoxDriver();
					break;
				default:
					System.out.println("Fail,Executing 'launchApp' method Invalid browser name '"+strBrowser);
			}
			oPage=new ObjectRepository(oBrowser);
			
			if(oBrowser!=null)
			{
				oBrowser.manage().window().maximize();
				
			}else {
				System.out.println("invalid"); 
				
			}
		}catch(Exception e)
		{
			System.out.println("Fail,Executing 'launchApp' method Exception while executing 'launchApp' method. "+e.getMessage());
			
		}
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */

	static void navigatetoAmazon()
	{
		try
		{
			oBrowser.get("https://www.amazon.in");
			Thread.sleep(5000);
			System.out.println("page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigatetoflipkart()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			System.out.println("flikart page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void searchforamazon()
	{
		try
		{
			oPage.getsearch().click();
			System.out.println("clicked on search");
			oPage.getsearchsendkeys().sendKeys("iPhone XR (64GB) - Yellow");
			System.out.println("searching for iphone"); 
			
			
			oPage.getclickOnSearchButton().click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void getpriceinamazon()
	{
		
		oPage.priceofphone().click();
		String sParent = oBrowser.getWindowHandle();
		System.out.println("Parent: "+sParent);
		try
		{
			
			Set<String> s1=oBrowser.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!sParent.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    oBrowser.switchTo().window(ChildWindow);
	                    Thread.sleep(4000);
	                    
	                    System.out.println("new window");
	                    String sURL = oBrowser.getCurrentUrl();
						System.out.println("URL: "+sURL);
	                    oBrowser.findElement(By.xpath("//*[@class='a-icon a-accordion-radio a-icon-radio-active']")).click();
	                    String stramount=oPage.priceofphoneamount().getText();
	                    System.out.println(stramount);
	                    }			
		}}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void searchforflipkart() {
		try
		{
			oPage.logincloseofflipkart().click();
			oPage.searchinflipkart().click();
			oPage.searchinflipkart().sendKeys("iPhone XR (64GB) - Yellow");
			System.out.println("searching for iphone in flipkart"); 
			
			
			oPage.searchbuttoninflipkart().click();
		
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void getpriceinflipkart()
	{
		
		stramountflipkart=oPage.priceofphoneamountflipkart().getText();
		
		
		System.out.println(stramountflipkart);
		
	}
	 public static void comparePrice()
	{
		int str1=Integer.parseInt(stramount);  
		int str2=Integer.parseInt(stramountflipkart);  
		
		if(str1>str2)
		{
			System.out.println("the price of iphone is less in amazon"+str1);
		}else
		{
			System.out.println("the price of iphone is less in amazon"+str2);
		}
		
		}
	
	 public static void closeApp()
		{
			oBrowser.quit();
		}
}


