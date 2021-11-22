package com.screener.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.screener.app.entity.ScrResponce;
import com.screener.app.entity.Users;
import com.screener.app.entity.companyinfo;
import com.screener.app.services.CompanyService;

@RequestMapping(value="/company")
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyservice;
	
	
	
	@GetMapping("/getCompanyInfo")
	public List<companyinfo> companyName() {
		//companyservice.getCompanyinfo();  
		return companyservice.getCompanyinfo();	
	}
	
	
	@GetMapping("/checkCompanyCode")
	public int getCompanyCode(@RequestParam("company_code") String company_code) {
		
		
		return companyservice.getCompanyCode(company_code);
			
	}
	
	@PostMapping(path = "/saveCompanyInfo", consumes = "application/json", produces = "application/json")
	public int saveCompany(@RequestBody companyinfo companyinfo) {
		//companyservice.getCompanyinfo();  
		return companyservice.createCompanyinfo(companyinfo);	
	}
	
	@PostMapping(path = "/updateCompanyInfo", consumes = "application/json", produces = "application/json")
	public int updateCompany(@RequestBody companyinfo companyinfo,@RequestParam("company_info_id") Integer company_info_id) {
		//companyservice.getCompanyinfo();  
		return companyservice.updateCompanyinfo(companyinfo,company_info_id);	
	}
	
	@GetMapping("/editCompany")
	public List<companyinfo> getCompany(@RequestParam("company_info_id") Integer company_info_id) {
		
		
		return companyservice.getCompany(company_info_id);
			
	}
	
	//*********************RESPONCE CODE*****************************//
	
	//respone
	@PostMapping(path = "/saveResponce", consumes = "application/json", produces = "application/json")
	public int saveResponce(@RequestBody ScrResponce scrResponce) {
		//companyservice.getCompanyinfo();  
		return companyservice.saveResponce(scrResponce);	
	}
	
	
	@GetMapping("/getResBycompany")
	public List<ScrResponce> getResBycompany(@RequestParam("company_info_id") Integer company_info_id) {
		
		
		return companyservice.getResBycompany(company_info_id);
			
	}
	
	@GetMapping("/getResByResId")
	public List<ScrResponce> getResByResId(@RequestParam("scr_responce_id") Integer scr_responce_id) {
		
		
		return companyservice.getResByResId(scr_responce_id);
			
	}
	
	
	@PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
	public int login(@RequestBody Users user) {
		
		return companyservice.login(user);
			
	}
	

}
