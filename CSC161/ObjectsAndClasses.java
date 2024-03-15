package chapter9;

public class ObjectsAndClasses {

	class Circle{
		double radius = 1;
		
	Circle(){
			
		System.out.println("I am the default constructor");
	}
		
	Circle(double r){
		
		radius = r;
		System.out.println("I am the second constructor");
		
	}

	public double getArea() {
		
		System.out.println("I am the third constructor");
		return radius * radius * Math.PI;
		
	}
	
	
}
	
}



	