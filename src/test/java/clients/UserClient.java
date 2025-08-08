package clients;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;


public class UserClient {
	
	public Response getUserById(int userId) {
        return given()
                   .when()
                   .get("/users/" + userId)
                   .then()
                   .extract()
                   .response();
    }

    public pojo.User getUserObjectById(int userId) {
        return given()
                   .when()
                   .get("/users/" + userId)
                   .then()
                   .extract()
                   .as(pojo.User.class);
    }
}



