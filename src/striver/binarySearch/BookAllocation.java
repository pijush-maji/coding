package striver.binarySearch;

import java.util.ArrayList;

// Problem link - https://www.codingninjas.com/studio/problems/allocate-books_1090540?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class BookAllocation {
	
	public static int findPages(ArrayList<Integer> arr, int n, int m) {
		if(n<m)
			return -1;
		int low=Integer.MIN_VALUE,high=0;
		for(Integer i:arr) {
			low=Math.max(low, i);
			high+=i;
		}
		while(low<=high) {
			int mid=low-(low-high)/2;
			int cnt=1,maxPages=0,currentPages=0;
			for(int i=0;i<n;i++) {
				if(currentPages+arr.get(i)<=mid) {
					currentPages+=arr.get(i);
				}
				else {
					currentPages=arr.get(i);
					cnt++;
				}
			}
			if(cnt<=m)
				high=mid-1;
			else
				low=mid+1;
		}
		return low;
	}
	
	
	public static int findPagesBruteForce(ArrayList<Integer> arr, int n, int m) {
		if(n<m)
			return -1;
		int low=Integer.MIN_VALUE,high=0;
		for(Integer i:arr) {
			low=Math.max(low, i);
			high+=i;
		}
		for(int i=low;i<=high;i++) {
			int maxPage=0,currentPage=0,cnt=1;
			for(int j=0;j<n;j++) {
				if(currentPage+arr.get(j)<i) {
					currentPage+=arr.get(j);
				}
				else {
					currentPage=arr.get(j);
					cnt++;
				}
				maxPage=Math.max(maxPage, currentPage);
				
			}
			if(cnt==m)
				return maxPage;
		}
		return -1;
    }

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(17);
		l.add(14);
		l.add(9);
		l.add(15);
		l.add(9);
		l.add(14);
		System.out.println(findPages(l, l.size(), 7));
	}

}
