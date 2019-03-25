package com.introjava.chapter4;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 *
 * ObjectReferenceExample - Demonstrates some object referencing behavior
 */

public class ObjectReferenceExample
{
	public static void main(String[] args)
	{
		Object a = new Object();
		Object b = new Object();
		System.out.println(a);
		System.out.println(b);
		a = b;
		System.out.println(a);
		System.out.println(b);	
	}
}
