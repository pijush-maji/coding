package striver.tree.bst;

import striver.tree.TreeNode;

public class RecoverBSTreeLC99 {
    static TreeNode first;
    static TreeNode middle;
    static TreeNode last;
    static TreeNode pre;

    public static void check(TreeNode root){
        if(root==null || last!=null)
            return;
        check(root.left);
        if(pre!=null && pre.val>root.val){
            if(first==null){
                first=pre;
                middle=root;
            }else{
                last=root;
            }
        }
        pre=root;
        check(root.right);
    }
    public static void recoverTree(TreeNode root) {

        if(root!=null){
            check(root);
            if(last==null){
                int temp =first.val;
                first.val=middle.val;
                middle.val=temp;
            }else{
                int temp =first.val;
                first.val=last.val;
                last.val=temp;
            }
        }
    }


    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode t1 = new TreeNode(3);
//        t1.right = new TreeNode(2);
//        root.left = t1;
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(2);
        root.right = t1;
        recoverTree(root);
    }
}
