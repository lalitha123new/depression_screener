package com.screener.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scr_responce")
public class ScrResponce {
	
	@Id
	@Column(name="scr_responce_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scr_responce_id;
	
	@Column(name="company_info_id")
	private int company_info_id;
	
	@Column(name="responce")
	private String responce;
	
	@Column(name="createdAt")
	private Date createdAt;
	
	public int getScr_responce_id() {
		return scr_responce_id;
	}

	public void setScr_responce_id(int scr_responce_id) {
		this.scr_responce_id = scr_responce_id;
	}

	public int getCompany_info_id() {
		return company_info_id;
	}

	public void setCompany_info_id(int company_info_id) {
		this.company_info_id = company_info_id;
	}

	public String getResponce() {
		return responce;
	}

	public void setResponce(String responce) {
		this.responce = responce;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
	
}
