Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @moduleRegister
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When I clique sur le bouton register
    And Je saisie un data dans le chmap username "<username>"
    And Je saisie un data das le champ lastname "<lastname>"

    Examples: 
      | username | lastname  |
      | Monia    | Dkhil     |
      | Dorra    | Mechergui |
