package dspractice.tree;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {
	
	
	
	public static void levelOrder(Node root) {
		if(root==null) return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.data);
			
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
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
		
		levelOrder(root);
		
	}

}
