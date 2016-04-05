package com.gc.tdd;

import java.util.ArrayList;

public class EvenNumberGenerator {

	public ArrayList<Integer> generateAndGetEvenNumbers(int i) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		if(i<0 || i>100){
			throw new IllegalArgumentException();
		}
		
		for(int m=0; m<=i; m++){
			if(m%2 == 0){
				results.add(m);
			}
		}
		
		
		return results;
				
	}

}
