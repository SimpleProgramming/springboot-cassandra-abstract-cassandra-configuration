package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.SimpleTableEntity;
import com.springboot.entity.SimpleTablePrimaryKey;

@Repository
public interface CassandraRepository extends CrudRepository<SimpleTableEntity, SimpleTablePrimaryKey> {
	
}
