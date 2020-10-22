package com.deverianerik.covid.service;

import org.springframework.stereotype.Service;

import com.deverianerik.covid.model.ResultadoDadosModel;

@Service
public interface SistemaService {
	
	
	public ResultadoDadosModel buscarDadosCidade(String estado, String cidade) throws Exception;
	
}
