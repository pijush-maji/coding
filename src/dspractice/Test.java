package dspractice;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(1,20);
        map.put(23,100);
        map.put(50,100);
        int inx=-1;
        for(Map.Entry entry: map.entrySet()){
            if(entry.getValue().equals(20)){
                if(inx==-1)
                    inx=(int)entry.getKey();
                else
                    inx=Math.min(inx,(int)entry.getKey());
            }
        }
        System.out.println(inx);
    }
}
