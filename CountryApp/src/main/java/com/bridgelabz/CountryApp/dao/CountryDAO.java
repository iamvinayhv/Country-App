package com.bridgelabz.CountryApp.dao;

import java.util.List;

import com.bridgelabz.CountryApp.model.Country;

/**
 * @author vinay(vk)
 * @category Interface of CountryDAO
 * @since 2017-april-07
 */
public interface CountryDAO {

	public Object addCountry(Country country);

	public List getCountries();

	public int deleteById(int id);

	public int deleteByName(String name);

	public void updateCountryDetails(Country country) throws Exception;

	public Country detailsOfCountry(int id);

}
