package com.screener.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.screener.app.dao.companyinfoDao;
import com.screener.app.entity.companyinfo;

@Component
public class AppRunner implements CommandLineRunner {

	
	@Autowired
	private companyinfoDao companyinfoDao;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//companyinfo companyinfo = getcompanyinfo();
		
		//companyinfoDao.createCompany(companyinfo);
		
	}
	
	private companyinfo getcompanyinfo() {
		companyinfo companyinfo= new companyinfo();
		companyinfo.setCompany_code("iiitb employee");
		companyinfo.setCompany_name("narasimham");
		companyinfo.setCompany_address("houser road bengalore");
		companyinfo.setCreatedAt(null);
		
		
		return companyinfo;	
		
	}

}
