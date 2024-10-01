package designPattern.strategy;

public class Main {
	/*
	 * Problem
	 * 
	 * vehicle Base class has drive method 
	 * vehicle <- offRoadVehicle   : has special drive
	 * vehicle <- PassengerVehicle
	 * vehicle <- SportVehicle     : has special drive 
	 * 
	 * then in offRoadVehicle and SportVehicle has duplicate code in drive method
	 * 
	 */
	

	public static void main(String[] args) {
		Vehicle vehicle = new SportVehicle();
		vehicle.drive();

	}

}
