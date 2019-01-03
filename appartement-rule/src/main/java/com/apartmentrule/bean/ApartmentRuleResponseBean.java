package com.apartmentrule.bean;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonInclude(value=Include.NON_NULL)
public class ApartmentRuleResponseBean {
	private HttpStatus status_code;
	private String message;
	private List<ApartmentRuleDtls> ruleList;
	public ApartmentRuleResponseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApartmentRuleResponseBean(HttpStatus status_code, String message, List<ApartmentRuleDtls> ruleList) {
		super();
		this.status_code = status_code;
		this.message = message;
		this.ruleList = ruleList;
	}
	public HttpStatus getStatus_code() {
		return status_code;
	}
	public void setStatus_code(HttpStatus status_code) {
		this.status_code = status_code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ApartmentRuleDtls> getRuleList() {
		return ruleList;
	}
	public void setRuleList(List<ApartmentRuleDtls> ruleList) {
		this.ruleList = ruleList;
	}
	
	

}
