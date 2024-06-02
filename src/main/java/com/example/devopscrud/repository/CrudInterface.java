package com.example.devopscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.devopscrud.model.CrudObject;

public interface CrudInterface extends JpaRepository<CrudObject,Integer>{

}
