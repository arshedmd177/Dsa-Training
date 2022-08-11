package com.java.learn;

public class KadaneAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, -1, 5, -9, 5, 2, -4 };
		if (intArray != null && intArray.length > 0) {
			int sum = 0;
			int total1 = intArray[0] + intArray[1];
			if (total1 > 0 && total1>sum ) {
				sum = total1;
			}
			int biggie = 0;
			for (int i = 1; i < intArray.length-1; i++) {
				int total = sum + intArray[i + 1];
				if (total > 0 && total>sum ) {
					sum = total;
					if(sum>biggie) {
						biggie =sum;
					}
					
					System.out.println(sum);
				} else 
					sum =0;
			}
			System.out.println("biggie:"+biggie);
		}		
	}

}
