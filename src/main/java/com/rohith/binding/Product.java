package com.rohith.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

//@Data
@Entity
public class Product {
	@Id
	@Min(value=100)
	@Max(value=1000)
	@NotNull(message="product id is required")
  private Integer productId;
	@NotEmpty(message="product Name is required")
  private String  productName;
	@NotNull(message="product Price is required")
  private Double  productPrice;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(@NotNull(message = "product id is required") Integer productId,
			@NotEmpty(message = "product Name is required") String productName,
			@NotNull(message = "product Price is required") Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
