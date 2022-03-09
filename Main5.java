package com.bl;

 class Main5
{
	 public static void main(String[] args)
	 {
	        Truck T = new Truck(100, 500000, "Ash",55);
	        Sedan sd = new Sedan(200, 1500000, "Blue", 2015);
	        Ford fd = new Ford(270, 1700000, "red", 2020,1000);
	        Cars c = new Cars(150, 1000000, "gray");
	        System.out.println("Truck Price is "+T.getSalePrice());
	        System.out.println("Sedan Priceis "+sd.getSalePrice());
	        System.out.println("Ford Price is "+fd.getSalePrice());
	        System.out.println("car Price is  "+c.getSalePrice());
	 }
}
