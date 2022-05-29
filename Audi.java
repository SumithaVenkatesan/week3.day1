package week3.day1;



public class Audi extends Car {
	
	public void airBag(){
		System.out.println("Air bag");
	}

	public static void main(String[] args) {
	
		Audi myAudi=new Audi();
		myAudi.applyBrake();
		myAudi.driveCar();
		myAudi.soundHorn();
		myAudi.airBag();
		
	}

}
