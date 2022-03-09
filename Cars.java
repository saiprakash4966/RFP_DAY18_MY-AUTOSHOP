package com.bl;

public class Cars 
{
     int speed;
     double regularPrice;
     String color;

    public Cars(int speed, double regularPrice, String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice()
    {
        return regularPrice;
    }
}
 
 
 
 