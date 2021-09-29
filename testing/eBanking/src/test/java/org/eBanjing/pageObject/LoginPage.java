package org.eBanjing.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver dl)
	{
		ldriver=dl;
		PageFactory.initElements(dl,this);
	}
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
		
	@FindBy(name="btnReset")
	WebElement reset;
	
	@FindBy(xpath="//h2[@class='barone']")
	WebElement pageTitle;
	
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		login.click();
	}
	
	public void clickReset()
	{
		reset.click();
	}
	
	public String getTitle()
	{
		return pageTitle.getText();
	}

}
