package com.java.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CompareArray {

	public static void main(String[] args) {
		// check sum pair
		Character arr1[] = { 'a', 'b', 'e', 'e' };
		Character arr2[] = { 'x', 'b', 'z', 'e' };

		Set<Character> charSet = new HashSet<>(Arrays.asList(arr1));

		Set<Character> charSet1 = new HashSet<>(Arrays.asList(arr2));

		Optional<String> s = charSet.stream().filter(c -> charSet1.contains(c)).map(e -> e.toString()).findFirst();

		if (s.isPresent()) {
			System.out.println(s.get() + ":duper");
		} else {
			System.out.println("no dupes");
		}

		// reverse a string naive
		List<Character> lRev = new ArrayList<>();
		
		String rev = "hello hughes";
		char arr4[] = rev.toCharArray();
		for (char a : rev.toCharArray()) {
			lRev.add(a);
		}
		Collections.reverse(lRev);
		System.out.println(lRev);

		// best
		int strSize = arr4.length;
		char[] JavaCharArray = new char[strSize];
		System.out.println(strSize);
			for (int i = 0; i < strSize; i++) {
				JavaCharArray[i] = arr4[strSize-1-i];
				System.out.println(JavaCharArray[i]);
				
			}
		
		System.out.println(JavaCharArray);
		
		//merge and sort two arrays
		// naive method
		Integer intArr[] = { -99, -99, 10, 8, 9 };
		Integer intArr1[] = { 9, 0, 4 };
		
		List<Integer> lis = new ArrayList<>(Arrays.asList(intArr));
		List<Integer> lis1 = new ArrayList<>(Arrays.asList(intArr1));
		
		lis.addAll(lis1);
		//Collections.sort(lis);
		System.out.println("sorted list: "+lis);
		
		//best
		Set<Integer> intSet = new TreeSet<>();
		int biggie = 0;
			if(lis.get(0) < lis.get(1)) {
				biggie = lis.get(1);
			} else {
				biggie = lis.get(0);
			}
		intSet.addAll(lis1);
		System.out.println("sorted list: "+intSet);
		for(int i=1;i<lis.size()-1;i++) {
			if(biggie < lis.get(i+1)) {
				biggie = lis.get(i+1);
			}
		}
		System.out.println("biggie: "+biggie);
		
		
		
		
	}
}
