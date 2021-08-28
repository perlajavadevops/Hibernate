import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name= "emp502")  
public class Employee {

	@Id
    @GeneratedValue( generator = "employee_generator" )
	@SequenceGenerator(sequenceName = "employee_sequence",initialValue = 100, name = "employee_generator")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name", length=10)
	private String lastName;
	
	@Column(name="salary", length=10)
	private Float salary;

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

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
