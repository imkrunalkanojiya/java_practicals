package encapsulation;

public class Model {
	
	String name, surname, email;
	int age;
	
	
	// getter methods
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
