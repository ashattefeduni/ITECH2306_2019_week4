package com.introjava.chapter8;

import java.awt.Graphics;
import java.awt.Point;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 * 
 * Square - concrete subclass with polymorphic methods
 */

public class Square extends OneDimensionalShape
{
	public Square(Point location, int size)
	{
		super(location, size);
	}

	@Override
	public double getArea()
	{
		return Math.pow(getDimension(), 2);
	}

	@Override
	public void draw(Graphics g)
	{
		g.fillRect(getLocation().x, getLocation().y, getDimension(), getDimension()); 		
	}
}
