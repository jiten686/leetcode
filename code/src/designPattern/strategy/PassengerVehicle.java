package designPattern.strategy;

import designPattern.strategy.strategyImpl.NormalDrive;

public class PassengerVehicle extends Vehicle {

	PassengerVehicle() {
		super(new NormalDrive());
	}

}