package com.rutuja;

public class SearchMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]c= {{10,70,40},{45,72,97},{20,60,500}};
		int b=search(c);
		System.out.println(b);
	

	}
	static int search(int[][]arr) {
		int min=Integer.MAX_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<min)
					min=arr[row][col];
			}
		}
		return min;
	}

}
