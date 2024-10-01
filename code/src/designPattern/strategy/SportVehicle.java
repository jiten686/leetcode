package designPattern.strategy;

import designPattern.strategy.strategyImpl.SpecialDrive;

public class SportVehicle extends Vehicle {

	SportVehicle() {
		super(new SpecialDrive());

	}

}
