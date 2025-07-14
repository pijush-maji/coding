package striver.tree.bst;

import striver.tree.TreeNode;

public class FindKthSmallest {

    static int cnt=0,ans=-1;
    public static int kthSmallest(TreeNode root, int k) {
        if(root==null || ans!=-1)
            return ans;
        kthSmallest(root.left,k);
        if(++cnt==k){
            ans = root.val;
            System.out.println(ans);
        }
        kthSmallest(root.right,k);
        return ans;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(6);
        TreeNode t1 = new TreeNode(3);
        t1.right = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t1.left = t2;
        root.left=t1;
        kthSmallest(root,3);
    }
}
