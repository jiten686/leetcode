package designPattern.nullObject;

public class Car implements IVehicle {

	@Override
	public int getSeatingCapacity() {
		return 4;
	}

	@Override
	public int getMileage() {
		return 20;
	}

}
