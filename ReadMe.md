# Sauce Demo Task / Instructions


#### Codes and Tests Prepared by:

* Maimaitiyusufu Wulayinmu
* QA Test Automation Engineer
* uysdetlead@gmail.com



## Stack & Libraries

- Java 8+ SDK
- Selenium WebDriver
- Cucumber Junit
- Maven
- Java Faker


------------
## Test RUN

Notice:

- To run  tests, use `CukesRunner`. You can run from the class
- To run tests --> `mvn verify -Dcucumber.options="--tags @wip" `
- To run failed tests, use `FailedTestRunner`.
- To choose browser type go to *configuration.properties*


------------

## Test Reports Locations
- Screenshot on test failure: A screenshot of the active browser is captured and stored in target-->cucumber-html-reports-->embeddings
- Extent reporting and logging: After the test finishes, a visual report is generated for all the executed test cases from the suite. This report can be found in the 'target' --> cucumber-html-reports                                  
- overview-failures.html
- overview-features.html
- overview-steps.html
- overview-tags.html
  
  (Right Click and Open in any Browser )

-----------------------------
## Created packages explanation
- pages : store page specific elements and methods
- runner : to run test cases
- step_definitions : store step definitions for scenarios
- utilities : store common methods
- resources : store feature files

## Added scenarios
####Location : resources - features - dropdownList
Scenario : User should be able to select options from Menu
Scenario : User should be able to sort items in reverse order Z to A

####Location : resources - features - login
Scenario : User should be able to login with valid credentials
Scenario : User should not be able to login with invalid credentials or locked account


####Location : resources - features - purchase
Scenario : User should be able to purchase
Scenario : Problem user should not be able to purchase




-----------------------------
2022 April

### End
