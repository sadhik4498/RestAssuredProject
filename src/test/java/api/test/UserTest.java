package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.Routes;
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
	    
	    user.setId(faker.idNumber().hashCode());
	    user.setUsername(faker.name().username());
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
	
	@Test(priority = 1)
	public void createUser() {
		
		 Response response =  UserEndPoints.createUser(user);
		 
		 response.then().log().all();
		 
		 Assert.assertEquals(response.getStatusCode(), 200);
	}
	
//	@Test(priority = 2)
//	public void getUser() {
//		
//		System.out.println(this.user.getUsername());
//		 Response response = UserEndPoints.readUser(this.user.getUsername());
//		 response.then().log().all();
//		 Assert.assertEquals(response.getStatusCode(),200);
//		 
//	}
	
	@Test(priority = 3)
	public void updateUser() throws InterruptedException  {
		
		 user.setFirstName(faker.name().firstName());
		 user.setLastName(faker.name().lastName());
		 user.setEmail(faker.internet().safeEmailAddress());
		
		
		 Response response =  UserEndPoints.updateUser(user,this.user.getUsername());
		 Thread.sleep(2000);
		 System.out.println(Routes.update_url);
		 response.then().log().all();
		 
		 Assert.assertEquals(response.getStatusCode(), 200);
	}

}
