package StepDefination;

import org.hamcrest.Matchers;

import BaseLayer.BaseApi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class customerStepDefination extends BaseApi {
	Response res;
	ValidatableResponse vr;

	@Given("user set Base URI")
	public void user_set_base_uri() {
		RestAssured.baseURI = "http://localhost:3000";

	}

	@Given("User set {string} as BasePath")
	public void user_set_as_base_path(String bpath) {
		RestAssured.basePath = bpath;

	}

	@Given("user will get RequestSpecification interface object")
	public void user_will_get_request_specification_interface_object() {
		BaseApi.baseInitialization();

	}

	@Given("user add customer path parameter")
	public void user_add_customer_path_parameter() {

		httpreq.pathParam("id", 2);

	}

	@When("user select http get Request to Retrive single entity")
	public void user_select_http_get_request_to_retrive_single_entity() {
		res = httpreq.get("{id}");

	}

	@Then("user get validatable response interface")
	public void user_get_validatable_response_interface() {

		vr = res.then().assertThat();
	}

	@Then("user check Status code as {int}")
	public void user_check_status_code_as(Integer int1) {

		vr.statusCode(Matchers.equalTo(int1));
	}

	@Then("user validate Status line as {string}")
	public void user_validate_status_line_as(String line) {
		vr.statusLine(Matchers.containsString(line));

	}

	@Then("user will validate response Time is less than {int} ms")
	public void user_will_validate_response_time_is_less_than_ms(Integer time) {
		vr.time(Matchers.lessThan((long) time));

	}

	@Then("user generate response logs")
	public void user_generate_response_logs() {
		vr.log().all();

	}

}
