package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
	
	public static void subs(int i,int nums[],List<Integer> list,List<List<Integer>> res) {
		if(i>=nums.length) {
			List<Integer> t = new ArrayList<>();
			t.addAll(list);
			res.add(t);
			return;
		}
		list.add(nums[i]);
		subs(i+1,nums,list,res);
		list.remove(Integer.valueOf(nums[i]));
		subs(i+1,nums,list,res);
	}
	
	public static List<List<Integer>> subset(int nums[]){
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		subs(0,nums,list,res);
		return res;
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3};
		System.out.println(subset(nums));
	}

}
