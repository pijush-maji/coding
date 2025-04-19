package striver.recursion;


//https://leetcode.com/problems/valid-parenthesis-string/description/
public class ValidParenthesisString {

    private static boolean isValid(String s, int index,int cnt){
        if(cnt<0)
            return false;
        if(index==s.length())
            return cnt==0;
        if(s.charAt(index)=='(')
            return isValid(s,index+1,++cnt);
        else if(s.charAt(index)==')')
            return isValid(s,index+1,--cnt);
        return isValid(s,index+1,++cnt) || isValid(s,index+1,--cnt) ||
                isValid(s,index+1,cnt);
    }

    public static void main(String[] args) {
        System.out.println(isValid(")((*))",0,0));
    }
}
