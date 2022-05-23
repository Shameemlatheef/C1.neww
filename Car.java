package com.eva;



public class Car {
	 String model;
	 String Companyname;
	 String Color;
	 String Engine;
	 public static void main(String[] args) {
			
			Car h=new Car();
			Engine j=new Engine();
			
			
			h.model="Harrier";
			h.Companyname="tata";
			h.Color="red";
			h.Engine="1400";
			j.rmp=220;
			j.power=1500;
			j.manufacturer="tata";
			//j.turbo();
			
			
			System.out.println(h.model);
			System.out.println(h.Companyname);
			System.out.println(h.Color);
			System.out.println(h.Engine);
			System.out.println(j.rmp);
			System.out.println(j.power);
			System.out.println(j.manufacturer);
			//j.turbo();
	}

}
 class Engine {
	int rmp;
	int power;
	String manufacturer;
	Boolean hasTurbo;
	
 
	
	void turbo() {
		hasTurbo=true;
		System.out.println(hasTurbo);
	}
 
	
	
	}

 	
	

 
