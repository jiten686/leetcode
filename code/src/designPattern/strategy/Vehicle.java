package designPattern.strategy;

import designPattern.strategy.strategyImpl.IDriveStrategy;

public class Vehicle {
	
	IDriveStrategy driveObj;
	
	Vehicle(IDriveStrategy driveObj){
		this.driveObj=driveObj;
	}
	
	public void drive() {
		driveObj.drive();
	}

}
