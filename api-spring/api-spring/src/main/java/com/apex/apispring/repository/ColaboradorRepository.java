package com.apex.apispring.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.apex.apispring.model.ColaboradorModel;

public interface ColaboradorRepository extends Repository<ColaboradorModel, Integer>{
	
	void save (ColaboradorModel colaborador);
	
	List<ColaboradorModel> findAll();
	
	ColaboradorModel findBYCodigo(Integer codigo);
	
	void delete (ColaboradorModel colaborador);
	
	

}
