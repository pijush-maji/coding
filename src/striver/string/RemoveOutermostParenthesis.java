package striver.string;

import java.util.Stack;

public class RemoveOutermostParenthesis {

    static String remove(String s){
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int c = 0;
        for(int i=1;i<=arr.length;i++){
            if(arr[i]=='(') {
                sb.append('(');
                c++;
            }
            else{
                if(c==0)
                    i++;
                else{
                    sb.append(')');
                    c--;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(remove("(()())(())"));
    }
}
