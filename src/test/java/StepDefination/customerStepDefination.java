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
	
	//************************
	
	
	@Given("user set {string} base path")
	public void user_set_base_path(String string) {
	    
	}

	@Given("user get request specification interface object")
	public void user_get_request_specification_interface_object() {
	   
	}

	@Given("user create request payload for post request")
	public void user_create_request_payload_for_post_request() {
	    
	}

	@Given("user add customer request payload to http requests")
	public void user_add_customer_request_payload_to_http_requests() {
	    
	}

	@Then("user get Validatable response interface object")
	public void user_get_validatable_response_interface_object() {
	   
	}

	@Then("user validate status code {int}")
	public void user_validate_status_code(Integer int1) {
	    
	}

	@Then("user validate status line {string}")
	public void user_validate_status_line(String string) {
	   
	}

	@Then("user validate response time below {int} ms")
	public void user_validate_response_time_below_ms(Integer int1) {
	    
	}

	@Then("user validate response {string} and {string} header")
	public void user_validate_response_and_header(String string, String string2) {
	    
	}
}
