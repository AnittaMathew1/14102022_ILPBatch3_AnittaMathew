package com.experion.entity;

import java.sql.Date;

public class Service {
	private String serviceCode;
	private String serviceNmae;
	private String serviceDesc;
	private Date openDate;
	private Date validityDate;
	private Date expiryDate;
	private Rate rate;
	
	public Service(String serviceCode, String serviceNmae, String serviceDesc, Date openDate, Date validityDate,
			Date expiryDate) {
		super();
		this.serviceCode = serviceCode;
		this.serviceNmae = serviceNmae;
		this.serviceDesc = serviceDesc;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
	}
	
	public Service(String serviceCode2, String serviceNmae2, String serviceDesc2, Date openDate2, Date validityDate2,
			Object expiryDate2) {
	}

	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceNmae() {
		return serviceNmae;
	}
	public void setServiceNmae(String serviceNmae) {
		this.serviceNmae = serviceNmae;
	}
	public String getServiceDesc() {
		return serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public Date getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Rate getRate() {
		return rate;
	}
	public void setRate(Rate rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Service [serviceCode=" + serviceCode + ", serviceNmae=" + serviceNmae + ", serviceDesc=" + serviceDesc
				+ ", openDate=" + openDate + ", validityDate=" + validityDate + ", expiryDate=" + expiryDate + ", rate="
				+ rate + "]";
	}
	
	
	
	
	

}
