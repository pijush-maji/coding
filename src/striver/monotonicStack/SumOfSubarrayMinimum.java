package striver.monotonicStack;

import java.util.Stack;

public class SumOfSubarrayMinimum {

    static int[] getNge(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                nge[i]=n;
                stack.push(i);
                continue;
            }
            while(!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.empty())
                nge[i]=n;
            else
                nge[i]=stack.peek();
            stack.push(i);
        }
        return nge;
    }
    //previous greater or equal
    static int[] getPgee(int[] arr){
        int n = arr.length;
        int[] pgee = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(i==0){
                pgee[i]=-1;
                stack.push(i);
                continue;
            }
            while(!stack.empty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            if(stack.empty())
                pgee[i]=-1;
            else
                pgee[i]=stack.peek();
            stack.push(i);
        }
        return pgee;
    }
    public static int sumSubarrayMins(int[] arr) {
        int[] nge = getNge(arr);
        int[] pgee = getPgee(arr);
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=(res+(nge[i]-i)*(i-pgee[i])*arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        sumSubarrayMins(arr);
    }
}
