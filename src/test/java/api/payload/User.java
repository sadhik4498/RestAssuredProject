package api.payload;

public class User {
	
	
	String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    String userStatus;
	int id;
	
	
	
    public int getId() {
    	
		return id;
	}
	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println(username);
		this.username = username;
	}
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println(firstName);
		
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println(lastName);
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println(email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println(password);
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		System.out.println(phone);
		this.phone = phone;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		System.out.println(userStatus);
		this.userStatus = userStatus;
	}
	


}
