package Datatypes;

public class Car {
	String model;
	String carName;
	String carNumber;
	public String getmodel() {
	return model;
	}
	public void setmodel(String model) {
	this.model = model;
	}
	public String getcarName() {
	return carName;
	}
	public void setcarName(String carName) {
	this.carName = carName;
	}
	public String getcarNumber() {
	return carNumber;
	}
	public void setcarNumber(String carNumber) {
	this.carNumber = carNumber;
	}
	public Car(String isbn, String bookName, String author) {
	this.model = isbn;
	this.carName = bookName;
	this.carNumber = author;
	}

	@Override
	public String toString() {

	return getmodel()+" "+getcarName()+" "+getcarNumber();
	}

}
