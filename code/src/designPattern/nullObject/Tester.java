package designPattern.nullObject;

public class Tester {

	public static void main(String[] args) {
		VehicleFactory vf = new VehicleFactory();
		IVehicle vehicle = vf.getVehicle("car");

		printVehicleDetails(vehicle);

	}

	private static void printVehicleDetails(IVehicle vehicle) {

		System.out.println("Seating capacity : " + vehicle.getSeatingCapacity());
		System.out.println("Mileage : " + vehicle.getMileage());

	}

	/*
	 * Problem in below method is we have to check null ...what if there is many
	 * objects ?? we can't add null check every where
	 */

//	private static void printVehicleDetails(IVehicle vehicle) {
//		if(vehicle !=null){
//      	System.out.println("Seating capacity : " + vehicle.getSeatingCapacity());
//			System.out.println("Mileage : " + vehicle.getMileage());
//
//	     }
//	}

}
