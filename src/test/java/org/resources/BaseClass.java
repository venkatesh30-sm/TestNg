package org.resources;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sM\\eclipse-workspace\\MavenProject\\div\\chromedriver.exe");
	 driver=new ChromeDriver();
		
		
	}
	public static void launchUrl(String s) {
		driver.get(s);
	}
	
	public static void type(WebElement e,String s ) {
		e.sendKeys(s);
	}
    
	public static void klik(WebElement e) {
		e.click();
		
	}
	
	public static void kill() {
		driver.quit();
	}
	
	public static void winHandle(int i) {
		Set<String> s = driver.getWindowHandles();
		List<String>li=new LinkedList<String>();
		li.addAll(s);
		driver.switchTo().window(li.get(i));
	}
	
	
	
	
	
	
	

}
