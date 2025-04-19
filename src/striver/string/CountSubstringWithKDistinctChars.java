package striver.string;

import java.util.Objects;
import java.util.stream.Collectors;

public class CountSubstringWithKDistinctChars {

    static int countSubstr(String s, int k) {
        // your code here
        if(s.length()<k)
            return 0;
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+k;j<=s.length();j++){
                StringBuilder sb = new StringBuilder();
                s.substring(i,j).chars().distinct().forEach(r->sb.append((char)r));
                if(sb.length()==k)
                    cnt++;
                if(sb.length()>k)
                    break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countSubstr("aba",2));
    }
}
