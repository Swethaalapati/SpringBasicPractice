package com.house.springapp.housemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.house.springapp.housemanagement.model.House;
import com.house.springapp.housemanagement.service.HouseService;

@RestController
public class HouseController {

	@Autowired
	private HouseService houseService;
	
	@RequestMapping (method = RequestMethod.POST, value = "/house/add")
	public boolean addHouseDetails(@RequestBody House hs)
	{
		return houseService.addHouseDetails(hs);
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/house/get/{id}")
	public House getHouseDetails(@PathVariable int id)
	{
		return houseService.getHouseDetailsById(id);
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/house/get")
	public List<House> getHouseDetails(@RequestParam String keyword)
	{
		return houseService.getHouseDetailsByKey(keyword);
	}
	
	@RequestMapping (method = RequestMethod.PUT, value = "/house/update/{id}")
	public House updateHouseDetails(@RequestBody House hs, @PathVariable int id)
	{
		return houseService.updateHouseDetails(hs, id);
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/house/delete/{id}")
	public boolean deleteHouseDetails(@PathVariable int id)
	{
		return houseService.deleteHouseDetails(id);
	}
}
