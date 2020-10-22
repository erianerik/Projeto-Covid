package com.deverianerik.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deverianerik.covid.model.ResultadoDadosModel;
import com.deverianerik.covid.service.SistemaServiceImp;

@Controller
public class HomeController {
	
	@Autowired
	private SistemaServiceImp sistemaService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/buscarDados")
	@ResponseBody
	public ResultadoDadosModel buscarDadosCovid(String estado, String cidade) throws Exception {
		
		ResultadoDadosModel dadosCovid = sistemaService.buscarDadosCidade(estado, cidade);
		
		return dadosCovid;
	}
	
}
