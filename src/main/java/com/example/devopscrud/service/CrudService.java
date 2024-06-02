package com.example.devopscrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.devopscrud.model.CrudObject;
import com.example.devopscrud.repository.CrudInterface;

@Service
public class CrudService {

	@Autowired
	private CrudInterface crudrepo;
	
	
	public List<CrudObject> getAllObject(){
		return crudrepo.findAll();
	}


	public List<CrudObject> addAllObject(List<CrudObject> crudObject) {
		return crudrepo.saveAll(crudObject);
	}
	
}
