package com.deverianerik.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("results")
public class ResultadoDadosItensModel {
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("city_ibge_code")
	private int cityIbgeCode;
	
	@JsonIgnoreProperties("date")
	private String date;
	
	@JsonProperty("epidemiological_week")
	private int epidemiologicalWeek;

	@JsonProperty("estimated_population")
	private int estimatedPopulation;
	
	@JsonProperty("estimated_population_2019")
	private int estimatedPopulationLastYear;
	
	@JsonProperty("is_last")
	private boolean isLast;
	
	@JsonProperty("is_repeated")
	private boolean isRepeated;
	
	@JsonProperty("last_available_confirmed")
	private int lastAvailableConfirmed;
	
	@JsonProperty("last_available_confirmed_per_100k_inhabitants")
	private double lastAvailableConfirmedPerCemKInhabitants;
	
	@JsonProperty("last_available_date")
	private String lastAvailableDate;
	
	@JsonProperty("last_available_death_rate")
	private double lastAvailableDeathRate;
	
	@JsonProperty("last_available_deaths")
	private int lastAvailableDeaths;
	
	@JsonProperty("new_confirmed")
	private int newConfirmed;
	
	@JsonProperty("new_deaths")
	private int newDeaths;
	
	@JsonProperty("order_for_place")
	private int orderForPlace;
	
	@JsonProperty("place_type")
	private String placeType;
	
	@JsonProperty("state")
	private String state;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCityIbgeCode() {
		return cityIbgeCode;
	}
	public void setCityIbgeCode(int cityIbgeCode) {
		this.cityIbgeCode = cityIbgeCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getEpidemiologicalWeek() {
		return epidemiologicalWeek;
	}
	public void setEpidemiologicalWeek(int epidemiologicalWeek) {
		this.epidemiologicalWeek = epidemiologicalWeek;
	}
	public int getEstimatedPopulation() {
		return estimatedPopulation;
	}
	public void setEstimatedPopulation(int estimatedPopulation) {
		this.estimatedPopulation = estimatedPopulation;
	}
	public int getEstimatedPopulationLastYear() {
		return estimatedPopulationLastYear;
	}
	public void setEstimatedPopulationLastYear(int estimatedPopulationLastYear) {
		this.estimatedPopulationLastYear = estimatedPopulationLastYear;
	}
	public boolean isLast() {
		return isLast;
	}
	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}
	public boolean isRepeated() {
		return isRepeated;
	}
	public void setRepeated(boolean isRepeated) {
		this.isRepeated = isRepeated;
	}
	public int getLastAvailableConfirmed() {
		return lastAvailableConfirmed;
	}
	public void setLastAvailableConfirmed(int lastAvailableConfirmed) {
		this.lastAvailableConfirmed = lastAvailableConfirmed;
	}
	public double getLastAvailableConfirmedPerCemKInhabitants() {
		return lastAvailableConfirmedPerCemKInhabitants;
	}
	public void setLastAvailableConfirmedPerCemKInhabitants(double lastAvailableConfirmedPerCemKInhabitants) {
		this.lastAvailableConfirmedPerCemKInhabitants = lastAvailableConfirmedPerCemKInhabitants;
	}
	public String getLastAvailableDate() {
		return lastAvailableDate;
	}
	public void setLastAvailableDate(String lastAvailableDate) {
		this.lastAvailableDate = lastAvailableDate;
	}
	public double getLastAvailableDeathRate() {
		return lastAvailableDeathRate;
	}
	public void setLastAvailableDeathRate(double lastAvailableDeathRate) {
		this.lastAvailableDeathRate = lastAvailableDeathRate;
	}
	public int getLastAvailableDeaths() {
		return lastAvailableDeaths;
	}
	public void setLastAvailableDeaths(int lastAvailableDeaths) {
		this.lastAvailableDeaths = lastAvailableDeaths;
	}
	public int getNewConfirmed() {
		return newConfirmed;
	}
	public void setNewConfirmed(int newConfirmed) {
		this.newConfirmed = newConfirmed;
	}
	public int getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		this.newDeaths = newDeaths;
	}
	public int getOrderForPlace() {
		return orderForPlace;
	}
	public void setOrderForPlace(int orderForPlace) {
		this.orderForPlace = orderForPlace;
	}
	public String getPlaceType() {
		return placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
