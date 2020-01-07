package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class ResultPage extends BaseClass {
	
	public ResultPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']")
	private WebElement pne;

	public WebElement getPne() {
		return pne;
	}
}
