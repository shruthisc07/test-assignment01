package com.testassignment.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ObjectRepository {

	public static WebDriver oBrowser;
//	public static ObjectRepository oPage=new ObjectRepository(oBrowser);
	public ObjectRepository(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		System.out.println("entered into constructor");
	}
	
	
	
	@FindBy(xpath="//*[@class='nav-search-field ']")
	private WebElement searchbox;
	public WebElement getsearch()
	{
		return searchbox;
	}
	private WebElement twotabsearchtextbox;
	public WebElement getsearchsendkeys()
	{
		return twotabsearchtextbox;
	}
	@FindBy(xpath="//input[@type='submit' and @class='nav-input']")
	private WebElement osearchbutton;
	public WebElement getclickOnSearchButton()
	{
		return osearchbutton;
	}

	@FindBy(xpath="//*[text()='Apple iPhone XR (64GB) - Yellow']")
	private WebElement oprice;
	public WebElement priceofphone()
	{
		return oprice;
	}
	@FindBy(xpath="//table[@class='a-lineitem']/tbody/tr[2]/td[2]/span")
	private WebElement opriceamount;
	public WebElement priceofphoneamount()
	{
		return opriceamount;
	}
	@FindBy(xpath="//*[@class='_2AkmmA _29YdH8']")
	private WebElement loginclose;
	public WebElement logincloseofflipkart()
	{
		return loginclose;
	}
	@FindBy(xpath="//*[@title='Search for products, brands and more']")
	private WebElement searchinflipkart;
	public WebElement searchinflipkart()
	{
		return searchinflipkart;
	}
	@FindBy(xpath="//*[@class='vh79eN']")
	private WebElement searchbuttoninflipkart;
	public WebElement searchbuttoninflipkart()
	{
		return searchbuttoninflipkart;
	}
	@FindBy(xpath="//*[@class='_1vC4OE _2rQ-NK']")
	private WebElement opriceamountflipkart;
	public WebElement priceofphoneamountflipkart()
	{
		return opriceamountflipkart;
	}

	
	
	
}


