package com.branch.springapp.branchmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.branch.springapp.branchmanagement.model.Branch;
import com.branch.springapp.branchmanagement.service.BranchService;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping (method = RequestMethod.POST, value = "/branch/add")
	public boolean addBranch(@RequestBody Branch br) {
		
		return branchService.addBranch(br);
		
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/branch/get/{id}")
	public Branch getBranch(@PathVariable int id) {
		
		return branchService.getBranchById(id);
		
	}
	
	@RequestMapping (method = RequestMethod.GET, value = "/branch/get")
	public List<Branch> getBranchByKey(@RequestParam(defaultValue = "") String keyword) {
		
		return branchService.getBranchByKey(keyword);
		
	}
	
	@RequestMapping (method = RequestMethod.PUT, value = "/branch/update/{id}")
	public Branch updateBranch(@RequestBody Branch br, @PathVariable int id) {
		
		return branchService.updateBranchById(br, id);
		
	}
	
	@RequestMapping (method = RequestMethod.DELETE, value = "/branch/delete/{id}")
	public boolean deleteBranch(@PathVariable int id) {
		
		return branchService.deleteBranchById(id);
		
	}

}
