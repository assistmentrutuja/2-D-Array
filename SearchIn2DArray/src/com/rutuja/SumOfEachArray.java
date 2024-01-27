package com.rutuja;

public class SumOfEachArray {

    public static void main(String[] args) {
        int[][] input = {{10, 20, 30}, {50, 60, 70}, {80, 90, 100}};

        // Creating an instance of SumOfEachArray
        SumOfEachArray sumCalculator = new SumOfEachArray();

        // Calling maxWealth method
        int count = sumCalculator.maxWealth(input);
        System.out.println(count);
    }

    public int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
