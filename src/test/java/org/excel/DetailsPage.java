package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class DetailsPage extends BaseClass{
	
	public DetailsPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="priceblock_ourprice")
	private WebElement price;
	
	public WebElement getPrice() {
		return price;
	}
}
