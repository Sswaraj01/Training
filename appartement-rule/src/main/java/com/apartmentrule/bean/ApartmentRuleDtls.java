package com.apartmentrule.bean;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Component
public class ApartmentRuleDtls {
	
	private  long rule_id;
	@NotBlank private String apartment_id;
	@NotBlank private String unit_type;
	//@Pattern(regexp = "^[0-9]*$") 
	private long fixed_charge;
	private long per_squarefoot_charge;
	private long rent_charge;
	private Date effective_date;
	public ApartmentRuleDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApartmentRuleDtls(long rule_id, String apartment_id, String unit_type, long fixed_charge,
			long per_squarefoot_charge, long rent_charge, Date effective_date, boolean deleted_flag) {
		super();
		this.rule_id = rule_id;
		this.apartment_id = apartment_id;
		this.unit_type = unit_type;
		this.fixed_charge = fixed_charge;
		this.per_squarefoot_charge = per_squarefoot_charge;
		this.rent_charge = rent_charge;
		this.effective_date = effective_date;
	}
	public long getRule_id() {
		return rule_id;
	}
	public void setRule_id(long rule_id) {
		this.rule_id = rule_id;
	}
	public String getApartment_id() {
		return apartment_id;
	}
	public void setApartment_id(String apartment_id) {
		this.apartment_id = apartment_id;
	}
	public String getUnit_type() {
		return unit_type;
	}
	public void setUnit_type(String unit_type) {
		this.unit_type = unit_type;
	}
	public long getFixed_charge() {
		return fixed_charge;
	}
	public void setFixed_charge(long fixed_charge) {
		this.fixed_charge = fixed_charge;
	}
	public long getPer_squarefoot_charge() {
		return per_squarefoot_charge;
	}
	public void setPer_squarefoot_charge(long per_squarefoot_charge) {
		this.per_squarefoot_charge = per_squarefoot_charge;
	}
	public long getRent_charge() {
		return rent_charge;
	}
	public void setRent_charge(long rent_charge) {
		this.rent_charge = rent_charge;
	}
	public Date getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}
}
