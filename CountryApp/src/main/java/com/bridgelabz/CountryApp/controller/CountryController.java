package com.bridgelabz.CountryApp.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.CountryApp.model.Country;
import com.bridgelabz.CountryApp.service.CountryService;


/**
 * This is the country application Controller
 * @author vinay(vk)
 * @since 2017-april-07
 */
@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	/**
	 * @param country
	 * @return modelAndView to details page after successfully adding
	 * @category this method is used to add the country details
	 */
	@RequestMapping(value="addCountry")
	public ModelAndView addCountry(Country country) {
		
		String msg="Country Added Successfully at country code:"+country.getCountryCode();
		
		ModelAndView model = new ModelAndView("countryDetails");
		Object object = countryService.addCountry(country);
		if(object != null) {
			List countries = countryService.getCountries();
			model.addObject("countries", countries);
			model.addObject("msg", msg);
			return model;
		}
		else {
			return new ModelAndView("notAdded");
		}
	}
	
	
	/**
	 * @category this method is used to view all the country details
	 */
	@RequestMapping(value="view")
	public ModelAndView viewCountries() {
		
		ModelAndView model = new ModelAndView("countryDetails");
		
		List countries = countryService.getCountries();
		model.addObject("countries", countries);
		if(countries != null) {
			return model;
		}
		else
			return new ModelAndView("noCountriesAdded");
	}
	
	/**
	 * @category this method gives the list of countries added and there id
	 */
	@RequestMapping(value="listOfcountry")
	public ModelAndView listOfcountry() {
		
		ModelAndView model = new ModelAndView("listOfcountry");
		
		List countries = countryService.getCountries();
		model.addObject("countries", countries);
		if(countries != null) {
			return model;
		}
		else
			return new ModelAndView("noCountriesAdded");
	}
	
	
	/**
	 * @category this method gives the detail of one country for request
	 */
	@RequestMapping(value="details")
	public ModelAndView detaisOfCountry(@RequestParam("id") int id){
		
		Country country = countryService.detailsOfCountry(id);
		if(country != null) {
			ModelAndView model = new ModelAndView("details");
			model.addObject("country", country);
			System.out.println(country);
			return model;
		}
		else
			return new ModelAndView("countryNotFound");
		
	}
	
	
	/**
	 * @category this method is used to delete the country
	 */
	@RequestMapping(value="delete")
	public ModelAndView deleteCountry() {
		
		ModelAndView model = new ModelAndView("delete");
		
		List countries = countryService.getCountries();
		
		if(countries != null) {
			model.addObject("countries", countries);
			return model;
		}
		else
			return new ModelAndView("noCountriesAdded");
		
	}
	
	
	/**
	 * @category this method is used to delete the country based on that country Id
	 */
	@RequestMapping(value="deleteId")
	public ModelAndView deleteById(@RequestParam("id") int id) {
		
		int result = countryService.deleteById(id);
		String msg = "Country Deleted Successfully at Id: "+id;
		
		if(result != 0) {
			ModelAndView model = new ModelAndView("countryDetails");
			
			List countries = countryService.getCountries();
			model.addObject("countries", countries);
			model.addObject("msg", msg);
			return model;
		}
		else {
			return new ModelAndView("countryNotFound");
		}
	}
	
	
	/**
	 * @category this method is used to delete the country based on that country Name
	 */
	@RequestMapping(value="deleteName")
	public ModelAndView deleteByname(@RequestParam("name") String name) {
		
		int result = countryService.deleteByName(name);
		String msg = "Country Deleted Successfully at Name: "+name;
		
		if(result != 0) {
			ModelAndView model = new ModelAndView("countryDetails");
			
			List countries = countryService.getCountries();
			model.addObject("countries", countries);
			model.addObject("msg", msg);
			return model;
		}
		else {
			return new ModelAndView("countryNotFound");
		}
		
	}
	
	
	
	/**
	 * @category this method is used to update the country details
	 */
	@RequestMapping(value="forupdate")
	public ModelAndView forUpdateDetails() {
		
		List countries = countryService.getCountries();
		
		if(countries != null) {
			ModelAndView model = new ModelAndView("update");
			model.addObject("countries", countries);
			return model;
		}
		else
			return new ModelAndView("countryNotFound");
		
	}
	
	
	
	/**
	 * @category this method is used to update the country details
	 */
	@RequestMapping(value="update")
	public ModelAndView upadteCountryDetails(Country country) {
		
		String msg = "Country details Updated at Country Id: "+country.getId();

		try {
			countryService.updateCountryDetails(country);
			
			List countries = countryService.getCountries();
			ModelAndView model = new ModelAndView("countryDetails");
			model.addObject("msg", msg);
			model.addObject("countries", countries);
			return model;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("countryNotFound");
		}
		
	}
}
