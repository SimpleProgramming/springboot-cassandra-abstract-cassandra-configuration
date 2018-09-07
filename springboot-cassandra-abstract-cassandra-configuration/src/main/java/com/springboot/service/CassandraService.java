package com.springboot.service;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.SimpleTableEntity;
import com.springboot.entity.SimpleTablePrimaryKey;
import com.springboot.entity.SimpleTypeEntity;
import com.springboot.model.SimpleTable;
import com.springboot.model.SimpleType;
import com.springboot.repository.CassandraRepository;

@Service
public class CassandraService {

	@Autowired
	private CassandraRepository cassandraRepository;

	public SimpleTable saveIntoSimpleTable(SimpleTable simpleTable) {
		SimpleTableEntity entity = cassandraRepository.save(mapObjectToEntity(simpleTable));
		return mapEntityToObject(entity);
	}

	public SimpleTableEntity mapObjectToEntity(SimpleTable simpleTable) {
		SimpleTablePrimaryKey primaryKey = new SimpleTablePrimaryKey();
		primaryKey.setId(simpleTable.getId());
		primaryKey.setName(simpleTable.getName());

		SimpleTypeEntity typeEntity = new SimpleTypeEntity();
		typeEntity.setName(simpleTable.getSimpleType().getName());
		typeEntity.setType(simpleTable.getSimpleType().getType());

		SimpleTableEntity entity = new SimpleTableEntity();
		entity.setPrimaryKey(primaryKey);
		entity.setSimpleType(typeEntity);
		return entity;
	}

	public SimpleTable mapEntityToObject(SimpleTableEntity entity) {
		SimpleType type = new SimpleType();
		type.setName(entity.getSimpleType().getName());
		type.setType(entity.getSimpleType().getType());

		SimpleTable table = new SimpleTable();
		table.setCreatedTime(entity.getCreatedTime());
		table.setId(entity.getPrimaryKey().getId());
		table.setName(entity.getPrimaryKey().getName());
		table.setSimpleType(type);
		return table;
	}
	
	public SimpleTable fetchRecordFromSimpleTable(String id, String name) {
		SimpleTablePrimaryKey primaryKey = new SimpleTablePrimaryKey();
		primaryKey.setId(id);
		primaryKey.setName(name);
		Optional<SimpleTableEntity> entity = cassandraRepository.findById(primaryKey);
		if(!entity.isPresent()) {
			
		}
		return mapEntityToObject(entity.get());
	}
}
