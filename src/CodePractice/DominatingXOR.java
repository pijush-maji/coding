package CodePractice;

import java.util.Arrays;
import java.util.List;

public class DominatingXOR {
	
	static long dominatingpair(List<Integer> arr) {
		int n =arr.size();
		long cnt=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int a=arr.get(i)^arr.get(j);
				int b=arr.get(i)&arr.get(j);
				if(a>b)
					cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,3,5,2);
		System.out.println(dominatingpair(list));
	}

}
