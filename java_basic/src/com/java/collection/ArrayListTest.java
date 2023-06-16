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
		System.out.println(list.indexOf(1)); // ���� ù��°�͸� ã��

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
		// remove�� ������� �ڵ����� ä����
		list.remove("123"); // list�� ��� "123" ���ڿ� ���� -> ���� ����
		list.remove(1); // ����Ʈ 1�� �ε��� ����

		System.out.println(list);

		// ���ڸ� �����Ұ��
		List deleteInt = new ArrayList();
		deleteInt.add(1);
		list.removeAll(deleteInt);

		System.out.println(list);

		/* retainAll */
		System.out.println("=========retainAll===========");
		System.out.println(list);

		/* set */
		System.out.println("=========set===========");
		list.set(3, 8); // 3������ 8�� �ٲٱ�
		System.out.println(list);

		/* size */
		System.out.println("=========size===========");
		System.out.println(list.size());

	}
}
