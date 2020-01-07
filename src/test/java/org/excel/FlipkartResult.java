package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class FlipkartResult extends BaseClass {

	public FlipkartResult() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[text()='Apple iPhone XR (Yellow, 64 GB)']")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	
}
