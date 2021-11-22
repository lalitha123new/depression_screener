package com.screener.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_info")
public class companyinfo {
	
	@Id
	@Column(name="company_info_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer company_info_id;
	
	

	@Column(name="company_name")
	private String company_name;
	
	@Column(name="company_code")
	private String company_code;
	
	@Column(name="company_address")
	private String company_address;
	
	@Column(name="createdAt")
	private Date createdAt;
	
	
	
	public Integer getCompany_info_id() {
		return company_info_id;
	}

	public void setCompany_info_id(Integer company_info_id) {
		this.company_info_id = company_info_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	
	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	

}
