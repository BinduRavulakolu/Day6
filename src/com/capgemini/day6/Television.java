package com.capgemini.day6;

import java.util.Objects;

public class Television {
	String company; 
	String type; 
	boolean is3D_Enabled;
	double price;
	
	public Television() {
		super();
	}
	
	public Television(String company, String type, boolean is3d_Enabled, double price) {
		super();
		this.company = company;
		this.type = type;
		is3D_Enabled = is3d_Enabled;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isIs3D_Enabled() {
		return is3D_Enabled;
	}

	public void setIs3D_Enabled(boolean is3d_Enabled) {
		is3D_Enabled = is3d_Enabled;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Television tv = (Television) obj;
		return this.company == tv.company && this.type == tv.type 
					&& this.price == tv.price;
	}	
	@Override
	public int hashCode() {
		return Objects.hash(company, price, type);
	}

}
