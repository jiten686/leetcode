package designPattern;

public class factoryPattern {

	public static void main(String[] args) {
		VehicleMrg mgr = new VehicleMrg();
		Vehicle vehicle = mgr.getVehicle(2);
		if (vehicle != null)
			vehicle.printVehicle();
	}

}

class VehicleMrg {

	public Vehicle getVehicle(int type) {
		switch (type) {
		case 1:
			return new TwoWheeler();
		case 2:
			return new FourWheeler();
		default:
			return null;
		}
	}
}

interface Vehicle {
	void printVehicle();
}

class TwoWheeler implements Vehicle {

	@Override
	public void printVehicle() {

		System.out.println("I am TwoWheeler");
	}

}

class FourWheeler implements Vehicle {

	@Override
	public void printVehicle() {

		System.out.println("I am FourWheeler");
	}

}