package com.introjava.chapter8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 * 
 * TransformShapes - Demonstrates the use of the Transformable interface
 */

public class TransformShapes extends JFrame
{
	public void paint(Graphics g)
	{
		super.paint(g);
		TwoDimensionalShape[] shapes = 
			{
				new Rectangle(new Point(50, 150), 25, 50),
				new Oval(new Point(100, 220), 50, 30),
				new RoundedRectangle(new Point(110, 160), 40, 60, 20),
				new RightAngledTriangle(new Point(180, 210), 100, 50)
			};

		Transformable[] transforms = shapes;

		for (int i = 0; i < shapes.length; i++)
		{
			g.setColor(Color.gray);
			shapes[i].draw(g);
			g.setColor(Color.darkGray);
			transforms[i].switchDimensions();
			shapes[i].draw(g);
		}
	}

	public static void main(String[] args)
	{
		TransformShapes frame = new TransformShapes();
		frame.setTitle("Shapes transformed");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
