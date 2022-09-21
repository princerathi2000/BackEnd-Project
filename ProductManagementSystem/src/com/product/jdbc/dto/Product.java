package com.product.jdbc.dto;

public class Product {
	public int product_id;
	public String product_name;
	public int product_amount;
	
	public Product() {}

	public Product(int product_id, String product_name, int product_amount) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_amount = product_amount;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_amount() {
		return product_amount;
	}

	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_amount="
				+ product_amount + "]";
	}
	
}
