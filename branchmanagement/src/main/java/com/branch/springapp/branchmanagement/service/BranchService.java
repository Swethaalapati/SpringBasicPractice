package com.branch.springapp.branchmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.branch.springapp.branchmanagement.model.Branch;

@Service
public class BranchService {
	
	private List<Branch> listOfBranch = new ArrayList();

	public boolean addBranch(Branch br) {
		
		for(Branch b : listOfBranch) {
			
			if(b.getId() == br.getId()) {
				
				return false;
				
			}
		}
		
		listOfBranch.add(br);
		return true;
	}

	public Branch getBranchById(int id) {
		
		for(Branch b : listOfBranch) {
			
			if(b.getId() == id) {
				
				return b;
			}
		}
		
		return null;
	}

	public List<Branch> getBranchByKey(String keyword) {
		
		List<Branch> list = new ArrayList();
		
		if(keyword.isEmpty()) {
			
			return listOfBranch;
		}
		else {
		
			for(Branch b : listOfBranch) {
				
				if(b.toString().contains(keyword)) {
					
					list.add(b);
				}
			}
		}
				
		return list;
	}

	public Branch updateBranchById(Branch br, int id) {
		
		deleteBranchById(id);
		addBranch(br);
		
		return br;
	}

	public boolean deleteBranchById(int id) {
		
		Branch brch = null;
		boolean flag = false;
		
		for(Branch b : listOfBranch) {
			
			if(b.getId() == id) {
				
				brch = b;
				flag = true;
			}
		}
		if(flag) {
			
			listOfBranch.remove(brch);
			return true;
		}
		
		return false;
	}
	
	
}
