package com.bridgelabz.CountryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.CountryApp.dao.CountryDAO;
import com.bridgelabz.CountryApp.model.Country;

/**
 * @author vinay(vk)
 * @category implementation of CountryService Interface
 * @since 2017-april-07
 */
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDAO countryDao;
	
	@Override
	public Object addCountry(Country country) {
		
		return countryDao.addCountry(country);
	}

	@Override
	public List getCountries() {
		
		return countryDao.getCountries();
	}

	@Override
	public int deleteById(int id) {
		
		return countryDao.deleteById(id);
	}

	@Override
	public int deleteByName(String name) {
		
		return countryDao.deleteByName(name);
	}

	@Override
	public void updateCountryDetails(Country country) throws Exception {
		
		countryDao.updateCountryDetails(country);
	}

	@Override
	public Country detailsOfCountry(int id) {
		
		return countryDao.detailsOfCountry(id);
	}

}
