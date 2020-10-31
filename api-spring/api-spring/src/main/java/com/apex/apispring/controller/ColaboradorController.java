package com.apex.apispring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apex.apispring.model.ColaboradorModel;
import com.apex.apispring.repository.ColaboradorRepository;
	
	@RestController
	@RequestMapping("/api")
	public class ColaboradorController {
		
	
	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	@RequestMapping(value = "/colaborador", method = RequestMethod.GET)
	public @ResponseBody List<ColaboradorModel> consultar(){
		return this.colaboradorRepository.findAll();
		
	
	}

}
