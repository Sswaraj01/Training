package com.apartmentrule.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apartmentrule.bean.ApartmentRuleDtls;
import com.apartmentrule.bean.ApartmentRuleResponseBean;
import com.apartmentrule.services.ApartmentRuleManager;

@RestController
public class ApartmentRuleController {

	@Autowired
	private ApartmentRuleManager apartmentRuleManager;
	

	@PostMapping("/create/rule")
	ResponseEntity<ApartmentRuleResponseBean> createRule(@Valid @RequestBody ApartmentRuleDtls ruleDetails){
		ApartmentRuleResponseBean responseBean = new ApartmentRuleResponseBean();
		ApartmentRuleDtls RuleDetailsRes  = new ApartmentRuleDtls();
		List<ApartmentRuleDtls> ruleList= new ArrayList<>();

		RuleDetailsRes=apartmentRuleManager.createRule(ruleDetails);
		ruleList.add(RuleDetailsRes);
		responseBean.setMessage("Rule has been created Successfuly");
		responseBean.setStatus_code(HttpStatus.OK);
		responseBean.setRuleList(ruleList);
		return new ResponseEntity<ApartmentRuleResponseBean>(responseBean, HttpStatus.OK);

	}

	@GetMapping("/retrive/rule/{ruleId}")
	ResponseEntity<ApartmentRuleResponseBean>  getRuleByRuleId(@PathVariable("ruleId") int ruleId){
		ApartmentRuleResponseBean responseBean = new ApartmentRuleResponseBean();
		ApartmentRuleDtls RuleDetailsRes  = new ApartmentRuleDtls();
		List<ApartmentRuleDtls> ruleList= new ArrayList<>();

		RuleDetailsRes=apartmentRuleManager.getRulesById(ruleId);
		ruleList.add(RuleDetailsRes);
		responseBean.setMessage("Rule has been fetched Successfuly");
		responseBean.setStatus_code(HttpStatus.OK);
		responseBean.setRuleList(ruleList);
		return new ResponseEntity<ApartmentRuleResponseBean>(responseBean, HttpStatus.OK);

	}

	@GetMapping("/retrive/apartment/rules/{apptId}")
	ResponseEntity<ApartmentRuleResponseBean> getRulesByApptId(@PathVariable("apptId") String apptId){

		ApartmentRuleResponseBean responseBean = new ApartmentRuleResponseBean();
		List<ApartmentRuleDtls> RuleDetailsRes =apartmentRuleManager.getRulesByApptId(apptId);
		responseBean.setMessage("Rules have been fetched Successfuly");
		responseBean.setStatus_code(HttpStatus.OK);
		responseBean.setRuleList(RuleDetailsRes);
		return new ResponseEntity<ApartmentRuleResponseBean>(responseBean, HttpStatus.OK);


	}
	
	@GetMapping("/retrive/rules")
	ResponseEntity<ApartmentRuleResponseBean>  getAllRules(){
		ApartmentRuleResponseBean responseBean = new ApartmentRuleResponseBean();
		List<ApartmentRuleDtls> RuleDetailsList =apartmentRuleManager.getAllRules();
		responseBean.setMessage("Rules have been fetched Successfuly");
		responseBean.setStatus_code(HttpStatus.OK);
		responseBean.setRuleList(RuleDetailsList);
		return new ResponseEntity<ApartmentRuleResponseBean>(responseBean, HttpStatus.OK);


	}

	@PutMapping("/delete/rule/{ruleId}")
	ResponseEntity<ApartmentRuleResponseBean> updateDeleteFlag(@PathVariable("ruleId") int ruleId){
		ApartmentRuleResponseBean responseBean = new ApartmentRuleResponseBean();
		apartmentRuleManager.updateDeleteFlag(ruleId);
		responseBean.setMessage("Rule has been Deleted Successfully");
		responseBean.setStatus_code(HttpStatus.OK);
		return new ResponseEntity<ApartmentRuleResponseBean>(responseBean,HttpStatus.OK);

	}
}


