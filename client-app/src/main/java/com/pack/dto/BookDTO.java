package com.pack.dto;

public class BookDTO {


	private Integer bookId;
	private String name;
	private Double price;
	public BookDTO() {
		super();
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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
	public void setPrice(Double i) {
		this.price = i;
	}
	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", name=" + name + ", price=" + price + "]";
	}

}
