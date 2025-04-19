package striver.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	static int[] arr= {2,8,1,90,41,5};
	
	static void sort(int[] arr) {	
		int n = arr.length,temp;
		for(int i=0;i<n-1;i++) {
			int minPosition=i,j=i+1;
			while(j<n) {
				if(arr[j]<arr[minPosition]) {
					minPosition=j;
				}
				j++;
			}
			temp=arr[minPosition];
			arr[minPosition]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
