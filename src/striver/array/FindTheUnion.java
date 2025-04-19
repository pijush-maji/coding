package striver.array;

import java.util.ArrayList;
import java.util.List;

public class FindTheUnion {
	
	public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int m=a.length;
        int n=b.length;
        int i=0,j=0;
        List<Integer> res = new ArrayList<>();
        while(i<m&&j<n){
        	if(!res.isEmpty()) {
        		if(res.get(res.size()-1)==a[i]) {
        			i++;
        			continue;
        		}
        		if(res.get(res.size()-1)==b[j]) {
        			j++;
        			continue;
        		}
        	}
        	if(a[i]==b[j]) {
        		res.add(a[i]);
        		i++;
        		j++;
        	}
        	else if(a[i]<b[j]) {
        		res.add(a[i++]);
        	}
        	else {
        		res.add(b[j++]);
        	}
        }
        
        while(i<m){
        	if(!res.isEmpty()) {
        		if(res.get(res.size()-1)==a[i]){
        			i++;
        			continue;
        		}
        	}
            res.add(a[i]);
            i++;
        }
        while(j<n){
        	if(res.get(res.size()-1)==b[j]) {
    			j++;
    			continue;
    		}
            res.add(b[j]);
            j++;
        }
        return res;

    }

	public static void main(String[] args) {
		int[] a = {3, 3, 4, 5, 6, 7, 8, 9, 9, 9};
		int[] b = {2, 4, 10, 10};
		System.out.println(sortedArray(a,b));

	}

}
