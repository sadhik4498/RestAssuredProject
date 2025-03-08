package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserTest {
	
	Faker faker;
	User user;
	
	@BeforeClass
	public void dataSetUp() {
		
	    faker = new Faker();
	    user = new User();
	    
	  
	    user.setFirstName(faker.name().firstName());
	    user.setLastName(faker.name().lastName());
	    user.setEmail(faker.internet().safeEmailAddress());
	    user.setPassword(faker.internet().password(5, 10));
	    user.setPhone(faker.phoneNumber().cellPhone());  
	    
	}
	
	@BeforeTest
	public void ssnMethod() {
		RestAssured.useRelaxedHTTPSValidation();
	}
	
	@Test
	public void createUser() {
		
		 Response response =  UserEndPoints.createUser(user);
		 
		 response.then().log().all();
		 
		 Assert.assertEquals(response.getStatusCode(), 200);
	}

}
