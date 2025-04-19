package striver.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicCheckLC {

    static boolean fun(String s, String t){

        Map<Character,Character> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)){
                if(!map.containsValue(c2))
                    map.put(c1,c2);
                else
                    return false;
            }else if(map.get(c1)!=c2)
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fun("eff","add"));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
