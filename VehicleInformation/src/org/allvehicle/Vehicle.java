package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessary() {
		System.out.println("Type of Vehicles");

	}
	public static void main(String[] args) {
	 TwoWheeler a = new TwoWheeler();
	 ThreeWheeler b = new ThreeWheeler();
	 FourWheeler c = new FourWheeler();
	 Vehicle v = new Vehicle();
	 
	    v.vehicleNecessary();
		a.bike();
		a.cycle();
		b.auto();
		c.bus();
		c.car();
		c.lorry();
	}

}
