package week3.day1;

public class Calculation extends Calculator{

	public static void main(String[] args) {
		
		
		Calculator calculator = new Calculator();
		
		System.out.println("Addition of two int number: "+calculator.add(10, 15));
		System.out.println("Addition of three int number: "+calculator.add(10, 5,10));
		System.out.println("Subtraction of two int number: "+calculator.sub(10, 45));
		System.out.println("Subtraction of two double number: "+calculator.sub(10.0, 5.2));
		System.out.println("Multiplication of two int number: "+calculator.mul(10.4, 5));
		System.out.println("Multiplication of one int and one double: "+calculator.mul(10, 5));
		
	}

}
