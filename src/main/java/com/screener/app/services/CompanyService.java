package com.screener.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.screener.app.dao.companyinfoDao;
import com.screener.app.entity.ScrResponce;
import com.screener.app.entity.Users;
import com.screener.app.entity.companyinfo;

@Component
public class CompanyService {
	
	@Autowired
	private companyinfoDao companyinfoDao;
	
	public int createCompanyinfo(companyinfo companyinfo) {
		
		
		
		return companyinfoDao.createCompany(companyinfo);	
		
	}
	
	public List<companyinfo> getCompanyinfo() {
		
		return companyinfoDao.getCompany();	
		
	}

	public int getCompanyCode(String company_code) {
		
		return companyinfoDao.getCompanyCode(company_code);
		
		
	}

	public int updateCompanyinfo(companyinfo companyinfo,Integer company_info_id) {
		// TODO Auto-generated method stub
		return companyinfoDao.updateCompany(companyinfo,company_info_id);
	}

	public List<companyinfo> getCompany(Integer company_info_id) {
		// TODO Auto-generated method stub
		return companyinfoDao.getCompanyInd(company_info_id);
	}

	public int saveResponce(ScrResponce scrResponce) {
		// TODO Auto-generated method stub
		
		return companyinfoDao.saveResponce(scrResponce);
	}

	public List<ScrResponce> getResBycompany(Integer company_info_id) {
		// TODO Auto-generated method stub
		return companyinfoDao.getResBycompany(company_info_id);
	}

	public List<ScrResponce> getResByResId(Integer scr_responce_id) {
		// TODO Auto-generated method stub
		return companyinfoDao.getResByResId(scr_responce_id);
	}

	public int login(Users user) {
		// TODO Auto-generated method stub
		return companyinfoDao.login(user);
	}
	
	

}
