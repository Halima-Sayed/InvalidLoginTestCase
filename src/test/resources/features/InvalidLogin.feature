Feature: Login related scenario
  @invalid
Scenario Outline: negative login test

Given user is navigated to HRMS applicationt
When user enters "<userName>" and "<password>" and verifying the "<error>" for the combinations
Examples:
| userName | password   | error |
|          |Hum@nhrm123 |Username cannot be empty|
|admin     |            |Password cannot be empty|
|admin     |sdvdbbdfd   |Invalid credentials|