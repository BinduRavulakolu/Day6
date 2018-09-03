package com.capgemini.day6;

import java.util.Objects;

public class CellPhone {
	String company;
	 String model;
	 String description;
	 String operatingSystem;
	 double price;
	 
	 public CellPhone() {
			super();
			
		}
	 public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		CellPhone c = (CellPhone) obj;
		return this.company == c.company && this.operatingSystem == c.operatingSystem 
					&& this.model == c.model;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(company,operatingSystem,model);
	}
}
