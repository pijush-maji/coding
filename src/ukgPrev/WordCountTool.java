package ukgPrev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCountTool {

    static boolean isValid(String s){
        if(s.length()<3)
            return false;
        Pattern pattern = Pattern.compile(
                "^(?=.*[aeiouAEIOU])(?=.*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ])[a-zA-Z0-9]+$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    static int countValidWord(String s){
        if(s.length()==0)
            return 0;
        int cnt = 0;
        String[] arr = s.split(" ");
        for(String t:arr){
            if(isValid(t))
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s="This is an example string 234";
        System.out.println(countValidWord(s));
//        System.out.println(isValid("2345"));
    }
}
