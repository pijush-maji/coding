package striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	
	static List<String> res = new ArrayList<>();
    //on-> Open Count
    //cn-> Close Count
    public static void fun(int n,int on,int cn,String s){
        if(on==cn && on==n){
            res.add(s);
            return;
        }
        if(on<n){
            s+="(";
            on++;
            fun(n,on,cn,s);
            s=s.substring(0, s.length()-1);
            on--;
        }
        if(cn<on){
            s+=")";
            cn++;
            fun(n,on,cn,s);
            s=s.substring(0, s.length()-1);
            cn--; 
        }
    }
    public static List<String> generateParenthesis(int n) {
        if(n==1){
            res.add("()");
            return res;
        }
        fun(n,0,0,"");
        return res;
    }

	public static void main(String[] args) {

		System.out.println(generateParenthesis(3));
	}

}
