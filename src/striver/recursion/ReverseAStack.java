package striver.recursion;

import java.util.Stack;

public class ReverseAStack {
	
	public static void insertLast(int x,Stack<Integer> stack) {
		if(stack.isEmpty())
			stack.push(x);
		else {
			int p = stack.pop();
			insertLast(x,stack);
			stack.push(p);
		}
	}
	
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()) return ;
		else {
			int p = stack.pop();
			reverseStack(stack);
			insertLast(p,stack);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		//insertLast(1, st);
		reverseStack(st);
		System.out.println(st);

	}

}
