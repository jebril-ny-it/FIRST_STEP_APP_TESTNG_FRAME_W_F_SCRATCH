//@Author Jebril
package com.Amgen.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.Amgen.qa.base.TestBase;

public class PatientInformationPage extends TestBase {

	public PatientInformationPage() {

		PageFactory.initElements(driver, this);
	}
}
