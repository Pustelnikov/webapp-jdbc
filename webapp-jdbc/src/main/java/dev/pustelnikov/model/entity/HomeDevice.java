package dev.pustelnikov.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HomeDevice {
	
	private int id;
	private String description;
	private int power;
	private boolean status; //not in the db, there is no sense
	
	private String printStatus() {
		if (status) {
			return "Switched On";
		} else {
			return "Switched OFF";
		}
	}
	
	@Override
	public String toString() {
		return description + ", " + power + " Watt, " + this.printStatus();
	}
}