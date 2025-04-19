package dspractice.tree;


public class PostOrderTraversalRecursion {
	
	public static void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
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
		
		postOrder(root);
		
	}

}
