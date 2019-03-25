package com.introjava.chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		//Example of a nested loop
		
		int i=0,
			j=0;
		
		while (i < 10){
			while (j<10) {
				System.out.print((i + j) + "\t");
				j++;
			}
			j = 0;
			i++;
			System.out.println();
		}

	}

}
