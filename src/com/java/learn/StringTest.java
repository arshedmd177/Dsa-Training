package com.java.learn;

import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> c =new ArrayList<>();
		String S = "ABCDBA";
		for(int i=0; i<S.length();i++) {
			c.add(S.charAt(i));
		}
		for(char t: c) {
			int count = (int) c.stream().filter(i-> i.equals(t)).count();
			if(count==1) {
				System.out.println(t);
				System.exit(0);
			}
		}
	}

}
