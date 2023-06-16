package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HastSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		set.add(1);set.add(1);set.add(1);	//중복 미포함
		set.add('A');
		set.add("123");
		set.add(false);
		
		System.out.println(set);
		
		//iterator 지휘봉 같은느낌..
		Iterator it = set.iterator();
		while(it.hasNext()) {	//다음것이 남아있으면 
			System.out.println(it.next());			
		}
		
		System.out.println(set.size());
	}

}
