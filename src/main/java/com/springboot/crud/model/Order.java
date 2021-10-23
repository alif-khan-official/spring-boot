package com.springboot.crud.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	private UUID customerId;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private UUID itemId;
	
	/*
	public Order() {
		
	}
	
	public Order(long id, String customer_id, String item_id) {
		super();
		this.id = id;
		this.customerId = customer_id;
		this.itemId = item_id;
	}
	*/

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public UUID getItemId() {
		return itemId;
	}

	public void setItemId(UUID itemId) {
		this.itemId = itemId;
	}
}
