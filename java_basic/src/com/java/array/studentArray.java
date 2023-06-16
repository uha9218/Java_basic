package com.java.array;

public class studentArray {

	public static void main(String[] args) {
		
		String[] studentNum= {"1234","5678"};
		String[] name= {"김세훈","이원진"};
		int[] grade= {1,2};
		String[] major= {"그린","테크"};
		String[] birth= {"1999-08-05","1996-10-26"};
		String[] address= {"대전 서구","서울 강남구"};
		String[] contact= {"010-1234-5678","010-9876-5432"};
		String[] state= {"휴학","졸업"};
		
		System.out.println("학번\t이름\t학년\t전공\t생년월일\t주소\t\t연락처\t\t상태");
		
		for(int i=0;i<studentNum.length;i++) {
			System.out.printf("%s\t%s\t%d\t%s\t%s\t%s\t%s\t%s\n",studentNum[i],name[i],grade[i],major[i],birth[i],address[i],contact[i],state[i]);
		}
		
	

	}

}
