package com.springboot.model;

import java.io.Serializable;
import java.util.Date;

public class SimpleTable implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;
	
	private SimpleType simpleType;

	private Date createdTime = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public SimpleType getSimpleType() {
		return simpleType;
	}

	public void setSimpleType(SimpleType simpleType) {
		this.simpleType = simpleType;
	}
}