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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> qu= new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root ==null) return res;
        qu.add(root);
        while(qu.size()!=0)
        {
            
            double no_of_ele=qu.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<no_of_ele;i++)
            {
                TreeNode node=qu.poll();
                level.add(node.val);
                if(node.left!=null)
                {
                    qu.add(node.left);
                }
                if (node.right!=null)
                {       
                    qu.add(node.right);
                }
            }
            res.add(level);

        }
        return res;

        
    }
}
    
