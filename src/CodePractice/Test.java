package CodePractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import striver.linkedlist.Node;

public class Test {

	public static int myAtoi(String s) {
        long res=0;
        int ind=0,numInx=0;
        int max=(int)Math.pow(2,31);
        int min = (int)Math.pow(-2,31);
        if(s.isEmpty())
            return 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ')
                continue;
            if(res==0) {
                if(c=='-'){
                    ind=-1;
                    continue;
                } else if(c=='+'){
                    ind=1;
                    continue;
                }
            }
            if((res!=0 || numInx==1) &&(c=='+'||c=='-'))
                return 0;
            if(c>=48 && c<=57){
            	numInx=1;
            	res=res*10+Character.getNumericValue(c);
            }else{
                break;
            }
        }
        //System.out.println(min);
        if(ind==0)
            ind=1;
        res=res*ind;
        if(res<min){
            res=min;
        }
        if(res>max){
            res=max;
        }
        return (int)res;
    }
	public static void main(String[] args) {
		int arr[] = new int[]{3,1,6,2};
        Arrays.sort(arr);
        System.out.println(myAtoi("00000-42a1234"));
	}

}
