package dspractice.tree;

import java.util.Stack;

public class PreOrderUsingStack {
	
	static void preOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.add(root);
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.println(temp.data);
			if(temp.right!=null)
				stack.add(temp.right);
			if(temp.left!=null)
				stack.add(temp.left);
		}
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node l1= new Node(2);
		root.left=l1;
		Node l2= new Node(3);
		root.right=l2;
		Node l3= new Node(4);
		l1.left=l3;
		Node l4= new Node(5);
		l1.right=l4;
		Node l5= new Node(6);
		l2.left=l5;
		Node l6= new Node(7);
		l2.right=l6;
		preOrder(root);
	}

}
