package com.vimash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orderDetail_tbl")
public class OrderDetail extends CommonEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderDetailId;
	private Long orderId;
	private Long productId;
	private double amount;
	private double price;
	private int itemIdx;
	
	
	
	
	
	
	
}
