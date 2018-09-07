package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.SimpleTable;
import com.springboot.service.CassandraService;

@RestController
@RequestMapping("/cassandra")
public class CassandraController {

	@Autowired
	private CassandraService cassandraService;

	@PostMapping
	public ResponseEntity<SimpleTable> saveIntoSimpleTable(@RequestBody SimpleTable simpleTable) {
		return new ResponseEntity<>(cassandraService.saveIntoSimpleTable(simpleTable), HttpStatus.OK);
	}

	@GetMapping(path = "{id}/{name}")
	public ResponseEntity<SimpleTable> fetchRecordFromSimpleTable(@PathVariable("id") String id,
			@PathVariable("name") String name) {
		return new ResponseEntity<>(cassandraService.fetchRecordFromSimpleTable(id, name), HttpStatus.OK);
	}
}
