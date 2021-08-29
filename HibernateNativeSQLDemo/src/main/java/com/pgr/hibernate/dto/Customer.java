package com.pgr.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
    {
    	@NamedQuery(
    		name = "findCustomerByName", 
    		query = "from Customer where name =:name"
    	),    	
    	@NamedQuery(
        		name = "countTotalCustomers", 
        		query = "select count(*) from Customer"
        ),
    	@NamedQuery(
        		name = "getAllCustomers", 
        		query = "From Customer"
        )
	}
)

@Entity
@Table(name= "customer1")  
public class Customer {

	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phoneNumbers")
	private long phoneNumber;
	
	@Column(name="email")
	private String email;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
