package leetCode.pod;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> s1; // temp stack
	Stack<Integer> s2;

	public MyQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		if (!s2.empty()) {
			s1 = new Stack<>();
			while(!s2.empty()) {
				s1.push(s2.pop());
			}
			s2.push(x);
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
		} else {
			s2.push(x);
		}
	}

	public int pop() {
		return s2.pop();
	}

	public int peek() {
		return s2.peek();
	}

	public boolean empty() {
		return s2.empty();
	}
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */
