package com.codeD.springCore.reference;
public class Car {

	private String carName;
	private i20 newFeature;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public i20 getNewFeature() {
		return newFeature;
	}

	public void setNewFeature(i20 newFeature) {
		this.newFeature = newFeature;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", newFeature=" + newFeature + "]";
	}
}
