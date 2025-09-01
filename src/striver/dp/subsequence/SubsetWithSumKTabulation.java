package striver.dp.subsequence;

public class SubsetWithSumKTabulation {

    public static void main(String[] args) {
        System.out.println(subsetSumToK(4,5,new int[]{4,3,2,1}));
    }

    public static boolean subsetSumToK(int n, int k, int[] arr){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        for(int i=0;i<n;i++)
            dp[i][0]=1;
        if(arr[0]<=k)
            dp[0][arr[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=k;j++){
                boolean notTake = dp[i-1][j]==1;
                boolean take = false;
                if(j>=arr[i])
                    take=dp[i-1][j-arr[i]]==1;
                dp[i][j]=take || notTake?1:0;
            }
        }
        return dp[n-1][k]==1;
    }
}
