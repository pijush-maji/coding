package CodePractice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author pijush
 * 
 *         problem link -
 *         https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/?envType=study-plan-v2&envId=programming-skills
 *
 */

public class ArithmeticProgression {

	public static boolean check(int[] arr) {
		
		int min = arr[0],max=arr[0];
		
		for(Integer i : arr) {
			if(min>i) {
				min = i;
			}
			if(max<i) {
				max=i;
			}
		}
		
		int diff = (max-min)/(arr.length-1);
		return true;
	}

	public static void main(String[] args) {
		int[] ar = { 0,0,0,0 };
		System.out.println(check(ar));
	}
}
