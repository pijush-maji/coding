package striver.array;

import java.util.Arrays;

public class RotateArrayInPlace {
	
	static int[] reverse(int[] nums,int s,int e){
        int temp;
        while(s<e){
            temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
        return nums;
    }

    public static void rotate(int[] nums, int k) {
        if(nums.length==1 || k==0)
            return;
        k=k%nums.length;
        int m=k-1,n=k;
        if(nums.length%2==0){
            m=k-1;
            n=k;
        }
        nums=reverse(nums,0,m);
        nums=reverse(nums,n,nums.length-1);
//        nums=reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		rotate(arr,2);
	}

}
