package com.srmasset.api.operacao.srmasset.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "operacao")
@EntityListeners(AuditingEntityListener.class)
public class Operation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min=10,max =30)
	private String name;
	@NotNull
	private String document;
	@NotNull
	private double limitClient;
	@NotNull
	private String riskClient;
	private double interest;

	

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDocument() {
		return document;
	}
	public double getLimitClient() {
		return limitClient;
	}
	public String getRiskClient() {
		return riskClient;
	}
	public double getInterest() {
		return interest;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public void setLimitClient(double limitClient) {
		this.limitClient = limitClient;
	}
	public void setRiskClient(String riskClient) {
		this.riskClient = riskClient;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}

	


}
