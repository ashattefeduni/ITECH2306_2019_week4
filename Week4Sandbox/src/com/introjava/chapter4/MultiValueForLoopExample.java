package com.introjava.chapter4;

/**
 * Code example from "Foundational Java: Key Elements and Practical Programming", London: Springer 2012
 * 
 * @author David Parsons
 *
 * MultiValueForLoopExample - Demonstrates a'for' loop with multiple variables
 */

public class MultiValueForLoopExample
{
	public static void main(String[] args)
	{
		for (int letterCount = 1, upperCount = 65, lowerCount = 97; letterCount <= 26; letterCount++, upperCount++, lowerCount++)
		{
			System.out.println("Lower case: " + (char)lowerCount + " Upper case: " + (char)upperCount);
		}
	}
}
