package week3.day1;

//import week3.day3.Vehicle;

public class Car extends Vehicle{
	
	public void driveCar() {
		System.out.println("Drive car");
	}

	public static void main(String[] args) {
		
		//Vehicle veh=new Vehicle();
		// veh.applyBarake();
		
		
		
		Car myCar=new Car();
		myCar.driveCar();
		myCar.applyBrake();
		myCar.soundHorn();
		
		System.out.println("audimyCar.mileage");
	}

}
