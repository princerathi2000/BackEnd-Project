package com.product.jdbc.client;

import java.util.Set;

import com.product.jdbc.dto.Product;
import com.product.jdbc.service.ProductService;
import com.product.jdbc.service.ProductServiceImpl;

public class Client {
	public static void main(String args[])
	{
		Product product=new Product(5,"mobile",30000);
		ProductService productService =new ProductServiceImpl();
		
//	//Add Product
//		boolean isProductAdded=productService.addProduct(product);
//		
//		if(isProductAdded==true)
//			System.out.println("Product Added Successfully");
//		else
//			System.out.println("Product Not Added");

	//Update Product
		/*boolean isProductUpdated=productService.updateProductCost(product.product_id,product.getProduct_amount());
		
		if(isProductUpdated==true)
			System.out.println("Product Updated Successfully");
		else
			System.out.println("Product Not Updated");*/
		
	//Delete Product
			/*boolean isProductDeleted=productService.deleteProduct(product.product_id);
			
			if(isProductDeleted==true)
				System.out.println("Product Deleted Successfully");
			else
				System.out.println("Product Not Deleted"); */
				
	//search product by name 
//			Set<Product> allProduct= productService.searchProductByname(product.product_name);
//			if(allProduct!=null)
//			{
//				for(Product prod:allProduct)
//					System.out.println(prod);
//			}
//			else
//				System.out.println("No Product Found !!!");
			
	//search pdoduct by id
		    Product product2= productService.searchProductById(product.product_id);
		    if(product2!=null)
		    	System.out.println(product2);
		    else
		    	System.out.println("Product Not Found !!!");

	}
}