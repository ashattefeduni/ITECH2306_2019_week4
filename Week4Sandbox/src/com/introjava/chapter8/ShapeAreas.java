package com.introjava.chapter8;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 * 
 * ShapeAreas - Demonstrates dynamic binding of polymorphic methods
 */

public class ShapeAreas
{
    public static void main(String[] args)
    {
    	Shape[] shapes = 
    	{
	        new Square(null, 250),
	        new Rectangle(null, 25, 50),
	        new Oval(null, 20,10),
	        new Circle(null, 10),
	        new RoundedRectangle(null, 25, 50, 10),
	        new RightAngledTriangle(null, 100, 50),
	    };

        for (int i = 0; i < shapes.length; i++)
        {
            Shape shape = shapes[i];
            System.out.println("The area of " + shape.getClass().getSimpleName() + " is " + shape.getArea());
        }
    }
}
