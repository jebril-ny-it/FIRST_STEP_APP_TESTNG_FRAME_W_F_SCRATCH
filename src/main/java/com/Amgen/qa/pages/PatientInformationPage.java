//@Author Jebril
package com.Amgen.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Amgen.qa.base.TestBase;

public class PatientInformationPage extends TestBase {

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lasttName;

	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement gender;
	
	@FindBy(xpath="//select[@name='dob_month']")
	WebElement monthDropDown;
	
	@FindBy(xpath = "//input[@id='password_SocialSecurityNumber']")
	WebElement socialNumber;

	@FindBy(xpath = "//input[@name='address_1']")
	WebElement StreetAddress;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityname;

	@FindBy(xpath = "//input[@name='zip']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement concentCheckBox;
	
	@FindBy(xpath="//input[@id='subnewtopic']")
	WebElement continueTabPIpage;
	
	public void birthdayfield() {
	
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='dob_month']")));
		sel.deselectByVisibleText("December");

		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='dob_day']")));
		sel.deselectByVisibleText("26");
	
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@name='dob_year']")));
		sel.deselectByVisibleText("26");
	
	}
	

	public PatientInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void fillOutPatientInformation() {
		
	}
}
