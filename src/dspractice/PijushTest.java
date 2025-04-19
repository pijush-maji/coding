package dspractice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PijushTest {

    static boolean fun(int arr[]){
        if(arr.length<3)
            return false;
        //boolean inc=false;
        boolean dc=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                if(dc){
                    return false;
                }

            }else if(arr[i+1]<arr[i]){
                dc=true;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //2,3,4,5,8,7,6,5,9,2
        int arr[] = {1,6,5,4,3,2,1,0};
        System.out.println(fun(arr));

        String s = "Pijush Kanti Maji";

        Map<Character,Integer> map = new HashMap<>();
        for(Character c:s.toCharArray()){
            if(c==' ')
                continue;
            map.put(c,map.getOrDefault(c,0)+1);
        }
//        for(Map.Entry<Character,Integer> m: map.entrySet()){
//            System.out.println(m.getKey()+"->"+m.getValue());
//        }

        s.chars().filter(c->c!=' ').mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println(k+"->"+v));

    }
}
