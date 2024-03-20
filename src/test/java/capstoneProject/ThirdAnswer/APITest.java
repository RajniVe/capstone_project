package capstoneProject.ThirdAnswer;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APITest {

    @DataProvider(name = "translations")
    public Object[][] getTranslationData() throws IOException {
        return ExcelReader.readExcelData("C:\\Users\\deepa\\CapstoneProject\\ThirdAnswer\\API.xlsx", "Sheet1");
    }

    @Test(dataProvider = "translations")
    public void testTranslation(String translation) {
        RestAssured.baseURI = "https://restcountries.com/v3.1";
        
        Response response = given()
                .pathParam("translation", translation)
                .when()
                .get("/translation/{translation}")
                .then()
                .statusCode(200)
                .extract()
                .response();

        System.out.println("Response: " + response.getBody().asString());
    }
}