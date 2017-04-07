package com.bridgelabz.CountryApp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author vinay(vk)
 * @since 2017-april-07
 * @category this is the model class of country application
 */
@Entity
@Table(name="Country_APP")
public class Country implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="gen" , strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="ID")
	private int id;
	@Column(name="Country_Code")
	private int countryCode;
	@Column(name="Country_Name")
	private String name;
	@Column(name="Area")
	private long area;
	@Column(name="Population")
	private long population;
	@Column(name="Currency")
	private String currency;
	@Column(name="Date_Of_Update")
	private Date date = new Date();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getArea() {
		return area;
	}
	public void setArea(Long area) {
		this.area = area;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryCode=" + countryCode + ", name=" + name + ", area=" + area
				+ ", population=" + population + ", currency=" + currency + ", date=" + date + "]";
	}
	
	
}
