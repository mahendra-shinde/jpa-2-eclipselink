package com.mahendra;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {

	@Id
	@Column(name="ID")
	private Integer id;

	@Column(name="Name",length = 35)
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CountryCode")
	private Country country;

	@Column(name="District",length = 20)
	
	private String district;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
