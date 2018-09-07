package com.springboot.entity;

import java.io.Serializable;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("simple_type")
public class SimpleTypeEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column("name")
	private String name;

	@Column("type")
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
