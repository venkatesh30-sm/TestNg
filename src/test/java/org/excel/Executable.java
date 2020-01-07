package org.excel;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.resources.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Executable extends BaseClass{
	
	int amazonprice;
	int flipprice;
	@BeforeClass
	public void beforeClass() {
		launch();
	}
	@BeforeMethod
		public void beforeMethod() {
			Date d=new Date();
			System.out.println(d);
		}
	@AfterMethod
	public void afterMethod() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void test1() {
		launchUrl("https://www.amazon.in");
		HomePage l=new HomePage();
		ResultPage r=new ResultPage();
		DetailsPage d=new DetailsPage();
		
type(l.getSearchBox(),"iphone XR(64GB)-Yellow");
		
		klik(l.getSearchBtn());
		
		klik(r.getPne());
		
		winHandle(1);
		String t = d.getPrice().getText();
		
		amazonprice = Integer.parseInt(t.substring(0, t.indexOf('.')).replaceAll("[^0-9]",""));
	
		kill();
	}
	    @Test
		public void test2() {
	    	launch();
	    	launchUrl("https://www.flipkart.com/");
		
		FlipkartHome f=new FlipkartHome();
		FlipkartResult fr=new FlipkartResult();
		FlipkartDetails fd=new FlipkartDetails();
		
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		klik(f.getCls());
		
		type(f.getTxtbox(),"iphone XR(64GB)-Yellow");
		klik(f.getBtn());
		
		klik(fr.getPhone());
		
		winHandle(1);
		
		flipprice = Integer.parseInt(fd.getPri().getText().replaceAll("[^0-9]",""));
	   
		if(amazonprice>flipprice) {
			System.out.println("iphone price in flipkart is lesser");
		}
		else {
			System.out.println("iphone price in amazon is lesser");
		}
	    
	    }
		
		@AfterClass
		public void afterClass() {
			kill();
		}
		
		
		
		
		
		
	}


