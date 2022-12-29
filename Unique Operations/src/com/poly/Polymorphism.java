package com.poly;


class Plane{
	void takeOff() {
		System.out.println("I take off before flying");
	}
	void fly() {
		System.out.println("I fly like all the planes");
	}
	
}

class LocalPlane extends Plane{
	void takeOff() {
		System.out.println("I take off from a small airport");
	}
	void fly() {
		System.out.println("I fly like at a moderate height");
	}
	void localTravel() {
		System.out.println("i travel within the locals");
	}
}

class InternationalPlane extends Plane{
	void takeOff() {
		System.out.println("I take off from a small airport");
	}
	void fly() {
		System.out.println("I fly like at a moderate height");
	}
	void intertravel() {
		System.out.println("I fly across countries");
	}
}

class Airport{
	void permit (Plane p) {
		p.fly();
		p.takeOff();
	}
}
public class Polymorphism{
	public static void main(String[] args) {
		Plane lp= new LocalPlane();
		Plane ip= new InternationalPlane();
		((LocalPlane)(lp)).localTravel();
		((InternationalPlane)(ip)).intertravel();
		Airport a=new Airport();
		a.permit(lp);
		a.permit(ip);
		
	}
}