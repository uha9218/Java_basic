package com.java.array;

public class studentArray {

	public static void main(String[] args) {
		
		String[] studentNum= {"1234","5678"};
		String[] name= {"�輼��","�̿���"};
		int[] grade= {1,2};
		String[] major= {"�׸�","��ũ"};
		String[] birth= {"1999-08-05","1996-10-26"};
		String[] address= {"���� ����","���� ������"};
		String[] contact= {"010-1234-5678","010-9876-5432"};
		String[] state= {"����","����"};
		
		System.out.println("�й�\t�̸�\t�г�\t����\t�������\t�ּ�\t\t����ó\t\t����");
		
		for(int i=0;i<studentNum.length;i++) {
			System.out.printf("%s\t%s\t%d\t%s\t%s\t%s\t%s\t%s\n",studentNum[i],name[i],grade[i],major[i],birth[i],address[i],contact[i],state[i]);
		}
		
	

	}

}
