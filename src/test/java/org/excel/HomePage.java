package org.excel;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class HomePage extends BaseClass   {
	
public HomePage() {
	PageFactory.initElements(driver,this);
}
	
@FindBy(id="twotabsearchtextbox")
private WebElement searchBox;

@FindBy(xpath="(//input[@class='nav-input'])[1]")
private WebElement searchBtn;

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchBtn() {
	return searchBtn;
}








}
