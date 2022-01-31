package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "account")
public class AccountDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	//Customer ID
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 10)
	@NotBlank
	@NotNull
	private String custId;
	
	//Type of Account
	@Pattern(regexp ="^Saving?$|^Current?$")
	@NotBlank
	private String type;
	
	//Initial Deposit
	@Pattern(regexp = "[0-9]+(\\.[0-9][0-9]?)?")
	@Range(min = 500)
	private Double initalDeposite;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getInitalDeposite() {
		return initalDeposite;
	}

	public void setInitalDeposite(Double initalDeposite) {
		this.initalDeposite = initalDeposite;
	}

	
	
	
}