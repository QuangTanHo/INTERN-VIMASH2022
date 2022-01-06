package com.vimash.Service;

import java.util.List;

import com.vimash.Dto.ProductDto;
import com.vimash.entity.Product;

public interface ProductService {

	ProductDto addProduct(String json);

	List<Product> findAll();

}
