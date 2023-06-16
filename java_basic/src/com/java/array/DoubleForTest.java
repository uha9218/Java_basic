package com.java.array;

public class DoubleForTest {

	public static void main(String[] args) {
		
		int[][] box = {
							{1,2,3},
							{4,5,6},
							{7,8,9}
						};
		
		
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(box[row][col]);
			}
			System.out.println("");		}
		
		System.out.println("");
		
		for(int col=0;col<3;col++) {
			for(int row=0;row<3;row++) {
				System.out.print(box[row][col]);
			}
			System.out.println("");		}

	}

}
