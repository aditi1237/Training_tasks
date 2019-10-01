package Datatypes;
import java.util.*;

public class ShowRoom {
	String ShowName;
	Map<String,Car> cars;
	public String getShowName() {
	return ShowName;
	}
	public void setShowName(String ShowName) {
	this.ShowName = ShowName;
	}
	public Map<String, Car> getcars() {
	return cars;
	}
	public void setcars(Map<String, Car> cars) {
	this.cars = cars;
	}

}
