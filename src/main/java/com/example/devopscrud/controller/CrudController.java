package com.example.devopscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.devopscrud.model.CrudObject;
import com.example.devopscrud.service.CrudService;

@RestController
public class CrudController {

	@Autowired
	private CrudService service;
	
	@GetMapping("/getAll")
	private List<CrudObject> getAll(){
		return service.getAllObject();
	}
	
	@PostMapping("/addAll")
	private List<CrudObject> addAll(@RequestBody List<CrudObject> crudObject){
		return service.addAllObject(crudObject);
	}
}
