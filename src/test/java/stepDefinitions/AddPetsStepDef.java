package stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.response.ResponseBody;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovy.util.logging.Slf4j;
import helpers.HttpHelpers;
import com.jayway.restassured.RestAssured;
import models.Pets;
import org.junit.Assert;
import org.json.*;


public class AddPetsStepDef {

    private static ResponseBody getPets;
    protected String petName;


    @When("^I want to add a new pet with name \"([^\"]*)\"$")
    public void i_want_to_add_a_new_pet(String name) throws Throwable {
        petName = name;
        Pets petsInfo = Pets.builder().id("3").name(name).status("available").build();

        ObjectMapper objectMapper = new ObjectMapper();
        String petsBody = objectMapper.writeValueAsString(petsInfo);
        System.out.println(petsBody);
        getPets = HttpHelpers.post("https://petstore.swagger.io/v2/pet", petsBody);

    }

    @Then("^The newly pet should have the desired name$")
    public void the_newly_pet_should_have_the_desired_name() throws Throwable {
        JSONObject getPetsJson = new JSONObject(getPets.asString());
        Assert.assertEquals("The pet has the desired Name ",petName,getPetsJson.getString("name"));
    }
}
