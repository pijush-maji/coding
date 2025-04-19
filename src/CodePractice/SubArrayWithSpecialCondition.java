package CodePractice;

import java.util.*;

public class SubArrayWithSpecialCondition {

    static int fun(int[] arr,int k){
            int n = arr.length;
            List<int[]> result = new ArrayList<>();
            int minLength = Integer.MAX_VALUE;

            int start = 0;
            int currentOr = 0;

            for (int end = 0; end < n; end++) {
                currentOr |= arr[end]; // Extend the window by including arr[end]

                // Shrink the window while maintaining the condition
                while (currentOr >= k) {
                    // Update the minimal length and record the subarray
                    if (end - start + 1 < minLength) {
                        minLength = end - start + 1;
                        result.clear(); // Clear previous subarrays since we found shorter ones
                        result.add(new int[]{start, end});
                    } else if (end - start + 1 == minLength) {
                        result.add(new int[]{start, end});
                    }

                    currentOr ^= arr[start]; // Remove arr[start] from the OR
                    start++;
                }
            }

            return result.size();

        }

    public static void main(String[] args) {
        System.out.println(fun(new int[]{1,2,7},7));
    }
}
