public class Solution {
    public boolean isBalanced(TreeNode root) {
        return (maxDepth(root)-minDepth(root) <= 1);
        
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    
    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}

/*
class Solution {
    private boolean check = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return check;
    }
    
    private int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int diff = Math.abs(left - right);
        
        if(diff > 1) {
            check = false;
        }
        
        return 1 + Math.max(left, right);
    }
}
*/
