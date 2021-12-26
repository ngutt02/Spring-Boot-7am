package com.sathya.bean;

import org.springframework.stereotype.Component;

@Component
public class HomeBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
