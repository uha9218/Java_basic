package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		System.out.println("=========put=========");
		map.put("a", 1);
		map.put("b", 'A');
		map.put("c", "123");
		map.put("d", false);

		System.out.println(map);
		
		Map addMap = new HashMap();
		addMap.put("e", "abc");
		addMap.put("f", "def");

		map.putAll(addMap);
		System.out.println(map);
		
		System.out.println("=========containsKey=========");
		System.out.println(map.containsKey("c"));
		
		System.out.println("=========get=========");
		System.out.println(map.get("c"));
		
		System.out.println("=========replace & put=========");
		// put은 replace를 대체할 수 있으나
		// 없는 key값을 put 할경우에는 새로운 key값이 생기고
		// replace할 경우 key 값이 없을 경우 아무일도 일어나지 않는다
		map.put("c", "456");
		System.out.println(map);

		map.replace("e", "456");
		System.out.println(map);

		map.remove("c");
		System.out.println(map);
		
		System.out.println("=========size=========");

		System.out.println(map.size());

		
		System.out.println("=========key,value가져오기(key)=========");
		Set keys = map.keySet(); //중복을 제거해서 key들을 출력
		System.out.println(keys);

		Collection values = map.values();	//중복 포함 value들 출력
		System.out.println(values);
		
		//key값과 value값을 짝지어서 한줄씩 하나씩 가져오기-> key값으로 value를 꺼냄
		Set keySet = map.keySet();
		//방법 1
		Iterator itkey = keySet.iterator();
		while(itkey.hasNext()) {
			String key = (String)itkey.next();	//key
			System.out.println(map.get(key));	//value
		}
		//방법2
		for(Object key : keySet) {
			System.out.println(map.get(key));
		}
		
		System.out.println("=========key,value가져오기(entry)=========");
		//entry set로 value하나씩 쌍으로 가져오기 -> entry 하나식 빼냄
		Set entrySet = map.entrySet();		
		//방법1
		Iterator itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}		
		//방법2
		for(Object entryObj : entrySet) {
			Entry entry = (Entry)entryObj;
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	}
}
