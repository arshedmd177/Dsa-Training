package com.java.learn;

import java.util.Arrays;

public class RotateArrays { 
	//best approach

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int rCount = 8;
		
		int nums[] = {6, 1, 3, 2,12,10,19 };
		int nums1[] = Arrays.copyOf(nums,nums.length);
		int nCount = 0;
		if(rCount == nums.length) {
			System.out.println("no need to shift");
		} else if(rCount>nums.length) {
			rCount= rCount - nums.length ;
		}
		
		for(int i = 0; i < nums.length; i++) {
			int newArrayIndex = i+rCount;
			if(newArrayIndex>nums.length-1) {
				nCount =newArrayIndex-nums.length;
			} else {
				nCount = newArrayIndex;
			}
			nums1[nCount] = nums[i];
		}
		System.out.println(Arrays.toString(nums1));
		
		
	}
}
