package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class FlipkartHome extends BaseClass {

	
	public FlipkartHome() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement cls;

	public WebElement getCls() {
		return cls;
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement txtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;

	public WebElement getTxtbox() {
		return txtbox;
	}

	public WebElement getBtn() {
		return btn;
	}
	
}
