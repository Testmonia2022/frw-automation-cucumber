package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AutentificationPage;
import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisteStepDefinition {

	private RegisterPage registerPage;

	public RegisteStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("I clique sur le bouton register")
	public void iCliqueSurLeBoutonRegister() {
		registerPage.clickOnButtonRegister();
	}

	@When("Je saisie le first name {string}")
	public void jeSaisieLeFirstName(String fName) {
		registerPage.fillInFirstName(fName);
	}

	@When("Je saisie le last name {string}")
	public void jeSaisieLeLastName(String lName) {
		registerPage.fillInLastName(lName);
	}

	@When("Je saisie le phone number {string}")
	public void jeSaisieLePhoneNumber(String phoneNumber) {
		registerPage.fillInPhone(phoneNumber);
	}

	@When("Je saisie email {string}")
	public void jeSaisieEmail(String email) {
		registerPage.fillInEmail(email);
	}

	@When("Je saisie address {string}")
	public void jeSaisieAddress(String address) {
		registerPage.fillInAddress(address);
	}

	@When("Je saisie city {string}")
	public void jeSaisieCity(String city) {
		registerPage.fillInCity(city);
	}

	@When("Je saisie state {string}")
	public void jeSaisieState(String state) {
		registerPage.fillInState(state);
	}

	@When("Je saisie le code postal {string}")
	public void jeSaisieLeCodePostal(String pCode) {
		registerPage.fillInCodePostal(pCode);
	}

	@When("Je saisie le country")
	public void jeSaisieLeCountry() {
		registerPage.fillInCountry();
	}

	@When("Je saisie le user name {string}")
	public void jeSaisieLeUserName(String name) {
		registerPage.fillUserName(name);
	}

	@When("Je confirm le password {string}")
	public void jeConfirmLePassword(String password) {
		registerPage.fillConfirmPassword(password);
	}

	@When("Je clique le bouton Envoyer")
	public void jeCliqueLeBoutonEnvoyer() {
		registerPage.clickOnButtonSubmit();
	}

	@Then("Je me redirige vers la page register sucess {string}")
	public void jeMeRedirigeVersLaPageRegisterSucess(String text) {
		String message = RegisterPage.registerMessage.getText();
		Assert.assertEquals(message.trim(), text);
		//System.out.println(message);
	}







}
