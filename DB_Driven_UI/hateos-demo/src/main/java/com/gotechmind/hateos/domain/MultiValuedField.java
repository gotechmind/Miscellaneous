package com.gotechmind.hateos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MultiValuedField {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;

private String countryName;
private Long parentFieldId;

public MultiValuedField() {
	
}
public MultiValuedField(Long id,
		String countryName,
		Long parentFieldId) {
	this.id = id;
	this.countryName = countryName;
	this.parentFieldId = parentFieldId;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public Long getParentFieldId() {
	return parentFieldId;
}
public void setParentFieldId(Long parentFieldId) {
	this.parentFieldId = parentFieldId;
}
}
