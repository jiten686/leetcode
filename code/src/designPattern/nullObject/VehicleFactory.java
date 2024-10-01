package designPattern.nullObject;

public class VehicleFactory {

	public IVehicle getVehicle(String vehicle) {

		if (vehicle.equals("car"))
			return new Car();
		
		return new NullVehicle();

	}

}
