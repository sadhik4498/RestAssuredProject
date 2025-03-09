package api.endpoints;

public class Routes {
	
//	Post : petstore.swagger.io/v2/user
//	Get: petstore.swagger.io/v2/User/{Username}
//	Put: petstore.swagger.io/v2/User/{Username}
//	Delete: petstore.swagger.io/v2/User/{Username
	
	public static String base_url ="https://petstore.swagger.io/v2" ;
	
	//end pints for Store API
	public static String post_url = base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
	

}
