package com.java.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftZeroes {

	public static void main(String[] args) {
		// method that takes space
		// Integer nums[] = {0,1,0,3,12};
		Integer nums[] = { 0 };
		List<Integer> lis = new ArrayList<>(Arrays.asList(nums));
		int before = lis.size();
		lis.removeIf(l -> l.equals(0));
		int after = lis.size();
		System.out.println(lis);
		for (int i = 0; i < before - after; i++) {
			lis.add(0);
		}
		System.out.println(lis);

		// without taking space
		
		
		int nums2[] = {6, 0, 0, 0, 3, 12 }; // 6,3,0,0,0,12
		int leghr = nums2.length;
		for (int i = 0; i < leghr; i++) {
			if(nums2[i]!=0) {
				continue;
			} else {
				int counter1 = 1;
				int temp =0;
				for(int j = i+1; j < leghr; j++) {
					if(nums2[j]==0) {
						counter1++;
					} else {
						temp = nums2[i+counter1];
						nums2[i+counter1] = nums2[i];
						nums2[i] = temp;
						break;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(nums2));

	}

}
