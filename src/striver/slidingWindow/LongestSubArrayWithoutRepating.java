package striver.slidingWindow;

import java.util.HashMap;
import java.util.Map;

//Problem link - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubArrayWithoutRepating {
	
	public static int lengthOfLongestSubstring(String s) {
		if(s.length()==1)
            return 1;
        Map<Character,Integer> map = new HashMap<>();
        int len=0;
        int left=0,right=0;
        while(right<s.length()) {
        	if(map.containsKey(s.charAt(right)))
        		left=Math.max(map.get(s.charAt(right))+1,left);
        	map.put(s.charAt(right),right);
        	len=Math.max(len,right-left+1);
        	right++;
        	
        }
        return len;
	}

	public static int lengthOfLongestSubstringBRUTEFORCE(String s) {
        int len=0;
        int i=0,j=1;
        while(i<s.length()&&j<s.length()) {
        	int flag=0;
        	for(int k=i;k<j;k++) {
        		if(s.charAt(k)==s.charAt(j)) {
        			i++;
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0) {
        		j++;
        		len=Math.max(len, j-i);
        	}
        }
        return len;
    }
	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

}
