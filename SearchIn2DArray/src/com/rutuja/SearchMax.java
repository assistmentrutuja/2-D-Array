package com.rutuja;

import java.sql.Array;
import java.util.Arrays;

public class SearchMax {

    public static void main(String[] args) {
      int[][]a= {{10,60,80},{8,68,30},{52,74,70}};
      int b=search(a);
      System.out.println(b);
      
      
    }
    static int search(int[][] arr) {
    	int max=Integer.MIN_VALUE;
    	for(int row=0;row<arr.length;row++) {
    		for(int col=0;col<arr[row].length;col++) {
    			
    			if(arr[row][col]>max) {
    				max=arr[row][col];
    			}
    		}
    		
    	}
		return max;
    }
}

