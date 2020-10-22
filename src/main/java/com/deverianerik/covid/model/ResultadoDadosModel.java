package com.deverianerik.covid.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoDadosModel {
	
	@JsonProperty("count")
	private int count;
	
	@JsonProperty("next")
	private String next;
	
	@JsonProperty("previous")
	private String previous;
	
	@JsonProperty("results")
	private List<ResultadoDadosItensModel> results;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public List<ResultadoDadosItensModel> getResults() {
		return results;
	}
	public void setResults(List<ResultadoDadosItensModel> results) {
		this.results = results;
	}
	
	

}
