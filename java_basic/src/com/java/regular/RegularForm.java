package com.java.regular;

import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RegularForm {
	
	private static RegularForm instance = new RegularForm();
	private RegularForm() {}
	public static RegularForm getInstance() {
		return instance;
	}

//	�ν��Ͻ� ����
	private Map<String, String> regularForm = new TreeMap<String, String>();
//	.java�� ������ �ܺο��� ���Խ� ���� �Ұ� -> regex.properties ����� ����
//	�ܺ� ����ڵ� ���Խ� properties ���ϸ� �����ϸ� �̿� ����
	private static final String path = "com/java/regular/regex";
//	�ʱ�ȭ ���
	{
//		������ path�� properties�� ����
		ResourceBundle regexHome = ResourceBundle.getBundle(path);
//		keySet�� ������
		Set<String> regexIndexSet = new TreeSet<String>(regexHome.keySet());
//		�ε����� ���� Set�� �ݺ��� �� �ְ� Iterator ����
		Iterator<String> it = regexIndexSet.iterator();
		int count = 1;
		while(it.hasNext()) {
			String regexIndex = it.next();
			String regex = regexHome.getString(regexIndex);
			
//			format�� 000���� �����ϰ� index�� ���� 00n ���·� �����
//			������ ����� ���� �ʾ� �ٸ� ��� ����ؾ��� -> Set�� TreeSet���� ����
//			regexIndex = new DecimalFormat("000").format(count) + regexIndex;
			
			regularForm.put(regexIndex, regex);
			count++;
			
		}
		
	}
	
	public Map<String, String> getForm() {
		return this.regularForm;
	}
	
	
}
