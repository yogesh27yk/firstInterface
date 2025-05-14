package org.firstinterf;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		
		car.start();
		car.stop();
		System.out.println("========");
		bike.start();
		bike.stop();
		System.out.println("Work done by QA");
		System.out.println("QA WOrk"); 
		System.out.println("Work done by Dev");
		System.out.println("Dev Work");

		



	}

}
