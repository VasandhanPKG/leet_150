/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
       TreeNode prev=null;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        inOrder(root);
        return min;
    }
    public  void inOrder(TreeNode curr)
    {   
        if(curr==null) return ;
        inOrder(curr.left);
        if(prev!=null)
        {
            min=Math.min(min,curr.val-prev.val);
        }
        prev=curr;
        inOrder(curr.right);
      
    }
}
