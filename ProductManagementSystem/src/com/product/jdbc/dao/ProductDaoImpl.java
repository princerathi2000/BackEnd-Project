package com.product.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.product.jdbc.dto.Product;
import com.product.jdbc.util.ConnectionManagerImpl;

public class ProductDaoImpl implements ProductDao{

	private Connection connection;
	
	public ProductDaoImpl()
	{
		connection=new ConnectionManagerImpl().getConnection();
	}
	
	@Override
	public boolean addProduct(Product product){
		// TODO Auto-generated method stub
		boolean isProductAdded=false;
		
		String query="insert into products values(?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,product.getProduct_id());
			preparedStatement.setString(2,product.getProduct_name());
			preparedStatement.setDouble(3,product.getProduct_amount());
			
			int val=preparedStatement.executeUpdate();
			if(val>0)
				isProductAdded=true;
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		return isProductAdded;
	}

	@Override
	public boolean updateProductCost(int productId, double productCost) {
		// TODO Auto-generated method stub
		boolean isProductUpdated=false;
		String query="update products set product_cost=? where product_id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setDouble(1,productCost);
			preparedStatement.setInt(2,productId);
			
			int val=preparedStatement.executeUpdate();
			if(val>0)
				isProductUpdated=true;
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		
		return isProductUpdated;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		boolean isProductDeleted=false;
		String query="delete from products where product_id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1,productId);
			
			int val=preparedStatement.executeUpdate();
			if(val>0)
				isProductDeleted=true;
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		
		return isProductDeleted;
	}

	@Override
	public Set<Product> getAllProduct() {
		// TODO Auto-generated method stub
		Set<Product> allProducts=new HashSet<Product>();
		try
		{
			Statement statement=connection.createStatement();
			String query="Select * from products;";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				Product product=new Product();
				product.setProduct_id(rs.getInt(1));
				product.setProduct_name(rs.getString(2));
				product.setProduct_amount(rs.getInt(3));
				allProducts.add(product);
			}
		}
		catch(Exception ex)
		{
			
		}
		return allProducts;
	}

	@Override
	public Product searchProductById(int productId) {
		// TODO Auto-generated method stub
//		Set<Product> allProducts=new HashSet<Product>();
		Product product=null;
		try
		{
			Statement statement=connection.createStatement();
			String query="Select * from products where product_id="+productId+";";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				product=new Product();
				product.setProduct_id(rs.getInt(1));
				product.setProduct_name(rs.getString(2));
				product.setProduct_amount(rs.getInt(3));
//				allProducts.add(product);
			}
		}
		catch(Exception ex)
		{
			System.out.println(""+ex);
		}
			return product;
	}

	@Override
	public Set<Product> searchProductByname(String productName) {
		// TODO Auto-generated method stub
		Set<Product> allProducts=new HashSet<Product>();
		Product product=null;
		try
		{
			Statement statement=connection.createStatement();
			String query="Select * from products where product_name='"+productName+"';";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				product=new Product();
				product.setProduct_id(rs.getInt(1));
				product.setProduct_name(rs.getString(2));
				product.setProduct_amount(rs.getInt(3));
//				System.out.println(rs.getInt(1)+"/"+rs.getString(2)+"/"+rs.getInt(3));
				allProducts.add(product);
//				System.out.println(allProducts);
			}
//			for(Product prod:allProducts)
//				System.out.println(prod);
		}
		catch(Exception ex)
		{
			System.out.println(""+ex);
		}
		return allProducts;
	}

}
