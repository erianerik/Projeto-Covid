package com.deverianerik.covid.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultadoDadosItensModel {
	
	private String city;
	private int cityIbgeCode;
	private String date;
	private int epidemiologicalWeek;
	private int estimatedPopulation;
	private int estimatedPopulationLastYear;
	private boolean isLast;
	private boolean isRepeated;
	private int lastAvailableConfirmed;
	private double lastAvailableConfirmedPerCemKInhabitants;
	private String lastAvailableDate;
	private double lastAvailableDeathRate;
	private int lastAvailableDeaths;
	private int newConfirmed;
	private int newDeaths;
	private int orderForPlace;
	private String placeType;
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
