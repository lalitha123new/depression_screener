package com.screener.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.screener.app.dao.companyinfoDao;

@Service
public class SampleService {

	
	@Autowired
	private companyinfoDao companyinfoDao;
	
	
}
