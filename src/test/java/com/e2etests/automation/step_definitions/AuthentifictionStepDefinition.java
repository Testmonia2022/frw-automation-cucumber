package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AutentificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentifictionStepDefinition {

	private AutentificationPage autentificationPage;

	public AuthentifictionStepDefinition() {
		this.autentificationPage = new AutentificationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		autentificationPage.goToUrl();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		autentificationPage.fillUserName(name);
	}

	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		autentificationPage.fillPassword(password);
	}

	@When("Je clique le bouton submit")
	public void jeCliqueLeBoutonSubmit() {
		autentificationPage.clickOnButtonSubmit();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AutentificationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);
	}

}
