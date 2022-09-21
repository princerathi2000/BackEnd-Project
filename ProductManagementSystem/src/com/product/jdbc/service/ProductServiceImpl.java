package com.product.jdbc.service;

import java.util.Set;

import com.product.jdbc.dao.ProductDao;
import com.product.jdbc.dao.ProductDaoImpl;
import com.product.jdbc.dto.Product;

public class ProductServiceImpl implements ProductService{

	private ProductDao dao;
	
	public ProductServiceImpl()
	{
		dao=new ProductDaoImpl();
	}
	
	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProductCost(int productId, double productCost) {
		// TODO Auto-generated method stub
		return dao.updateProductCost(productId,productCost);
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productId);
	}

	@Override
	public Set<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

	@Override
	public Product searchProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.searchProductById(productId);
	}

	@Override
	public Set<Product> searchProductByname(String productName) {
		// TODO Auto-generated method stub
		return dao.searchProductByname(productName);
	}

}
