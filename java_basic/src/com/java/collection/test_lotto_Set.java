package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class test_lotto_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set =new HashSet();
		
		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
		}
		
		System.out.println(set);
	}

}
