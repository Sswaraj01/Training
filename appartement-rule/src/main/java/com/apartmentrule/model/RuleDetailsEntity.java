package com.apartmentrule.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="APARTMENT_RULE_MASTER")
public class RuleDetailsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="RULE_ID")
	private  long rule_id;
	@Column(name="APARTMENT_ID",columnDefinition ="varchar(10)")
	private String apartment_id;
	@Column(name="UNIT_TYPE",columnDefinition ="varchar(10)")
	private String unit_type;
	@Column(name="FIXED_CHARGE")
	private long fixed_charge;
	@Column(name="PER_SQUAREFOOT_CHARGE")
	private long per_squarefoot_charge;
	@Column(name="RENT_CHARGE")
	private long rent_charge;
	@Column(name="EFFECTIVE_DATE", columnDefinition="TIMESTAMP")
	private Date effective_date;
	@JsonIgnore
	@Column(name = "DELETED_FLAG", columnDefinition = "boolean default 'N'", nullable = false)
	private String deleted_flag ;
	public RuleDetailsEntity(long rule_id, String apartment_id, String unit_type, long fixed_charge,
			long per_squarefoot_charge, long rent_charge, Date effective_date, String deleted_flag) {
		super();
		this.rule_id = rule_id;
		this.apartment_id = apartment_id;
		this.unit_type = unit_type;
		this.fixed_charge = fixed_charge;
		this.per_squarefoot_charge = per_squarefoot_charge;
		this.rent_charge = rent_charge;
		this.effective_date = effective_date;
		this.deleted_flag = deleted_flag;
	}
	public RuleDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	public String isDeleted_flag() {
		return deleted_flag;
	}
	public void setDeleted_flag(String deleted_flag) {
		this.deleted_flag = deleted_flag;
	}
	
	
}
