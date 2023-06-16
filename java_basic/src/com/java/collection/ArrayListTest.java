package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();

		/* add */
		System.out.println("=========add===========");
		list.add(1);
		list.add("123");
		list.add('A');
		list.add(true);
		list.add(1);
		list.add("123");

		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.contains('A'));
		System.out.println(list.indexOf(1)); // 가장 첫번째것만 찾음

		System.out.println("=========addAll===========");
		List addList = new ArrayList();
		addList.add(1);
		addList.add(2);
		addList.add(3);
		addList.add(4);
		addList.add(5);

		list.addAll(addList);
		System.out.println(list);

		/* remove */
		System.out.println("=========remove===========");
		// remove시 빈공간을 자동으로 채워줌
		list.remove("123"); // list내 모든 "123" 문자열 삭제 -> 사용시 주의
		list.remove(1); // 리스트 1번 인덱스 삭제

		System.out.println(list);

		// 숫자를 삭제할경우
		List deleteInt = new ArrayList();
		deleteInt.add(1);
		list.removeAll(deleteInt);

		System.out.println(list);

		/* retainAll */
		System.out.println("=========retainAll===========");
		System.out.println(list);

		/* set */
		System.out.println("=========set===========");
		list.set(3, 8); // 3번지를 8로 바꾸기
		System.out.println(list);

		/* size */
		System.out.println("=========size===========");
		System.out.println(list.size());

	}
}
