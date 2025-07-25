package striver.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Lc - 403
public class FrogJump {

    Map<Integer,Integer> map;
    int[][] dp;
    //curr ->currentStoneIndex, k=previousJump
    private boolean check(int curr,int k,int[] stones){
        if(curr==stones.length-1)
            return true;
        if(dp[curr][k]!=-1){
            return dp[curr][k]==1;
        }
        boolean left = false,root=false,right=false;
        if(k>1 && map.containsKey(stones[curr]+k-1))
            left = check(map.get(stones[curr]+k-1),k-1,stones);
        if(map.containsKey(stones[curr]+k))
            root = check(map.get(stones[curr]+k),k,stones);
        if(map.containsKey(stones[curr]+k+1))
            right = check(map.get(stones[curr]+k+1),k+1,stones);
        dp[curr][k]=left||root||right?1:0;
        return dp[curr][k]==1;

    }
    public boolean canCross(int[] stones) {
        if(stones[1]-stones[0]!=1)
            return false;
        map = new HashMap<>();
        dp = new int[stones.length][stones.length];;
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],i);
        }
        return check(1,1,stones);
    }

    public static void main(String[] args) {
        FrogJump obj = new FrogJump();
        int[] stones = new int[] {0,1,3,5,6,8,12,17};
        System.out.println(obj.canCross(stones));
    }
}
