import java.io.Serializable;

public class Employee implements Serializable {//POJO--Plain Old Java Object
	//Beans: 
	//Entities
	//DTO: Data transfer Object

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName, lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
