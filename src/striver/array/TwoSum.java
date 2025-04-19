package striver.array;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TwoSum {
	
	static int[] sum_Better(int[] arr,int t) {
		Map<Integer, Integer> map = new TreeMap<>();
		int res[] = new int[2];
		for(int i=0;i<arr.length;i++) {
			int r = t-arr[i];
			if(map.get(r)!=null) {
				res[0]=map.get(r);
				res[1]=i;
				break;
			}
			else {
				map.put(arr[i], i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		int[] arr= {3,3};
		int t = 6;
		System.out.println(Arrays.toString(sum_Better(arr,t)));
	}

}
