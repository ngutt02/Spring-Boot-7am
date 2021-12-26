package com.pack.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductDTO {
    @NotNull
	private Integer pid;
    @Size(min=4,max=12)
	private String name;
    @NotNull
	private Double price;
	public ProductDTO() {
		super();
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductDTO [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


}
