package com.product.jdbc.dao;

import java.util.Set;

import com.product.jdbc.dto.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public boolean updateProductCost(int productId,double productCost);
	public boolean deleteProduct(int productId);
	public Set<Product> getAllProduct();
	public Product searchProductById(int productId);
	public Set<Product> searchProductByname(String productName);
}
