package com.apartmentrule.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apartmentrule.bean.ApartmentRuleDtls;
import com.apartmentrule.model.RuleDetailsEntity;
import com.apartmentrule.repository.ApartmentRuleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApartmentRuleImpl implements ApartmentRuleManager{
	
	@Autowired
	ApartmentRuleRepository apartmentRuleRepo;

	@Override
	public ApartmentRuleDtls createRule(ApartmentRuleDtls ruleDetails) {
		ObjectMapper mapper = new ObjectMapper();
		RuleDetailsEntity ruleEntity = mapper.convertValue(ruleDetails, RuleDetailsEntity.class);
		ruleDetails=mapper.convertValue(apartmentRuleRepo.save(ruleEntity),ApartmentRuleDtls.class);
		return ruleDetails;
	}

	@Override
	public ApartmentRuleDtls getRulesById(int ruleId) {
		ObjectMapper mapper = new ObjectMapper();
		ApartmentRuleDtls apartmentRuleDtls=new ApartmentRuleDtls();
		Optional<RuleDetailsEntity> temp=apartmentRuleRepo.findById((long) ruleId);
		apartmentRuleDtls=mapper.convertValue(temp.get(),ApartmentRuleDtls.class);
		return apartmentRuleDtls;
	}

	@Override
	public List<ApartmentRuleDtls> getRulesByApptId(String apptId) {
		List<ApartmentRuleDtls> apartmentRuleList= new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		for(RuleDetailsEntity temp:apartmentRuleRepo.findRuleDetails(apptId)){
			ApartmentRuleDtls ppartmentRuleDtls = mapper.convertValue(temp, ApartmentRuleDtls.class);
			apartmentRuleList.add(ppartmentRuleDtls);
		}
		return apartmentRuleList;
	}

	@Transactional
	@Override
	public void updateDeleteFlag(int ruleId) {
		apartmentRuleRepo.updateDeleteFlag((long)ruleId);
	}

	@Override
	public List<ApartmentRuleDtls> getAllRules() {
		List<ApartmentRuleDtls> apartmentRuleList= new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		for(RuleDetailsEntity temp:apartmentRuleRepo.findAll()){
			ApartmentRuleDtls ppartmentRuleDtls = mapper.convertValue(temp, ApartmentRuleDtls.class);
			apartmentRuleList.add(ppartmentRuleDtls);
		}
		return apartmentRuleList;
	}

	

}
