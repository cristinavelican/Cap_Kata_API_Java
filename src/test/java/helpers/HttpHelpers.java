package helpers;

import com.jayway.restassured.RestAssured;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;

public class HttpHelpers {

    public static ResponseBody get(String url){
        Response response = RestAssured.given()
                .when()
                .get(url);
        return response.getBody();
    }

    public static Response postWithoutBody(String url, String json) {
        Response response = RestAssured.given()
                .header("content-type", "application/json")
                .body(json)
                .contentType(ContentType.JSON)
                .when()
                .post(url);

        return response;
    }

    public static ResponseBody post(String url, String json) {
        Response response = RestAssured.given()
                .header("content-type", "application/json")
                .body(json)
                .contentType(ContentType.JSON)
                .when()
                .post(url);

        return response.getBody();
    }
}
