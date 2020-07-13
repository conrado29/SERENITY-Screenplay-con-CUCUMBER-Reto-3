# lenguaje:en
# autor: Conrado Iglesias G

@stories
Feature: Register in maxtime
  As a user, I want to be able to record my hours worked and close the business day
  @scenario1
  Scenario: Register maxtime
    Given  that pepe needs to record his hours in and close the day in maxtime
    When  you enter your hours and close the day in the application
      #|   fieldName  |   lastName | middleName | idNumber | userName | status |   password  | confirmPassword |   essRole   |   supervisorRole   |  adminRole | allRegions | selectRegion |
      #|   Nombre-29  | Apellido-29| Nombre2-29 |    123   | Nombre29 | Enable | Contra12345 |   Contra12345   | Default ESS | Default Supervisor | All Region |     no     |     China    |
    Then the day closes with its hours in the application