package designPattern.strategy;

import designPattern.strategy.strategyImpl.SpecialDrive;

public class OffRoadVehicle extends Vehicle {

	OffRoadVehicle() {
		super(new SpecialDrive());
	}

}
