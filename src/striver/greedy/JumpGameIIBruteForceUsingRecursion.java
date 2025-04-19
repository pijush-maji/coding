package striver.greedy;

//https://leetcode.com/problems/jump-game-ii/description/
public class JumpGameIIBruteForceUsingRecursion {
    static int fun(int nums[],int positon,int cnt){
        if(positon>=nums.length-1)
            return cnt;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=nums[positon];i++){
            min = Math.min(min,fun(nums,positon+i,cnt+1));
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(fun(new int[]{2,3,1,1,4},0,0)) ;
    }
}
