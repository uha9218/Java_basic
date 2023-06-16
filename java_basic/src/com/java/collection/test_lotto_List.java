package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_lotto_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lottoNum = new ArrayList();

		for (int i = 1; i <= 45; i++) {
			lottoNum.add(i);
		}
		for (int i = 0; i < lottoNum.size() * 1000; i++) {
			int targetIndex = (int) (Math.random() * 44 + 1);
			int tmp = (Integer) lottoNum.get(targetIndex);
			lottoNum.set(targetIndex, lottoNum.get(0));
			lottoNum.set(0, tmp);
		}

		List result = lottoNum.subList(0, 6);
		System.out.println(result);

//		Collections.sort(result);
//		System.out.println(result);
//		
//		Collections.reverse(result);
//		System.out.println(result);
//		

	}

}
