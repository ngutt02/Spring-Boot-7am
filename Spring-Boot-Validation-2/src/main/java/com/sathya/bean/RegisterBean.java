package com.sathya.bean;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class RegisterBean {
	@Size(min=4,max=12)
	private String username;
	@Email
	@NotEmpty
	private String email;
	@NotNull @Min(18) @Max(30)
	private Integer age;
	
	@Past
	@NotNull
	private Date dob;
	
	@NotNull
	private Gender gender;
	@NotEmpty
	private String country;

	private List<Country> countriesList;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public List<Country> getCountriesList() {
		return countriesList;
	}
	public void setCountriesList(List<Country> countriesList) {
		this.countriesList = countriesList;
	}
	@Override
	public String toString() {
		return "RegisterBean [username=" + username + ", email=" + email + ", age=" + age + ", dob=" + dob
				+ ", country=" + country + ", gender=" + gender + ", countriesList=" + countriesList + "]";
	}




}
