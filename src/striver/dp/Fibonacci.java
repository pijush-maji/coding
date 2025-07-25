package striver.dp;

import java.util.Arrays;

public class Fibonacci {

    public static int getFibonacci(int n,int[] dp){
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        int res =getFibonacci(n-1,dp)+getFibonacci(n-2,dp);
        dp[n]=res;
        return res;
    }

    public static void main(String[] args) {
        int n=7;
        int[] dp = new int[n+1]; // as fibonacci starts with 0
        Arrays.fill(dp,-1);
        System.out.println(getFibonacci(n,dp));
    }
}
