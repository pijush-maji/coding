package leetCode.pod;

import dspractice.tree.Node;

public class SumOfLeftLeaves {
	
	public static int getLeftSum(Node root,int sum){

        if(root.left==null && root.right==null)
            return sum+root.data; 
        if(root.left!=null)
            sum=getLeftSum(root.left,sum);
        if(root.right!=null && (root.right.left!=null || root.right.right!=null)){
            sum = getLeftSum(root.right,sum);
        }
        return sum;
    }
    public static int sumOfLeftLeaves(Node root) {
        if(root==null || (root.left==null && root.right==null))
            return 0;
        return getLeftSum(root,0);
    }

	public static void main(String[] args) {
		Node root = new Node(1);
		Node l1= new Node(2);
		root.left=l1;
//		Node l2= new Node(20);
//		root.right=l2;
//		Node l3= new Node(15);
//		l2.left=l3;
//		Node l4= new Node(7);
//		l2.right=l4;
//		
		System.out.println(sumOfLeftLeaves(root));
	}

}
