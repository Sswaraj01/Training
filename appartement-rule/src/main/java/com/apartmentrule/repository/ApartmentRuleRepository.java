package com.apartmentrule.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apartmentrule.model.RuleDetailsEntity;

@Repository
public interface ApartmentRuleRepository extends JpaRepository<RuleDetailsEntity, Long>{

	@Query("SELECT r FROM RuleDetailsEntity r WHERE r.apartment_id = :apartment_id and deleted_flag='N'")
	public List<RuleDetailsEntity> findRuleDetails(@Param("apartment_id") String apartment_id);


	@Modifying
	@Query("UPDATE RuleDetailsEntity r SET r.deleted_flag = 'Y' WHERE r.rule_id = :rule_id")
	public void updateDeleteFlag(@Param("rule_id") long rule_id);

	@Override
	@Query("SELECT r FROM RuleDetailsEntity r WHERE r.rule_id = :rule_id and deleted_flag='N'")
	public Optional<RuleDetailsEntity> findById(@Param("rule_id") Long ruleId);

	@Override
	@Query("SELECT r FROM RuleDetailsEntity r WHERE deleted_flag='N'")
	public List<RuleDetailsEntity> findAll();




}
