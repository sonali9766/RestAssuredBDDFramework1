package BaseLayer;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseApi {
	protected static RequestSpecification httpreq;

	public static void baseInitialization() {
		RequestSpecification httpreq = RestAssured.given();

		httpreq.header("Content-Type", "application/json");
		httpreq.log().all();

	}

}
