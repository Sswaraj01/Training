package com.apartmentrule.services;

import java.util.List;

import com.apartmentrule.bean.ApartmentRuleDtls;

public interface ApartmentRuleManager {

	ApartmentRuleDtls createRule(ApartmentRuleDtls ruleDetails);

	ApartmentRuleDtls getRulesById(int ruleId);

	List<ApartmentRuleDtls> getRulesByApptId(String apptId);

	void updateDeleteFlag(int ruleId);

	List<ApartmentRuleDtls> getAllRules();

}
