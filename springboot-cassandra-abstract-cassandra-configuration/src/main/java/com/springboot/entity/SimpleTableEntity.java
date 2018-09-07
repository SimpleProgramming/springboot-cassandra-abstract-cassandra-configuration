package com.springboot.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("simple_table")
public class SimpleTableEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@PrimaryKey
	private SimpleTablePrimaryKey primaryKey;

	@Column("created_time")
	private Date createdTime = new Date();

	@Column("simple_type")
	private SimpleTypeEntity simpleType;

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public SimpleTypeEntity getSimpleType() {
		return simpleType;
	}

	public void setSimpleType(SimpleTypeEntity simpleType) {
		this.simpleType = simpleType;
	}

	public SimpleTablePrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(SimpleTablePrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}
}