package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Product;

public interface ProductService {
	
	public void addProduct(Product product);

	public List<Product> getAllProducts();

	public void deleteProduct(Integer productId);

	public Product getProduct(int productid);

	public Product updateProduct(Product product);
}
