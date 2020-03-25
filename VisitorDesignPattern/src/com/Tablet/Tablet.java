package com.Tablet;

import com.Visitor.Visitor;

public abstract class Tablet {
	
	private String Model;
	private String Brand;
	
	
	public abstract void accept(Visitor visitor);
	
//	public Tablet(String model, String brand) {
//		super();
//		Model = model;
//		Brand = brand;
//	}
	




	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
		result = prime * result + ((Model == null) ? 0 : Model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tablet other = (Tablet) obj;
		if (Brand == null) {
			if (other.Brand != null)
				return false;
		} else if (!Brand.equals(other.Brand))
			return false;
		if (Model == null) {
			if (other.Model != null)
				return false;
		} else if (!Model.equals(other.Model))
			return false;
		return true;
	}
	
	
	
	
	

}
