package dspractice.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderUsing1Stack {

	static List<Integer> postOrder(Node root){
		List<Integer> list = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		
		Node temp = root;
		
		while(true) {
			if(temp!=null) {
				stack.push(temp);
				temp=temp.left;
			}
			else {
				if(stack.empty()) {
					break;
				}
				temp = stack.pop();
				list.add(temp.data);
				if(stack.empty()) {
					break;
				}
				temp=stack.peek();
				if(temp.right!=null) {
					temp=temp.right;
					stack.push(temp);
				}
				else {
					list.add(stack.pop().data);
				}
			}
		}
		return list;
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
		System.out.println(postOrder(root));
	}
}
