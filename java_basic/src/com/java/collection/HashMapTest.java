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
		// put�� replace�� ��ü�� �� ������
		// ���� key���� put �Ұ�쿡�� ���ο� key���� �����
		// replace�� ��� key ���� ���� ��� �ƹ��ϵ� �Ͼ�� �ʴ´�
		map.put("c", "456");
		System.out.println(map);

		map.replace("e", "456");
		System.out.println(map);

		map.remove("c");
		System.out.println(map);
		
		System.out.println("=========size=========");

		System.out.println(map.size());

		
		System.out.println("=========key,value��������(key)=========");
		Set keys = map.keySet(); //�ߺ��� �����ؼ� key���� ���
		System.out.println(keys);

		Collection values = map.values();	//�ߺ� ���� value�� ���
		System.out.println(values);
		
		//key���� value���� ¦��� ���پ� �ϳ��� ��������-> key������ value�� ����
		Set keySet = map.keySet();
		//��� 1
		Iterator itkey = keySet.iterator();
		while(itkey.hasNext()) {
			String key = (String)itkey.next();	//key
			System.out.println(map.get(key));	//value
		}
		//���2
		for(Object key : keySet) {
			System.out.println(map.get(key));
		}
		
		System.out.println("=========key,value��������(entry)=========");
		//entry set�� value�ϳ��� ������ �������� -> entry �ϳ��� ����
		Set entrySet = map.entrySet();		
		//���1
		Iterator itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}		
		//���2
		for(Object entryObj : entrySet) {
			Entry entry = (Entry)entryObj;
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
	}
}
