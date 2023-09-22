package com.e2etests.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='REGISTER']")
	public static WebElement register;
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement submit;
	@FindBy(how = How.XPATH, using = "//font[contains(text(),'Thank you for registering.')]")
	public static WebElement registerMessage;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Methods */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}

	public void clickOnButtonRegister() {
		register.click();
	}

	public void fillInFirstName(String fName) {
		firstName.sendKeys(fName);
	}

	public void fillInLastName(String lName) {
		lastName.sendKeys(lName);
	}

	public void fillInPhone(String phoneText) {
		phone.sendKeys(phoneText);
	}

	public void fillInEmail(String emailText) {
		email.sendKeys(emailText);
	}

	public void fillInAddress(String adressText) {
		address.sendKeys(adressText);
	}

	public void fillInCity(String cityText) {
		city.sendKeys(cityText);
	}

	public void fillInState(String stateText) {
		state.sendKeys(stateText);
	}

	public void fillInCodePostal(String codPostal) {
		postalCode.sendKeys(codPostal);
	}

	public void fillInCountry() {
		Select countryList = new Select(country);
		countryList.selectByVisibleText("BELGIUM");
	}

	public void fillUserName(String name) {
		userName.sendKeys(name);

	}

	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);

	}

	public void fillConfirmPassword(String confirmPasswordText) {
		confirmPassword.sendKeys(confirmPasswordText);

	}

	public void clickOnButtonSubmit() {
		submit.click();
	}
}
