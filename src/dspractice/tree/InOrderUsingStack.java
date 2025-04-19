package dspractice.tree;

import java.util.Stack;

public class InOrderUsingStack {
	
	/*
	 * static void inOrder(Node root) { Stack<Node> stack = new Stack<>();
	 * stack.add(root); while(!stack.isEmpty()) { Node temp = stack.peek();
	 * if(temp.left!=null) stack.add(temp.left);
	 * 
	 * else { temp=stack.pop(); System.out.println(temp.data); if(stack.isEmpty())
	 * break; temp=stack.pop(); if(temp.right!=null) {
	 * System.out.println(temp.data); stack.add(temp.right); } } } }
	 */
	
	static void inOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		
		
		Node temp = root;
		while(true) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}
			else {
				if(stack.empty())
					break;
				temp=stack.pop();
				System.out.println(temp.data);
				temp=temp.right;
			}
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
		inOrder(root);
	}

}
