package striver.stackQueue;

import java.util.Stack;

public class CheckBalancedParenthesis {

    static boolean fun(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                Character temp = stack.pop();
                if((c==')' && temp!='(') || (c=='}' && temp!='{') || (c==']' && temp!='['))
                    return false;

            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(fun("{[]}]"));
    }
}
