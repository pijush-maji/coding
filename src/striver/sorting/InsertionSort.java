package striver.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] arr = {2,8,1,90,41,5,-10};
	
	static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
