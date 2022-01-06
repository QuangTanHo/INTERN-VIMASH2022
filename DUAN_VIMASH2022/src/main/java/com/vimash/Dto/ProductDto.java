package com.vimash.Dto;

import lombok.Data;

@Data
public class ProductDto {
	private Long id;
	private String name;
	private double price;
	private int stockAmount;
}
