package com.house.springapp.housemanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.house.springapp.housemanagement.model.House;

@Service
public class HouseService {

	private List<House> listOfHouses = new ArrayList();

	public boolean addHouseDetails(House hs) {
		
		for(House h : listOfHouses) {
			
			if(h.getId() == hs.getId()) {
				
				return false;
			}
		}
		listOfHouses.add(hs);
		return true;
	}

	public House getHouseDetailsById(int id) {
		
		for(House h : listOfHouses) {
			
			if(h.getId() == id) {
				
				return h;
			}
		}
		return null;
	}

	public List<House> getHouseDetailsByKey(String keyword) {
		
		List<House> list = new ArrayList();
		
		if(keyword.isEmpty()) {
			
			return listOfHouses;
			
		} else {
			
			for(House h : listOfHouses) {
				
				if(h.toString().contains(keyword)) {
					
					list.add(h);
				}
			}
		}
		return list;
	}

	public House updateHouseDetails(House hs, int id) {
		
		deleteHouseDetails(id);
		addHouseDetails(hs);
		
		return hs;
	}

	public boolean deleteHouseDetails(int id) {
		
		House hse = null;
		boolean flag = false;
		
		for(House h : listOfHouses) {
			
			if(h.getId() == id) {
				
				hse = h;
				flag = true;
			}
		}
		if(flag) {
			
			listOfHouses.remove(hse);
			return true;
		}
		return false;
	
	}
	
	
}
