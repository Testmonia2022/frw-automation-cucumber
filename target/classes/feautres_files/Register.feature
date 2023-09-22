Feature: Je verifie la page Register
  En tant que utilisteur je souhaite créer un compte Mercury

  @register
  Scenario: Je vérifie la création d un compte Mercury
    Given Je me connecte sur l application Mercury
    And I clique sur le bouton register
    When Je saisie le first name "John"
    And Je saisie le last name "John"
    And Je saisie le phone number "123456567"
    And Je saisie email "John01@gmail.com"
    And Je saisie address "testadresse"
    And Je saisie city "Paris"
    And Je saisie state "X"
    And Je saisie le code postal "1234"
    And Je saisie le country
    And Je saisie le user name "JohnTest"
    And Je saisie le password "JohnTest"
    And Je confirm le password "JohnTest"
    And Je clique le bouton Envoyer
    Then Je me redirige vers la page register sucess "Thank you for registering. You may now sign-in using the user name and password you've just entered."