package week3.day1;


// understanding polymorphism 

public class Calculator {

	public int add(int a, int b) {
		
		return a+b;
		
	}
	
	public int add(int a, int b, int c) {
		
		return a+b+c;
		
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public int sub(int a, int b) {
		return a-b;
		
	}
	
	public double mul(double a,int b) {
		
		return a*b;
	}
	
   public double mul(int a,int b) {
		
		return a*b;
	}
	
}
