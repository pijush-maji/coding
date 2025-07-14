package test;

import java.util.HashMap;
import java.util.Map;
//It's asked in Pelatro R1 interview
//Find the min len of substring of s which contains all the chars of t, it's not necessary to maintain the order of t
public class TreeManupulation {
    static Map<Character,Integer> map = new HashMap<>();
    public static boolean contains(String t){
        for(Character c:t.toCharArray()){
            if(!map.containsKey(c))
                return false;
        }
        return true;
    }
    //.s = "ADOBECODEBANC", t = "ABC"
    public static int fun(String s,String t){ //l=0 r = 5 res = 6
        int l = 0,r=l+t.length()-1;
        int res = Integer.MAX_VALUE;
        for(int i=l;i<r;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        while(l<r-t.length() && r<s.length()){
            if(!contains(t)){
                r++;
                map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            }else{
                res=Math.min(res,r-l+1);
                if(map.containsKey(s.charAt(l))) {
                    if (map.get(s.charAt(l)) > 1)
                        map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    else
                        map.remove(s.charAt(l));
                }
                l++;
            }
        }
        return res;
    }


}
