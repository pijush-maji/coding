package dspractice.tree;

public class PreOrderTravarsalRecursion {
	
	public static void preOrder(Node root) {
		if(root==null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
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
