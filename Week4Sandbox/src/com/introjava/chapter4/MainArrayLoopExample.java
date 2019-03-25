package com.introjava.chapter4;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 *
 * MainArrayLoopExample - Demonstrates how the arguments to 'main' can be accessed as an array of Strings
 * 
 * In the Eclipse project provided, the data 'hello I am "some strings"' is included in the run time configuration as a program argument
 */

public class MainArrayLoopExample
{
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
