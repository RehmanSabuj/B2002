import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SampleApiTest {
    public static void doLogin() throws IOException {
        String url = "http://localhost:8080/rest/auth/1/session";
        String payloads = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir" + "payloads/login.json"))));
        RequestSpecification request = RestAssured.given().body(payloads);
        request.contentType(ContentType.JSON);
        Response response = request.post(url);
        System.out.println(response);
    }

    public static void main(String[] args) throws IOException {
        doLogin();


    }
}
