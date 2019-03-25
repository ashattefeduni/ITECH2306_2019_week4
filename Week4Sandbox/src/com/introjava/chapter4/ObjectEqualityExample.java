package com.introjava.chapter4;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 *
 * ObjectEqualityExample - Demonstrates some Object equality behavior using StringBuilders
 */

public class ObjectEqualityExample
{
	public static void main(String[] args)
	{
		StringBuilder word3 = new StringBuilder("some text");
		StringBuilder word4 = new StringBuilder("some text");	
		if(word3 == word4)
		{
			System.out.println("objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		word3 = word4;
		if(word3 == word4)
		{
			System.out.println("objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}
}
