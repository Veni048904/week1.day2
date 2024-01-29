package org.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartpojo extends BaseClass {

	public Flipkartpojo(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Fashion']")
	private WebElement fashion;
	@FindBy(xpath="//a[text()='Women Western']")
	private WebElement western;
	@FindBy(xpath="//a[text()='Women Dresses']")
	private WebElement dresses;
	public WebElement getFashion() {
		return fashion;
	}
	public WebElement getWestern() {
		return western;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getSelected() {
		return selected;
	}
	public WebElement getAddcart() {
		return addcart;
	}

	@FindBy(xpath="//a[text()='Women Two Piece Dress Black, White Dress']")
	private WebElement selected;
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addcart;
	
	
	
}
