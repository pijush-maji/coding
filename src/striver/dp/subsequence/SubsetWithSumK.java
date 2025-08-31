package striver.dp.subsequence;

import java.util.Arrays;

public class SubsetWithSumK {
    public static boolean fun(int i, int k, int arr[],int[][] dp){
        if(k==0)
            return true;
        if(i==0)
            return arr[0]==k;
        if(dp[i][k]!=-1)
            return dp[i][k]==1;
        boolean notTake = fun(i-1,k,arr,dp);
        boolean take = false;
        if(k>=arr[i])
            take=fun(i-1,k-arr[i],arr,dp);
        if(take || notTake)
            dp[i][k]=1;
        else
            dp[i][k]=0;
        return take || notTake;
    }

    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n+1][k+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return fun(n-1,k,arr,dp);
    }

    public static void main(String[] args) {
        System.out.println(subsetSumToK(4,4,new int[]{6,1,2,1}));
    }
}
