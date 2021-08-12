package com.mahendra;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	@Column(length = 3, name="Code")
	private String code;
	
	@Column(length = 52, name="Name")
	private String name;
	
	@Column(name="Capital")
	private Integer capital;
	
	@Column(name="Code2", length = 2)
	private String code2;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	
	//Empty Constructor 
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
