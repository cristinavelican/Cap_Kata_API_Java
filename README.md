#Framework structure
The below framework can be used for API automation, using Java, Maven and RestAssured (a Java DSL for easy testing of REST services)

resources
In this folder you will find the pets.feature file, that you can use as an example for further scenarios. It is also the place you will store yoru BDD scenarios.

models
This folder contains all the methods for all the objects from the services (pets). Using Lombok, there is no need to add getters and setters separately.

stepDefinitions
In this folder you will store all the step definitions for the BDD scenarios created

support
In the support folder you have all general methods used within different test cases (e.g. call get request, call post request) - in the SupportFunctions.java or helpers for interacting with JSON objects (in JSONFileParser.java)

Instructions
Create BDD scenarios and execute them successfully for the following situations:

Using the Petstore swagger (https://petstore.swagger.io/#/), create the following tests in Postman: ** Create a pet and store the newly created pet’s id 
* Using scenario outline create multiple pets with different names and id's 
* Use the id to get the pet 
* Validate
* Check that the information (content, status, response time …) of the response is as expected 
* Create a pet with category name “Dog” and do a test to validate that the category code is set as expected in the response 
* Create a pet with 2 different tags and validate that the “name” of the tags are both “strings”
* Create reports for your executions
* Make a distinguish in the parameters you provide between mandatory ones and optional ones

Useful resources
https://itsadeliverything.com/declarative-vs-imperative-gherkin-scenarios-for-cucumber