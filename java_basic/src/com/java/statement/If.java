package com.java.statement;

public class If {

	public static void main(String[] args) {
		
		String str = null;
		/*
		 * ���� : null�� ���̸� �޾ƿ� �� ���� 
		 * if(str.length()>0&&str!=null) {
		 * System.out.println("���ڿ��� ���� : "+str.length()); }
		 */

		// str!=null�� ���� �Ǵ��ϱ� ������ ���� �ȳ�
		if (str != null && str.length() > 0) {
			System.out.println("���ڿ��� ���� : " + str.length());
		}

		int k = 3;
		boolean result;
		result = k > 5 && (k = 7) < 5;
		System.out.println(result + " " + k);

		result = (k = 7) < 5 && k > 5;
		System.out.println(result + " " + k);
		
		

	}

}
