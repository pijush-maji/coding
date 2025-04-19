package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArraysWithSumK {

	static List<List<Integer>> res;

	public static void fun(int ind, int[] a, List<Integer> list, long k, long sum) {
		if (sum == k) {
			List<Integer> t = new ArrayList<>();
			t.addAll(list);
			res.add(t);
			return;
		}
		if (sum > k || ind >= a.length)
			return;
		list.add(a[ind]);
		sum += a[ind];
		fun(ind + 1, a, list, k, sum);
		list.remove(Integer.valueOf(a[ind]));
		sum -= a[ind];
		fun(ind + 1, a, list, k, sum);
	}

	public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {
		// Write your code here
		res = new ArrayList<>();
		fun(0, a, new ArrayList<>(), k, 0);
		return res;

	}

	public static void main(String[] args) {
		System.out.println(subarraysWithSumK(new int[] {1,2,3,1,1,1},3));
	}

}
