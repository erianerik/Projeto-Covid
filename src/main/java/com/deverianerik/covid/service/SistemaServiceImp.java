package com.deverianerik.covid.service;

import org.apache.http.client.fluent.Request;
import org.springframework.stereotype.Service;

import com.deverianerik.covid.model.ResultadoDadosModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SistemaServiceImp implements SistemaService {

	ObjectMapper mapper = new ObjectMapper();

	@Override
	public ResultadoDadosModel buscarDadosCidade(String estado, String cidade) throws Exception {
		ResultadoDadosModel dadosCovid = new ResultadoDadosModel();
		
		System.out.println("Entro aqui");
		
		String retornoDaRequisição = Request.Get("https://brasil.io/api/v1/dataset/covid19/caso_full/data/?city="
				+ cidade + "&city_ibge_code=&date=&format=json&is_last=&order_for_place=&place_type=&search=&state="
				+ estado).execute().returnContent().asString();
		
		System.out.println(retornoDaRequisição);

		dadosCovid = mapper.readValue(retornoDaRequisição, ResultadoDadosModel.class);

		return dadosCovid;
	}
}
