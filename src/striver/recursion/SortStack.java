package striver.recursion;

import java.util.Stack;

public class SortStack {
	
	public static void insert(int x, Stack<Integer> stack){
		if(stack.isEmpty())
			stack.push(x);
		else{
			int p = stack.pop();
			if(p>=x){
				stack.push(p);
				stack.push(x);
			}else{
				insert(x, stack);
				stack.push(p);
			}
		}
	}
	
	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> st = new Stack<>();
		while(!s.isEmpty()) {
			insert(s.pop(),st);
		}
		return st;
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(4);
		st.push(2);
		//insertLast(1, st);
		
		System.out.println(sort(st));
		
		
	}

}
