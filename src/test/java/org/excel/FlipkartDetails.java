package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class FlipkartDetails extends BaseClass{
	public FlipkartDetails() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']")
	private WebElement pri;

	public WebElement getPri() {
		return pri;
	}
	
}
