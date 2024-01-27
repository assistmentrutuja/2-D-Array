package com.rutuja;

import java.util.Arrays;

public class Search2D {

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {50, 34, 28, 56}, {45, 78, 345}};
        int target = 78;
        int[] b = search(arr, target);
        System.out.println(Arrays.toString(b));
    }

    static int[] search(int[][] a, int target) {
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
