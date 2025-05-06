package striver.stackQueue;

import java.util.Stack;

public class InfixToPostfix {

    static int getPriority(Character c){
        if(c=='^')
            return 3;
        else if(c=='*' || c=='/')
            return 2;
        else if(c=='+' || c=='-')
            return 1;
        return -1;
    }

    static String fun(String s){
        String res="";
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if((c>='A' && c<='Z')||(c>='a' && c<='z') || (c>='0' && c<='9')){
                res+=c;
            }
            else if(c=='(')
                stack.push('(');
            else if(c==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    res+=stack.pop();
                }
                stack.pop(); //removed (
            }
            else{
                while(!stack.isEmpty() && getPriority(c)<=getPriority(stack.peek())){
                    res+=stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
            res+=stack.pop();
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fun("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
