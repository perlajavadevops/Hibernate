package com.pgr.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_tbl_1")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8183878907811371183L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int order_id;
	private String orderName;
	private String order_number;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	//@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
