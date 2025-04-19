package striver.array;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {

	static int majority(int[] nums) {
		Map<Integer, Integer> map = new TreeMap<>();
        int k;
        if(nums.length%2==0)
            k=nums.length/2;
        else{
            k=nums.length/2;
            k++;
        }
        for(Integer i:nums){
            if(map.get(i)!=null){
                int t=map.get(i);
                map.put(i,t+1);
            }else{
                map.put(i,1);
            }
        }
        for(Integer i:map.keySet()) {
        	if(map.get(i)==k)
        		return i;
        }
        return 0;
	}
	
	public static void main(String[] args) {
		int[] a = {3,2,3};
		System.out.println(majority(a));
	}
}
