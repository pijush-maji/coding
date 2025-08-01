package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

    List<List<Integer>> res;

    public void printSq(int i, int n, List<Integer> list,int[] nums){
        if(i>=n) {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        printSq(i+1,n,list,nums);
        list.remove(Integer.valueOf(nums[i]));
        printSq(i+1,n,list,nums);
    }
    public void find(int[] nums){
        res = new ArrayList<>();
        printSq(0,nums.length,new ArrayList<>(),nums);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        PrintAllSubsequences obj = new PrintAllSubsequences();
        obj.find(nums);
    }
}
