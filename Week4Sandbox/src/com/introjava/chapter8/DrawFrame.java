package com.introjava.chapter8;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 * 
 * DrawFrame - graphical window demonstrating the polymorphic 'draw' method
 */

public class DrawFrame extends JFrame
{
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		Shape[] shapes =
			{ 
				new Square(new Point(70, 70), 70),
				new Rectangle(new Point(50, 150), 25, 50),
				new Oval(new Point(100, 220), 50, 30),
				new Circle(new Point(175, 100), 100),
				new RoundedRectangle(new Point(110, 160), 40, 60, 20),
				new RightAngledTriangle(new Point(180, 210), 100, 50),
			};
		
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw(g);
		}
	}

	public static void main(String[] args)
	{
		DrawFrame frame = new DrawFrame();
		frame.setTitle("Lots of shapes...");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}