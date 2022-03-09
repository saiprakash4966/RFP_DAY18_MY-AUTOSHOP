package com.bl;

 class Sedan extends Cars
{
	 private int length;
	    

	    public Sedan(int speed, double regularPrice, String color, int year) 
	    {
	        super(speed, regularPrice, color);
	        this.length = length;
	        
	    }

	    public double getSalePrice()
	    {
	    	if(length >20)
			{
				return super.getSalePrice() -(0.05 *super.getSalePrice());
			}
			/**
			 * otherwise we need to give 10% discount on sales price
			 */
			else
			{
				return super.getSalePrice() -(0.1 *super.getSalePrice());
			}
	        
	    }

}
