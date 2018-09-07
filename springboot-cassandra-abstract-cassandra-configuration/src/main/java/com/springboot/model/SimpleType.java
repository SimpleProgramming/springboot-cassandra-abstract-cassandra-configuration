package com.springboot.model;

import java.io.Serializable;

public class SimpleType implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
