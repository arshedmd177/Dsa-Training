package com.java.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer nums1[] = {6, 0, 3, 12 };
		Integer nums2[] = {4, 3, 8 };
		//naive approach
		if(nums1!=null && nums1.length>0) {
			List<Integer> m1 = new ArrayList<>(Arrays.asList(nums2));
			for(Integer i: nums1) {
				if(m1.contains(i)) {
					System.out.println("first dupe value"+i);
					break;
				}
			}
		}
		//check duplicate
		Integer nums3[] = {6, 0, 3, 12,3 };
		
		List<Integer> m2 = new ArrayList<>(Arrays.asList(nums3));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(nums3));
		if(m2.size()>s2.size()) {
			System.out.println("dupe value");
		} else {
			System.out.println("not dupe value");
		}
		
		//without library
		Integer nums4[] = {6, 0, 3, 12,8 };
		for (int i = 0; i < nums4.length; i++) {
			for(int j = i+1; j < nums4.length; j++) {
				if(nums4[i] == nums4[j]) {
					System.out.println("dupe value");
				}
			}
			
		}
		
		//best way
		Integer nums5[] = {6, 0, 3, 12,12 };
		Arrays.sort(nums5);
		boolean dupe = false;
		for (int i = 0; i < nums5.length-1; i++) {
				if(nums5[i] == nums5[i+1]) {
					dupe = true;
					System.out.println("dupe value");
				}	
		}
		if(!dupe) {
			System.out.println("no dupe value");
		}
	}

}
